package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distTemplatesMod.ResourceMilestones
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/GroupMilestones", JSImport.Namespace)
@js.native
object distServicesGroupMilestonesMod extends js.Object {
  @js.native
  class default protected () extends ResourceMilestones {
    def this(options: BaseServiceOptions) = this()
  }
  
  type GroupMilestones = ResourceMilestones
}

