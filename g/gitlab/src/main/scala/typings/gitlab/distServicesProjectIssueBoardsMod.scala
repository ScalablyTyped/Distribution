package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesProjectIssueBoardsMod.ProjectIssueBoards
import typings.gitlab.distTemplatesMod.ResourceIssueBoards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ProjectIssueBoards", JSImport.Namespace)
@js.native
object distServicesProjectIssueBoardsMod extends js.Object {
  @js.native
  class default protected () extends ProjectIssueBoards {
    def this(options: BaseServiceOptions) = this()
  }
  
  type ProjectIssueBoards = ResourceIssueBoards
}

