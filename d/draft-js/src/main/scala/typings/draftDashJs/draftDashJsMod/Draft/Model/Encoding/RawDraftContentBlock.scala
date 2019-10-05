package typings.draftDashJs.draftDashJsMod.Draft.Model.Encoding

import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftBlockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plain object representation of a ContentBlock, with all style and entity
  * attribution repackaged as range objects.
  */
trait RawDraftContentBlock extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
  var depth: Double
  var entityRanges: js.Array[RawDraftEntityRange]
  var inlineStyleRanges: js.Array[RawDraftInlineStyleRange]
  var key: String
  var text: String
  var `type`: DraftBlockType
}

object RawDraftContentBlock {
  @scala.inline
  def apply(
    depth: Double,
    entityRanges: js.Array[RawDraftEntityRange],
    inlineStyleRanges: js.Array[RawDraftInlineStyleRange],
    key: String,
    text: String,
    `type`: DraftBlockType,
    data: js.Object = null
  ): RawDraftContentBlock = {
    val __obj = js.Dynamic.literal(depth = depth, entityRanges = entityRanges, inlineStyleRanges = inlineStyleRanges, key = key, text = text)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[RawDraftContentBlock]
  }
}

