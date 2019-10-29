package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Tags", JSImport.Namespace)
@js.native
object distTypesCoreServicesTagsMod extends js.Object {
  @js.native
  class Tags () extends BaseService {
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: String): js.Promise[js.Object] = js.native
    def create(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: String, tagName: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, tagName: String): js.Promise[js.Object] = js.native
    def remove(projectId: Double, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: String, tagName: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, tagName: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

