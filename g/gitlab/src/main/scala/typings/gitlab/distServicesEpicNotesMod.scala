package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distTemplatesMod.ResourceNotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/EpicNotes", JSImport.Namespace)
@js.native
object distServicesEpicNotesMod extends js.Object {
  @js.native
  class default protected () extends ResourceNotes {
    def this(options: BaseServiceOptions) = this()
  }
  
  type EpicNotes = ResourceNotes
}

