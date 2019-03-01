package typings
package draftDashJsLib.draftDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "AtomicBlockUtils")
@js.native
class AtomicBlockUtils ()
  extends draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ModifierNs.AtomicBlockUtils

/* static members */
@JSImport("draft-js", "AtomicBlockUtils")
@js.native
object AtomicBlockUtils extends js.Object {
  def insertAtomicBlock(
    editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState,
    entityKey: java.lang.String,
    character: java.lang.String
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  def moveAtomicBlock(
    editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState,
    atomicBlock: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock,
    targetRange: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
  def moveAtomicBlock(
    editorState: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState,
    atomicBlock: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock,
    targetRange: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState,
    insertionMode: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftInsertionType
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorState = js.native
}

