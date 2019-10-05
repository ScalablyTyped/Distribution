package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distServicesEventsMod.Events
import typings.gitlab.distServicesMod.EventOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Events", JSImport.Namespace)
@js.native
object distServicesEventsMod extends js.Object {
  @js.native
  trait Events extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions with EventOptions): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Events
  
}

