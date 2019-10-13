package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distTemplatesMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/MergeRequestDiscussions", JSImport.Namespace)
@js.native
object distServicesMergeRequestDiscussionsMod extends js.Object {
  @js.native
  class default protected () extends ResourceDiscussions {
    def this(options: BaseServiceOptions) = this()
  }
  
  type MergeRequestDiscussions = ResourceDiscussions
}

