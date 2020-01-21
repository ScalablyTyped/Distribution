package typings.draftJs.mod

import typings.draftJs.mod.Draft.Model.Constants.DraftInsertionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "AtomicBlockUtils")
@js.native
class AtomicBlockUtils ()
  extends typings.draftJs.mod.Draft.Model.Modifier.AtomicBlockUtils

/* static members */
@JSImport("draft-js", "AtomicBlockUtils")
@js.native
object AtomicBlockUtils extends js.Object {
  def insertAtomicBlock(
    editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    entityKey: String,
    character: String
  ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def moveAtomicBlock(
    editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState
  ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def moveAtomicBlock(
    editorState: typings.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState,
    insertionMode: DraftInsertionType
  ): typings.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
}

