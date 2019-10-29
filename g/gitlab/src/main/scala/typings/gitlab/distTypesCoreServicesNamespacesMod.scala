package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Namespaces", JSImport.Namespace)
@js.native
object distTypesCoreServicesNamespacesMod extends js.Object {
  @js.native
  class Namespaces () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def show(namespaceId: String, options: Anon_Search with Sudo): js.Promise[GetResponse] = js.native
    def show(namespaceId: Double, options: Anon_Search with Sudo): js.Promise[GetResponse] = js.native
  }
  
}

