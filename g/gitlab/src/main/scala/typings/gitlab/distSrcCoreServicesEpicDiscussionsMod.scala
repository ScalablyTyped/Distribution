package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreTemplatesMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/EpicDiscussions", JSImport.Namespace)
@js.native
object distSrcCoreServicesEpicDiscussionsMod extends js.Object {
  @js.native
  class default protected () extends ResourceDiscussions {
    def this(options: BaseServiceOptions) = this()
  }
  
  type EpicDiscussions = ResourceDiscussions
}

