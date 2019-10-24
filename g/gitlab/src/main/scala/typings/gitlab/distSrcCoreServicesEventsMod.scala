package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreServicesEventsMod.Events
import typings.gitlab.distSrcCoreServicesMod.EventOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Events", JSImport.Namespace)
@js.native
object distSrcCoreServicesEventsMod extends js.Object {
  @js.native
  trait Events extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions with EventOptions): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Events
  
}

