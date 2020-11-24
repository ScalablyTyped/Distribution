package typings.gitlab.environmentsMod

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/Environments", "Environments")
@js.native
class Environments () extends BaseService {
  
  def all(projectId: String): js.Promise[js.Array[EnvironmentSchema]] = js.native
  def all(projectId: String, options: PaginatedRequestOptions): js.Promise[js.Array[EnvironmentSchema]] = js.native
  def all(projectId: Double): js.Promise[js.Array[EnvironmentSchema]] = js.native
  def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[js.Array[EnvironmentSchema]] = js.native
  
  def create(projectId: String): js.Promise[js.Object] = js.native
  def create(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def create(projectId: Double): js.Promise[js.Object] = js.native
  def create(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  
  def edit(projectId: String, environmentId: Double): js.Promise[js.Object] = js.native
  def edit(projectId: String, environmentId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: Double, environmentId: Double): js.Promise[js.Object] = js.native
  def edit(projectId: Double, environmentId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  
  def remove(projectId: String, environmentId: Double): js.Promise[js.Object] = js.native
  def remove(projectId: String, environmentId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def remove(projectId: Double, environmentId: Double): js.Promise[js.Object] = js.native
  def remove(projectId: Double, environmentId: Double, options: Sudo): js.Promise[js.Object] = js.native
  
  def show(projectId: String, environmentId: Double): js.Promise[EnvironmentDetailSchema] = js.native
  def show(projectId: String, environmentId: Double, options: Sudo): js.Promise[EnvironmentDetailSchema] = js.native
  def show(projectId: Double, environmentId: Double): js.Promise[EnvironmentDetailSchema] = js.native
  def show(projectId: Double, environmentId: Double, options: Sudo): js.Promise[EnvironmentDetailSchema] = js.native
  
  def stop(projectId: String, environmentId: Double): js.Promise[js.Object] = js.native
  def stop(projectId: String, environmentId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def stop(projectId: Double, environmentId: Double): js.Promise[js.Object] = js.native
  def stop(projectId: Double, environmentId: Double, options: Sudo): js.Promise[js.Object] = js.native
}
