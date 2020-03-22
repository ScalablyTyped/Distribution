package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceBadges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/GroupBadges", JSImport.Namespace)
@js.native
object groupBadgesMod extends js.Object {
  @js.native
  class GroupBadges protected () extends ResourceBadges {
    def this(options: BaseServiceOptions) = this()
  }
  
}

