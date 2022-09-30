package typings.draftJs.mod

import typings.draftJs.mod.Draft.Model.Decorators.DraftDecoratorType
import typings.draftJs.mod.Draft.Model.ImmutableData.DraftInlineStyle
import typings.draftJs.mod.Draft.Model.ImmutableData.EditorChangeType
import typings.immutable.mod.OrderedMap
import typings.immutable.mod.Stack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "EditorState")
@js.native
open class EditorState ()
  extends StObject
     with typings.draftJs.mod.Draft.Model.ImmutableData.EditorState {
  
  /* CompleteClass */
  override def getAllowUndo(): Boolean = js.native
  
  /* CompleteClass */
  override def getBlockTree(blockKey: String): typings.immutable.mod.List[Any] = js.native
  
  /* CompleteClass */
  override def getCurrentContent(): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  
  /**
    * Get the appropriate inline style for the editor state. If an
    * override is in place, use it. Otherwise, the current style is
    * based on the location of the selection state.
    */
  /* CompleteClass */
  override def getCurrentInlineStyle(): DraftInlineStyle = js.native
  
  /* CompleteClass */
  override def getDecorator(): DraftDecoratorType = js.native
  
  /* CompleteClass */
  override def getDirectionMap(): OrderedMap[Any, Any] = js.native
  
  /**
    * While editing, the user may apply inline style commands with a collapsed
    * cursor, intending to type text that adopts the specified style. In this
    * case, we track the specified style as an "override" that takes precedence
    * over the inline style of the text adjacent to the cursor.
    *
    * If null, there is no override in place.
    */
  /* CompleteClass */
  override def getInlineStyleOverride(): DraftInlineStyle = js.native
  
  /* CompleteClass */
  override def getLastChangeType(): EditorChangeType = js.native
  
  /* CompleteClass */
  override def getNativelyRenderedContent(): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  
  /* CompleteClass */
  override def getRedoStack(): Stack[typings.draftJs.mod.Draft.Model.ImmutableData.ContentState] = js.native
  
  /* CompleteClass */
  override def getSelection(): typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState = js.native
  
  /* CompleteClass */
  override def getUndoStack(): Stack[typings.draftJs.mod.Draft.Model.ImmutableData.ContentState] = js.native
  
  /* CompleteClass */
  override def isInCompositionMode(): Boolean = js.native
  
  /* CompleteClass */
  override def isSelectionAtEndOfContent(): Boolean = js.native
  
  /* CompleteClass */
  override def isSelectionAtStartOfContent(): Boolean = js.native
  
  /* CompleteClass */
  override def mustForceSelection(): Boolean = js.native
  
  /* CompleteClass */
  override def toJS(): js.Object = js.native
}
object EditorState {
  
  @JSImport("draft-js", "EditorState")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Incorporate native DOM selection changes into the EditorState. This
    * method can be used when we simply want to accept whatever the DOM
    * has given us to represent selection, and we do not need to re-render
    * the editor.
    *
    * To forcibly move the DOM selection, see `EditorState.forceSelection`.
    */
  /* static member */
  inline def acceptSelection(
    editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    selection: typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState
  ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("acceptSelection")(editorState.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  
  /* static member */
  inline def create(config: js.Object): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  
  /* static member */
  inline def createEmpty(): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")().asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  inline def createEmpty(decorator: DraftDecoratorType): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")(decorator.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  
  /* static member */
  inline def createWithContent(contentState: typings.draftJs.mod.Draft.Model.ImmutableData.ContentState): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("createWithContent")(contentState.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  inline def createWithContent(
    contentState: typings.draftJs.mod.Draft.Model.ImmutableData.ContentState,
    decorator: DraftDecoratorType
  ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithContent")(contentState.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  
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
  /* static member */
  inline def forceSelection(
    editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    selection: typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState
  ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("forceSelection")(editorState.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  
  /**
    * Force focus to the end of the editor. This is useful in scenarios
    * where we want to programmatically focus the input and it makes sense
    * to allow the user to continue working seamlessly.
    */
  /* static member */
  inline def moveFocusToEnd(editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("moveFocusToEnd")(editorState.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  
  /**
    * Move selection to the end of the editor without forcing focus.
    */
  /* static member */
  inline def moveSelectionToEnd(editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("moveSelectionToEnd")(editorState.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  
  /**
    * Push the current ContentState onto the undo stack if it should be
    * considered a boundary state, and set the provided ContentState as the
    * new current content.
    */
  /* static member */
  inline def push(
    editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    contentState: typings.draftJs.mod.Draft.Model.ImmutableData.ContentState,
    changeType: EditorChangeType
  ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(editorState.asInstanceOf[js.Any], contentState.asInstanceOf[js.Any], changeType.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  
  /**
    * Make the top ContentState in the redo stack the new current content and
    * push the current content onto the undo stack.
    */
  /* static member */
  inline def redo(editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("redo")(editorState.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  
  /* static member */
  inline def set(editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState, put: js.Object): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(editorState.asInstanceOf[js.Any], put.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  
  /* static member */
  inline def setInlineStyleOverride(
    editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    inlineStyleOverride: DraftInlineStyle
  ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("setInlineStyleOverride")(editorState.asInstanceOf[js.Any], inlineStyleOverride.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
  
  /**
    * Make the top ContentState in the undo stack the new current content and
    * push the current content onto the redo stack.
    */
  /* static member */
  inline def undo(editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("undo")(editorState.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
}
