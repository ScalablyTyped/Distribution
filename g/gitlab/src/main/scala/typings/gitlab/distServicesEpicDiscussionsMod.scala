package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesEpicDiscussionsMod.EpicDiscussions
import typings.gitlab.distTemplatesMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/EpicDiscussions", JSImport.Namespace)
@js.native
object distServicesEpicDiscussionsMod extends js.Object {
  @js.native
  class default protected () extends EpicDiscussions {
    def this(options: BaseServiceOptions) = this()
  }
  
  type EpicDiscussions = ResourceDiscussions
}

