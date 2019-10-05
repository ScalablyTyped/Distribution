package typings.draftDashJs.draftDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "ContentState")
@js.native
class ContentState ()
  extends typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState

/* static members */
@JSImport("draft-js", "ContentState")
@js.native
object ContentState extends js.Object {
  def createFromBlockArray(blocks: js.Array[typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock]): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromBlockArray(
    blocks: js.Array[typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock],
    entityMap: js.Any
  ): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromText(text: String): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromText(text: String, delimiter: String): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
}

