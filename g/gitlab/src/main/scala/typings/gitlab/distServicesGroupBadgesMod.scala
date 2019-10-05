package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesGroupBadgesMod.GroupBadges
import typings.gitlab.distTemplatesMod.ResourceBadges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/GroupBadges", JSImport.Namespace)
@js.native
object distServicesGroupBadgesMod extends js.Object {
  @js.native
  class default protected () extends GroupBadges {
    def this(options: BaseServiceOptions) = this()
  }
  
  type GroupBadges = ResourceBadges
}

