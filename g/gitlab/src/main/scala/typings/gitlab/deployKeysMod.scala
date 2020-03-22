package typings.gitlab

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/DeployKeys", JSImport.Namespace)
@js.native
object deployKeysMod extends js.Object {
  @js.native
  class DeployKeys () extends BaseService {
    def add(projectId: String): js.Promise[js.Object] = js.native
    def add(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
    def add(projectId: Double): js.Promise[js.Object] = js.native
    def add(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def all(hasProjectIdOptions: projectIdstringnumberPagi): js.Promise[GetResponse] = js.native
    def edit(projectId: String, keyId: String): js.Promise[js.Object] = js.native
    def edit(projectId: String, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, keyId: String): js.Promise[js.Object] = js.native
    def edit(projectId: Double, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def enable(projectId: String, keyId: String): js.Promise[js.Object] = js.native
    def enable(projectId: String, keyId: String, options: Sudo): js.Promise[js.Object] = js.native
    def enable(projectId: Double, keyId: String): js.Promise[js.Object] = js.native
    def enable(projectId: Double, keyId: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: String, keyId: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, keyId: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, keyId: String): js.Promise[js.Object] = js.native
    def remove(projectId: Double, keyId: String, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: String, keyId: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, keyId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, keyId: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, keyId: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

