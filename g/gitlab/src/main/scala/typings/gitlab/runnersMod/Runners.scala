package typings.gitlab.runnersMod

import typings.gitlab.anon.projectIdstringnumberPagi
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/Runners", "Runners")
@js.native
class Runners () extends BaseService {
  
  def all(hasProjectIdOptions: projectIdstringnumberPagi): js.Promise[GetResponse] = js.native
  
  def allOwned(): js.Promise[GetResponse] = js.native
  def allOwned(options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  
  def disable(projectId: String, runnerId: Double): js.Promise[js.Object] = js.native
  def disable(projectId: String, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def disable(projectId: Double, runnerId: Double): js.Promise[js.Object] = js.native
  def disable(projectId: Double, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
  
  def edit(runnerId: Double): js.Promise[js.Object] = js.native
  def edit(runnerId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  
  def enable(projectId: String, runnerId: Double): js.Promise[js.Object] = js.native
  def enable(projectId: String, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def enable(projectId: Double, runnerId: Double): js.Promise[js.Object] = js.native
  def enable(projectId: Double, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
  
  def jobs(runnerId: Double): js.Promise[GetResponse] = js.native
  def jobs(runnerId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  
  def remove(runnerId: Double): js.Promise[js.Object] = js.native
  def remove(runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
  
  def show(runnerId: Double): js.Promise[GetResponse] = js.native
  def show(runnerId: Double, options: Sudo): js.Promise[GetResponse] = js.native
}
