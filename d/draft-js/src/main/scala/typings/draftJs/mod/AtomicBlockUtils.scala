package typings.draftJs.mod

import typings.draftJs.mod.Draft.Model.Constants.DraftInsertionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "AtomicBlockUtils")
@js.native
open class AtomicBlockUtils ()
  extends StObject
     with typings.draftJs.mod.Draft.Model.Modifier.AtomicBlockUtils
object AtomicBlockUtils {
  
  @JSImport("draft-js", "AtomicBlockUtils")
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
