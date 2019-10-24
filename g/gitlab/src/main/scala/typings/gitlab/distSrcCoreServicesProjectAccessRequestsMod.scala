package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreTemplatesMod.ResourceAccessRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/ProjectAccessRequests", JSImport.Namespace)
@js.native
object distSrcCoreServicesProjectAccessRequestsMod extends js.Object {
  @js.native
  class default protected () extends ResourceAccessRequests {
    def this(options: BaseServiceOptions) = this()
  }
  
  type ProjectAccessRequests = ResourceAccessRequests
}

