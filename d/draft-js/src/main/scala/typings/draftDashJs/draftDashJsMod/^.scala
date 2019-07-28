package typings.draftDashJs.draftDashJsMod

import typings.draftDashJs.draftDashJsMod.DraftNs.ComponentNs.SelectionNs.FakeClientRect
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEditorCommand
import typings.immutable.immutableMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DefaultDraftBlockRenderMap: Map[js.Any, js.Any] = js.native
  val DefaultDraftInlineStyle: Map[js.Any, js.Any] = js.native
  /**
    * Retrieve a bound key command for the given event.
    */
  def getDefaultKeyBinding(e: SyntheticKeyboardEvent): DraftEditorCommand | Null = js.native
  /**
    * Return the bounding ClientRect for the visible DOM selection, if any.
    * In cases where there are no selected ranges or the bounding rect is
    * temporarily invalid, return null.
    */
  def getVisibleSelectionRect(global: js.Any): FakeClientRect = js.native
}

