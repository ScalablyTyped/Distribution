package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distTemplatesMod.ResourceMilestones
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ProjectMilestones", JSImport.Namespace)
@js.native
object distServicesProjectMilestonesMod extends js.Object {
  @js.native
  class default protected () extends ResourceMilestones {
    def this(options: BaseServiceOptions) = this()
  }
  
  type ProjectMilestones = ResourceMilestones
}

