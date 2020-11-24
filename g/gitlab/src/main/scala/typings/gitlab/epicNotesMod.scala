package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceNotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/EpicNotes", JSImport.Namespace)
@js.native
object epicNotesMod extends js.Object {
  
  @js.native
  class EpicNotes protected () extends ResourceNotes {
    def this(options: BaseServiceOptions) = this()
  }
}
