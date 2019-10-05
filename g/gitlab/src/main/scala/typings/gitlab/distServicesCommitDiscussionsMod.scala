package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesCommitDiscussionsMod.CommitDiscussions
import typings.gitlab.distTemplatesMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/CommitDiscussions", JSImport.Namespace)
@js.native
object distServicesCommitDiscussionsMod extends js.Object {
  @js.native
  class default protected () extends CommitDiscussions {
    def this(options: BaseServiceOptions) = this()
  }
  
  type CommitDiscussions = ResourceDiscussions
}

