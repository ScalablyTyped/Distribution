package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceIssueBoards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/ProjectIssueBoards", JSImport.Namespace)
@js.native
object projectIssueBoardsMod extends js.Object {
  
  @js.native
  class ProjectIssueBoards protected () extends ResourceIssueBoards {
    def this(options: BaseServiceOptions) = this()
  }
}
