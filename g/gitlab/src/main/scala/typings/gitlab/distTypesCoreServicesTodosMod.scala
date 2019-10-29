package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Todos", JSImport.Namespace)
@js.native
object distTypesCoreServicesTodosMod extends js.Object {
  @js.native
  class Todos () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: String, mergerequestId: Double): js.Promise[js.Object] = js.native
    def create(projectId: String, mergerequestId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def create(projectId: Double, mergerequestId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, mergerequestId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def done(hasTodoIdOptions: Anon_TodoId with Sudo): js.Promise[js.Object] = js.native
  }
  
}

