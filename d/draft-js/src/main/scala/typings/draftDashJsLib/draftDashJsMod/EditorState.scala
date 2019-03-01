package typings
package draftDashJsLib.draftDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "EditorState")
@js.native
class EditorState ()
  extends draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState {
  /* CompleteClass */
  override def getAllowUndo(): scala.Boolean = js.native
  /* CompleteClass */
  override def getBlockTree(blockKey: java.lang.String): immutableLib.immutableMod.List[_] = js.native
  /* CompleteClass */
  override def getCurrentContent(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState = js.native
  /**
    * Get the appropriate inline style for the editor state. If an
    * override is in place, use it. Otherwise, the current style is
    * based on the location of the selection state.
    */
  /* CompleteClass */
  override def getCurrentInlineStyle(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftInlineStyle = js.native
  /* CompleteClass */
  override def getDecorator(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.DecoratorsNs.DraftDecoratorType = js.native
  /* CompleteClass */
  override def getDirectionMap(): immutableLib.immutableMod.OrderedMap[_, _] = js.native
  /**
    * While editing, the user may apply inline style commands with a collapsed
    * cursor, intending to type text that adopts the specified style. In this
    * case, we track the specified style as an "override" that takes precedence
    * over the inline style of the text adjacent to the cursor.
    *
    * If null, there is no override in place.
    */
  /* CompleteClass */
  override def getInlineStyleOverride(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftInlineStyle = js.native
  /* CompleteClass */
  override def getLastChangeType(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorChangeType = js.native
  /* CompleteClass */
  override def getNativelyRenderedContent(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState = js.native
  /* CompleteClass */
  override def getRedoStack(): immutableLib.immutableMod.Stack[draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState] = js.native
  /* CompleteClass */
  override def getSelection(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState = js.native
  /* CompleteClass */
  override def getUndoStack(): immutableLib.immutableMod.Stack[draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState] = js.native
  /* CompleteClass */
  override def isInCompositionMode(): scala.Boolean = js.native
  /* CompleteClass */
  override def isSelectionAtEndOfContent(): scala.Boolean = js.native
  /* CompleteClass */
  override def isSelectionAtStartOfContent(): scala.Boolean = js.native
  /* CompleteClass */
  override def mustForceSelection(): scala.Boolean = js.native
  /* CompleteClass */
  override def toJS(): js.Object = js.native
}

/* static members */
@JSImport("draft-js", "EditorState")
@js.native
object EditorState extends js.Object {
  /**
    * Incorporate native DOM selection changes into the EditorState. This
    * method can be used when we simply want to accept whatever the DOM
    * has given us to represent selection, and we do not need to re-render
    * the editor.
    *
    * To forcibly move the DOM selection, see `EditorState.forceSelection`.
    */
  def acceptSelection(
    editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState,
    selection: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  def create(config: js.Object): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  def createEmpty(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  def createEmpty(decorator: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.DecoratorsNs.DraftDecoratorType): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  def createWithContent(contentState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  def createWithContent(
    contentState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState,
    decorator: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.DecoratorsNs.DraftDecoratorType
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  /**
    * At times, we need to force the DOM selection to be where we
    * need it to be. This can occur when the anchor or focus nodes
    * are non-text nodes, for instance. In this case, we want to trigger
    * a re-render of the editor, which in turn forces selection into
    * the correct place in the DOM. The `forceSelection` method
    * accomplishes this.
    *
    * This method should be used in cases where you need to explicitly
    * move the DOM selection from one place to another without a change
    * in ContentState.
    */
  def forceSelection(
    editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState,
    selection: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  /**
    * Force focus to the end of the editor. This is useful in scenarios
    * where we want to programmatically focus the input and it makes sense
    * to allow the user to continue working seamlessly.
    */
  def moveFocusToEnd(editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  /**
    * Move selection to the end of the editor without forcing focus.
    */
  def moveSelectionToEnd(editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  /**
    * Push the current ContentState onto the undo stack if it should be
    * considered a boundary state, and set the provided ContentState as the
    * new current content.
    */
  def push(
    editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState,
    contentState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState,
    changeType: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorChangeType
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  /**
    * Make the top ContentState in the redo stack the new current content and
    * push the current content onto the undo stack.
    */
  def redo(editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  def set(
    editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState,
    put: js.Object
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  def setInlineStyleOverride(
    editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState,
    inlineStyleOverride: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftInlineStyle
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  /**
    * Make the top ContentState in the undo stack the new current content and
    * push the current content onto the redo stack.
    */
  def undo(editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
}

