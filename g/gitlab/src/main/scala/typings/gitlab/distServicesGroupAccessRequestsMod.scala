package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distTemplatesMod.ResourceAccessRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/GroupAccessRequests", JSImport.Namespace)
@js.native
object distServicesGroupAccessRequestsMod extends js.Object {
  @js.native
  class default protected () extends ResourceAccessRequests {
    def this(options: BaseServiceOptions) = this()
  }
  
  type GroupAccessRequests = ResourceAccessRequests
}

