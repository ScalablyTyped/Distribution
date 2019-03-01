package typings
package draftDashJsLib.draftDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DefaultDraftBlockRenderMap: immutableLib.immutableMod.Map[js.Any, js.Any] = js.native
  val DefaultDraftInlineStyle: immutableLib.immutableMod.Map[js.Any, js.Any] = js.native
  /**
    * Retrieve a bound key command for the given event.
    */
  def getDefaultKeyBinding(e: draftDashJsLib.SyntheticKeyboardEvent): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEditorCommand | scala.Null = js.native
  /**
    * Return the bounding ClientRect for the visible DOM selection, if any.
    * In cases where there are no selected ranges or the bounding rect is
    * temporarily invalid, return null.
    */
  def getVisibleSelectionRect(global: js.Any): draftDashJsLib.draftDashJsMod.DraftNs.ComponentNs.SelectionNs.FakeClientRect = js.native
}

