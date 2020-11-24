package typings.draftJs.mod

import typings.draftJs.mod.Draft.Model.Constants.DraftEditorCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "getDefaultKeyBinding")
@js.native
object getDefaultKeyBinding extends js.Object {
  
  /**
    * Retrieve a bound key command for the given event.
    */
  def apply(e: SyntheticKeyboardEvent): DraftEditorCommand | Null = js.native
}
