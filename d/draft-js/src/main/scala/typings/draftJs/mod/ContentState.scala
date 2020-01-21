package typings.draftJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "ContentState")
@js.native
class ContentState ()
  extends typings.draftJs.mod.Draft.Model.ImmutableData.ContentState

/* static members */
@JSImport("draft-js", "ContentState")
@js.native
object ContentState extends js.Object {
  def createFromBlockArray(blocks: js.Array[typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock]): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromBlockArray(blocks: js.Array[typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock], entityMap: js.Any): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromText(text: String): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromText(text: String, delimiter: String): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
}

