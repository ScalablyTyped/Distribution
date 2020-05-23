package typings.gitlab

import typings.gitlab.anon.todoIdnumberSudo
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Todos", JSImport.Namespace)
@js.native
object todosMod extends js.Object {
  @js.native
  class Todos () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: String, mergerequestId: Double): js.Promise[js.Object] = js.native
    def create(projectId: String, mergerequestId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def create(projectId: Double, mergerequestId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, mergerequestId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def done(hasTodoIdOptions: todoIdnumberSudo): js.Promise[js.Object] = js.native
  }
  
}

