package typings.draftJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def DefaultDraftBlockRenderMap: typings.immutable.Immutable.Map[js.Any, js.Any] = typings.draftJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DefaultDraftBlockRenderMap").asInstanceOf[typings.immutable.Immutable.Map[js.Any, js.Any]]
  
  @scala.inline
  def DefaultDraftInlineStyle: typings.immutable.Immutable.Map[js.Any, js.Any] = typings.draftJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DefaultDraftInlineStyle").asInstanceOf[typings.immutable.Immutable.Map[js.Any, js.Any]]
  
  type SyntheticEvent = typings.react.mod.SyntheticEvent[js.Object, typings.std.Event]
  
  type SyntheticKeyboardEvent = typings.react.mod.KeyboardEvent[js.Object]
  
  /**
    * Retrieve a bound key command for the given event.
    */
  @scala.inline
  def getDefaultKeyBinding(e: typings.draftJs.mod.SyntheticKeyboardEvent): typings.draftJs.mod.Draft.Model.Constants.DraftEditorCommand | scala.Null = typings.draftJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultKeyBinding")(e.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.Constants.DraftEditorCommand | scala.Null]
  
  /**
    * Return the bounding ClientRect for the visible DOM selection, if any.
    * In cases where there are no selected ranges or the bounding rect is
    * temporarily invalid, return null.
    */
  @scala.inline
  def getVisibleSelectionRect(global: js.Any): typings.draftJs.mod.Draft.Component.Selection.FakeClientRect = typings.draftJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleSelectionRect")(global.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Component.Selection.FakeClientRect]
}
