package typings.draftJs.mod

import typings.draftJs.mod.Draft.Model.Constants.DraftInsertionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "AtomicBlockUtils")
@js.native
class AtomicBlockUtils ()
  extends typings.draftJs.mod.Draft.Model.Modifier.AtomicBlockUtils
object AtomicBlockUtils {
  
  /* static member */
  @JSImport("draft-js", "AtomicBlockUtils.insertAtomicBlock")
  @js.native
  def insertAtomicBlock(
    editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    entityKey: String,
    character: String
  ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /* static member */
  @JSImport("draft-js", "AtomicBlockUtils.moveAtomicBlock")
  @js.native
  def moveAtomicBlock(
    editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState
  ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  @JSImport("draft-js", "AtomicBlockUtils.moveAtomicBlock")
  @js.native
  def moveAtomicBlock(
    editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState,
    insertionMode: DraftInsertionType
  ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
}
