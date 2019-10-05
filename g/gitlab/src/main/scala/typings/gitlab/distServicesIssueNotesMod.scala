package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesIssueNotesMod.IssueNotes
import typings.gitlab.distTemplatesMod.ResourceNotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/IssueNotes", JSImport.Namespace)
@js.native
object distServicesIssueNotesMod extends js.Object {
  @js.native
  class default protected () extends IssueNotes {
    def this(options: BaseServiceOptions) = this()
  }
  
  type IssueNotes = ResourceNotes
}

