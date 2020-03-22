package typings.gitlab

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Namespaces", JSImport.Namespace)
@js.native
object namespacesMod extends js.Object {
  @js.native
  class Namespaces () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def show(namespaceId: String): js.Promise[GetResponse] = js.native
    def show(namespaceId: String, options: searchstringSudo): js.Promise[GetResponse] = js.native
    def show(namespaceId: Double): js.Promise[GetResponse] = js.native
    def show(namespaceId: Double, options: searchstringSudo): js.Promise[GetResponse] = js.native
  }
  
}

