package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distTemplatesMod.ResourceNotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/MergeRequestNotes", JSImport.Namespace)
@js.native
object distServicesMergeRequestNotesMod extends js.Object {
  @js.native
  class default protected () extends ResourceNotes {
    def this(options: BaseServiceOptions) = this()
  }
  
  type MergeRequestNotes = ResourceNotes
}

