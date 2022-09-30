package typings.draftJs.mod

import typings.draftJs.mod.Draft.Component.Selection.FakeClientRect
import typings.draftJs.mod.Draft.Model.Constants.DraftEditorCommand
import typings.draftJs.mod.^
import typings.immutable.mod.Map
import typings.react.mod.ClipboardEvent
import typings.react.mod.KeyboardEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DefaultDraftBlockRenderMap: Map[Any, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("DefaultDraftBlockRenderMap").asInstanceOf[Map[Any, Any]]

inline def DefaultDraftInlineStyle: Map[Any, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("DefaultDraftInlineStyle").asInstanceOf[Map[Any, Any]]

/**
  * Retrieve a bound key command for the given event.
  */
inline def getDefaultKeyBinding(e: SyntheticKeyboardEvent): DraftEditorCommand | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultKeyBinding")(e.asInstanceOf[js.Any]).asInstanceOf[DraftEditorCommand | Null]

/**
  * Return the bounding ClientRect for the visible DOM selection, if any.
  * In cases where there are no selected ranges or the bounding rect is
  * temporarily invalid, return null.
  */
inline def getVisibleSelectionRect(global: Any): FakeClientRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleSelectionRect")(global.asInstanceOf[js.Any]).asInstanceOf[FakeClientRect]

type SyntheticClipboardEvent = ClipboardEvent[js.Object]

type SyntheticEvent = typings.react.mod.SyntheticEvent[js.Object, Event]

type SyntheticKeyboardEvent = KeyboardEvent[js.Object]
