package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.NamespaceId
import typings.gitlab.distServicesNamespacesMod.Namespaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Namespaces", JSImport.Namespace)
@js.native
object distServicesNamespacesMod extends js.Object {
  @js.native
  trait Namespaces extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def show(namespaceId: NamespaceId, options: Anon_Search with Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Namespaces
  
}

