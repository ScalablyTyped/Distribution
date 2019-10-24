package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.NamespaceId
import typings.gitlab.distSrcCoreServicesNamespacesMod.Namespaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Namespaces", JSImport.Namespace)
@js.native
object distSrcCoreServicesNamespacesMod extends js.Object {
  @js.native
  trait Namespaces extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def show(namespaceId: NamespaceId, options: Anon_Search with Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Namespaces
  
}

