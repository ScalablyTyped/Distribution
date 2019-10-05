package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesProjectSnippetNotesMod.ProjectSnippetNotes
import typings.gitlab.distTemplatesMod.ResourceNotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ProjectSnippetNotes", JSImport.Namespace)
@js.native
object distServicesProjectSnippetNotesMod extends js.Object {
  @js.native
  class default protected () extends ProjectSnippetNotes {
    def this(options: BaseServiceOptions) = this()
  }
  
  type ProjectSnippetNotes = ResourceNotes
}

