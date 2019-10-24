package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreTemplatesMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/IssueDiscussions", JSImport.Namespace)
@js.native
object distSrcCoreServicesIssueDiscussionsMod extends js.Object {
  @js.native
  class default protected () extends ResourceDiscussions {
    def this(options: BaseServiceOptions) = this()
  }
  
  type IssueDiscussions = ResourceDiscussions
}

