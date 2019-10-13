package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distTemplatesMod.ResourceAccessRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ProjectAccessRequests", JSImport.Namespace)
@js.native
object distServicesProjectAccessRequestsMod extends js.Object {
  @js.native
  class default protected () extends ResourceAccessRequests {
    def this(options: BaseServiceOptions) = this()
  }
  
  type ProjectAccessRequests = ResourceAccessRequests
}

