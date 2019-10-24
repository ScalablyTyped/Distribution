package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreTemplatesMod.ResourceIssueBoards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/GroupIssueBoards", JSImport.Namespace)
@js.native
object distSrcCoreServicesGroupIssueBoardsMod extends js.Object {
  @js.native
  class default protected () extends ResourceIssueBoards {
    def this(options: BaseServiceOptions) = this()
  }
  
  type GroupIssueBoards = ResourceIssueBoards
}

