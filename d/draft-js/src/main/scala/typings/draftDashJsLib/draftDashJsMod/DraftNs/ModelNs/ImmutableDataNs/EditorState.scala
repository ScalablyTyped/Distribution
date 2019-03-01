package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: any} */ trait EditorState extends js.Object {
  def getAllowUndo(): scala.Boolean
  def getBlockTree(blockKey: java.lang.String): immutableLib.immutableMod.List[_]
  def getCurrentContent(): ContentState
  /**
    * Get the appropriate inline style for the editor state. If an
    * override is in place, use it. Otherwise, the current style is
    * based on the location of the selection state.
    */
  def getCurrentInlineStyle(): DraftInlineStyle
  def getDecorator(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.DecoratorsNs.DraftDecoratorType
  def getDirectionMap(): immutableLib.immutableMod.OrderedMap[_, _]
  /**
    * While editing, the user may apply inline style commands with a collapsed
    * cursor, intending to type text that adopts the specified style. In this
    * case, we track the specified style as an "override" that takes precedence
    * over the inline style of the text adjacent to the cursor.
    *
    * If null, there is no override in place.
    */
  def getInlineStyleOverride(): DraftInlineStyle
  def getLastChangeType(): EditorChangeType
  def getNativelyRenderedContent(): ContentState
  def getRedoStack(): immutableLib.immutableMod.Stack[ContentState]
  def getSelection(): SelectionState
  def getUndoStack(): immutableLib.immutableMod.Stack[ContentState]
  def isInCompositionMode(): scala.Boolean
  def isSelectionAtEndOfContent(): scala.Boolean
  def isSelectionAtStartOfContent(): scala.Boolean
  def mustForceSelection(): scala.Boolean
  def toJS(): js.Object
}

object EditorState {
  @scala.inline
  def apply(
    getAllowUndo: js.Function0[scala.Boolean],
    getBlockTree: js.Function1[java.lang.String, immutableLib.immutableMod.List[_]],
    getCurrentContent: js.Function0[ContentState],
    getCurrentInlineStyle: js.Function0[DraftInlineStyle],
    getDecorator: js.Function0[draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.DecoratorsNs.DraftDecoratorType],
    getDirectionMap: js.Function0[immutableLib.immutableMod.OrderedMap[_, _]],
    getInlineStyleOverride: js.Function0[DraftInlineStyle],
    getLastChangeType: js.Function0[EditorChangeType],
    getNativelyRenderedContent: js.Function0[ContentState],
    getRedoStack: js.Function0[immutableLib.immutableMod.Stack[ContentState]],
    getSelection: js.Function0[SelectionState],
    getUndoStack: js.Function0[immutableLib.immutableMod.Stack[ContentState]],
    isInCompositionMode: js.Function0[scala.Boolean],
    isSelectionAtEndOfContent: js.Function0[scala.Boolean],
    isSelectionAtStartOfContent: js.Function0[scala.Boolean],
    mustForceSelection: js.Function0[scala.Boolean],
    toJS: js.Function0[js.Object]
  ): EditorState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllowUndo")(getAllowUndo)
    __obj.updateDynamic("getBlockTree")(getBlockTree)
    __obj.updateDynamic("getCurrentContent")(getCurrentContent)
    __obj.updateDynamic("getCurrentInlineStyle")(getCurrentInlineStyle)
    __obj.updateDynamic("getDecorator")(getDecorator)
    __obj.updateDynamic("getDirectionMap")(getDirectionMap)
    __obj.updateDynamic("getInlineStyleOverride")(getInlineStyleOverride)
    __obj.updateDynamic("getLastChangeType")(getLastChangeType)
    __obj.updateDynamic("getNativelyRenderedContent")(getNativelyRenderedContent)
    __obj.updateDynamic("getRedoStack")(getRedoStack)
    __obj.updateDynamic("getSelection")(getSelection)
    __obj.updateDynamic("getUndoStack")(getUndoStack)
    __obj.updateDynamic("isInCompositionMode")(isInCompositionMode)
    __obj.updateDynamic("isSelectionAtEndOfContent")(isSelectionAtEndOfContent)
    __obj.updateDynamic("isSelectionAtStartOfContent")(isSelectionAtStartOfContent)
    __obj.updateDynamic("mustForceSelection")(mustForceSelection)
    __obj.updateDynamic("toJS")(toJS)
    __obj.asInstanceOf[EditorState]
  }
}

