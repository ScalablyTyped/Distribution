package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesGroupIssueBoardsMod.GroupIssueBoards
import typings.gitlab.distTemplatesMod.ResourceIssueBoards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/GroupIssueBoards", JSImport.Namespace)
@js.native
object distServicesGroupIssueBoardsMod extends js.Object {
  @js.native
  class default protected () extends GroupIssueBoards {
    def this(options: BaseServiceOptions) = this()
  }
  
  type GroupIssueBoards = ResourceIssueBoards
}

