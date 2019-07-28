package typings.draftDashJs.draftDashJsMod

import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftInsertionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "AtomicBlockUtils")
@js.native
class AtomicBlockUtils ()
  extends typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ModifierNs.AtomicBlockUtils

/* static members */
@JSImport("draft-js", "AtomicBlockUtils")
@js.native
object AtomicBlockUtils extends js.Object {
  def insertAtomicBlock(
    editorState: typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState,
    entityKey: String,
    character: String
  ): typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  def moveAtomicBlock(
    editorState: typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState,
    atomicBlock: typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock,
    targetRange: typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState
  ): typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  def moveAtomicBlock(
    editorState: typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState,
    atomicBlock: typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock,
    targetRange: typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState,
    insertionMode: DraftInsertionType
  ): typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
}

