package typings.draftDashJs.draftDashJsMod

import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftInsertionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "AtomicBlockUtils")
@js.native
class AtomicBlockUtils ()
  extends typings.draftDashJs.draftDashJsMod.Draft.Model.Modifier.AtomicBlockUtils

/* static members */
@JSImport("draft-js", "AtomicBlockUtils")
@js.native
object AtomicBlockUtils extends js.Object {
  def insertAtomicBlock(
    editorState: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState,
    entityKey: String,
    character: String
  ): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState = js.native
  def moveAtomicBlock(
    editorState: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState
  ): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState = js.native
  def moveAtomicBlock(
    editorState: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState,
    insertionMode: DraftInsertionType
  ): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState = js.native
}

