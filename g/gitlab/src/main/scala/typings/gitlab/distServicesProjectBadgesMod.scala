package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distTemplatesMod.ResourceBadges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ProjectBadges", JSImport.Namespace)
@js.native
object distServicesProjectBadgesMod extends js.Object {
  @js.native
  class default protected () extends ResourceBadges {
    def this(options: BaseServiceOptions) = this()
  }
  
  type ProjectBadges = ResourceBadges
}

