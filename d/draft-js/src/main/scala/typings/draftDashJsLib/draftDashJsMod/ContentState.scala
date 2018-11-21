package typings
package draftDashJsLib.draftDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "ContentState")
@js.native
class ContentState ()
  extends draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState

@JSImport("draft-js", "ContentState")
@js.native
object ContentState extends js.Object {
  def createFromBlockArray(blocks: js.Array[draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock]): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState = js.native
  def createFromBlockArray(
    blocks: js.Array[draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock],
    entityMap: js.Any
  ): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState = js.native
  def createFromText(text: java.lang.String): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState = js.native
  def createFromText(text: java.lang.String, delimiter: java.lang.String): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentState = js.native
}

