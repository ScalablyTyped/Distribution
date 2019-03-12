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
    getAllowUndo: () => scala.Boolean,
    getBlockTree: java.lang.String => immutableLib.immutableMod.List[_],
    getCurrentContent: () => ContentState,
    getCurrentInlineStyle: () => DraftInlineStyle,
    getDecorator: () => draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.DecoratorsNs.DraftDecoratorType,
    getDirectionMap: () => immutableLib.immutableMod.OrderedMap[_, _],
    getInlineStyleOverride: () => DraftInlineStyle,
    getLastChangeType: () => EditorChangeType,
    getNativelyRenderedContent: () => ContentState,
    getRedoStack: () => immutableLib.immutableMod.Stack[ContentState],
    getSelection: () => SelectionState,
    getUndoStack: () => immutableLib.immutableMod.Stack[ContentState],
    isInCompositionMode: () => scala.Boolean,
    isSelectionAtEndOfContent: () => scala.Boolean,
    isSelectionAtStartOfContent: () => scala.Boolean,
    mustForceSelection: () => scala.Boolean,
    toJS: () => js.Object
  ): EditorState = {
    val __obj = js.Dynamic.literal(getAllowUndo = js.Any.fromFunction0(getAllowUndo), getBlockTree = js.Any.fromFunction1(getBlockTree), getCurrentContent = js.Any.fromFunction0(getCurrentContent), getCurrentInlineStyle = js.Any.fromFunction0(getCurrentInlineStyle), getDecorator = js.Any.fromFunction0(getDecorator), getDirectionMap = js.Any.fromFunction0(getDirectionMap), getInlineStyleOverride = js.Any.fromFunction0(getInlineStyleOverride), getLastChangeType = js.Any.fromFunction0(getLastChangeType), getNativelyRenderedContent = js.Any.fromFunction0(getNativelyRenderedContent), getRedoStack = js.Any.fromFunction0(getRedoStack), getSelection = js.Any.fromFunction0(getSelection), getUndoStack = js.Any.fromFunction0(getUndoStack), isInCompositionMode = js.Any.fromFunction0(isInCompositionMode), isSelectionAtEndOfContent = js.Any.fromFunction0(isSelectionAtEndOfContent), isSelectionAtStartOfContent = js.Any.fromFunction0(isSelectionAtStartOfContent), mustForceSelection = js.Any.fromFunction0(mustForceSelection), toJS = js.Any.fromFunction0(toJS))
  
    __obj.asInstanceOf[EditorState]
  }
}

