package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceBadges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ProjectBadges", JSImport.Namespace)
@js.native
object projectBadgesMod extends js.Object {
  @js.native
  class ProjectBadges protected () extends ResourceBadges {
    def this(options: BaseServiceOptions) = this()
  }
  
}

