package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceNotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/IssueNotes", JSImport.Namespace)
@js.native
object issueNotesMod extends js.Object {
  @js.native
  class IssueNotes protected () extends ResourceNotes {
    def this(options: BaseServiceOptions) = this()
  }
  
}

