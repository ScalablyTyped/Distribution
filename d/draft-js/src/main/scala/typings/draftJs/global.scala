package typings.draftJs

import typings.draftJs.mod.Draft.Component.Selection.FakeClientRect
import typings.draftJs.mod.Draft.Model.Constants.DraftEditorCommand
import typings.draftJs.mod.Draft.Model.Constants.DraftInsertionType
import typings.draftJs.mod.Draft.Model.Decorators.DraftDecoratorType
import typings.draftJs.mod.Draft.Model.ImmutableData.BlockMap
import typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadataConfig
import typings.draftJs.mod.Draft.Model.ImmutableData.DraftInlineStyle
import typings.draftJs.mod.Draft.Model.ImmutableData.EditorChangeType
import typings.draftJs.mod.SyntheticKeyboardEvent
import typings.immutable.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Draft {
    
    @JSGlobal("Draft")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Draft.AtomicBlockUtils")
    @js.native
    open class AtomicBlockUtils ()
      extends typings.draftJs.mod.AtomicBlockUtils
    object AtomicBlockUtils {
      
      @JSGlobal("Draft.AtomicBlockUtils")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def insertAtomicBlock(
        editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
        entityKey: String,
        character: String
      ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAtomicBlock")(editorState.asInstanceOf[js.Any], entityKey.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
      
      /* static member */
      inline def moveAtomicBlock(
        editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
        atomicBlock: typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
        targetRange: typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState
      ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("moveAtomicBlock")(editorState.asInstanceOf[js.Any], atomicBlock.asInstanceOf[js.Any], targetRange.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
      inline def moveAtomicBlock(
        editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
        atomicBlock: typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
        targetRange: typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState,
        insertionMode: DraftInsertionType
      ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("moveAtomicBlock")(editorState.asInstanceOf[js.Any], atomicBlock.asInstanceOf[js.Any], targetRange.asInstanceOf[js.Any], insertionMode.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.EditorState]
    }
    
    @JSGlobal("Draft.BlockMapBuilder")
    @js.native
    open class BlockMapBuilder ()
      extends typings.draftJs.mod.BlockMapBuilder
    object BlockMapBuilder {
      
      @JSGlobal("Draft.BlockMapBuilder")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def createFromArray(blocks: js.Array[typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock]): BlockMap = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromArray")(blocks.asInstanceOf[js.Any]).asInstanceOf[BlockMap]
    }
    
    @JSGlobal("Draft.CharacterMetadata")
    @js.native
    open class CharacterMetadata ()
      extends typings.draftJs.mod.CharacterMetadata
    object CharacterMetadata {
      
      @JSGlobal("Draft.CharacterMetadata")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def applyEntity(record: typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata): typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("applyEntity")(record.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata]
      inline def applyEntity(record: typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, entityKey: String): typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("applyEntity")(record.asInstanceOf[js.Any], entityKey.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata]
      
      /* static member */
      inline def applyStyle(record: typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, style: String): typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStyle")(record.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata]
      
      /**
        * Use this function instead of the `CharacterMetadata` constructor.
        * Since most content generally uses only a very small number of
        * style/entity permutations, we can reuse these objects as often as
        * possible.
        */
      /* static member */
      inline def create(): typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata]
      inline def create(config: CharacterMetadataConfig): typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata]
      
      /* static member */
      inline def removeStyle(record: typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, style: String): typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("removeStyle")(record.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata]
    }
    
    @JSGlobal("Draft.ContentBlock")
    @js.native
    open class ContentBlock ()
      extends typings.draftJs.mod.ContentBlock
    
    @JSGlobal("Draft.ContentState")
    @js.native
    open class ContentState ()
      extends typings.draftJs.mod.ContentState
    object ContentState {
      
      @JSGlobal("Draft.ContentState")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def createFromBlockArray(blocks: js.Array[typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock]): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBlockArray")(blocks.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.ContentState]
      inline def createFromBlockArray(blocks: js.Array[typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock], entityMap: Any): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBlockArray")(blocks.asInstanceOf[js.Any], entityMap.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.ContentState]
      
      /* static member */
      inline def createFromText(text: String): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromText")(text.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.ContentState]
      inline def createFromText(text: String, delimiter: String): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromText")(text.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.ContentState]
    }
    
    @JSGlobal("Draft.DefaultDraftBlockRenderMap")
    @js.native
    val DefaultDraftBlockRenderMap: Map[Any, Any] = js.native
    
    @JSGlobal("Draft.DefaultDraftInlineStyle")
    @js.native
    val DefaultDraftInlineStyle: Map[Any, Any] = js.native
    
    @JSGlobal("Draft.EditorState")
    @js.native
    open class EditorState ()
      extends typings.draftJs.mod.EditorState
    object EditorState {
      
      @JSGlobal("Draft.EditorState")
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
    
    @JSGlobal("Draft.KeyBindingUtil")
    @js.native
    open class KeyBindingUtil ()
      extends typings.draftJs.mod.KeyBindingUtil
    object KeyBindingUtil {
      
      @JSGlobal("Draft.KeyBindingUtil")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def hasCommandModifier(e: SyntheticKeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCommandModifier")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Check whether the ctrlKey modifier is *not* being used in conjunction with
        * the altKey modifier. If they are combined, the result is an `altGraph`
        * key modifier, which should not be handled by this set of key bindings.
        */
      /* static member */
      inline def isCtrlKeyCommand(e: SyntheticKeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCtrlKeyCommand")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /* static member */
      inline def isOptionKeyCommand(e: SyntheticKeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionKeyCommand")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /* static member */
      inline def isSoftNewlineEvent(e: SyntheticKeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSoftNewlineEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Check whether heuristics that only apply to macOS are used
        * internally, for example when determining the key combination
        * used as command modifier.
        */
      /* static member */
      inline def usesMacOSHeuristics(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("usesMacOSHeuristics")().asInstanceOf[Boolean]
    }
    
    @JSGlobal("Draft.SelectionState")
    @js.native
    open class SelectionState ()
      extends typings.draftJs.mod.SelectionState
    object SelectionState {
      
      @JSGlobal("Draft.SelectionState")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def createEmpty(key: String): typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")(key.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState]
    }
    
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
  }
}
