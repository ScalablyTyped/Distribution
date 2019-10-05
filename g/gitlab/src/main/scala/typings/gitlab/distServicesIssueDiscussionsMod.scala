package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesIssueDiscussionsMod.IssueDiscussions
import typings.gitlab.distTemplatesMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/IssueDiscussions", JSImport.Namespace)
@js.native
object distServicesIssueDiscussionsMod extends js.Object {
  @js.native
  class default protected () extends IssueDiscussions {
    def this(options: BaseServiceOptions) = this()
  }
  
  type IssueDiscussions = ResourceDiscussions
}

