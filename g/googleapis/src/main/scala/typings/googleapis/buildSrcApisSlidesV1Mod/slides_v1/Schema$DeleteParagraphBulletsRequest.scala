package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes bullets from all of the paragraphs that overlap with the given text
  * index range.  The nesting level of each paragraph will be visually
  * preserved by adding indent to the start of the corresponding paragraph.
  */
@js.native
trait Schema$DeleteParagraphBulletsRequest extends js.Object {
  /**
    * The optional table cell location if the text to be modified is in a table
    * cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[Schema$TableCellLocation] = js.native
  /**
    * The object ID of the shape or table containing the text to delete bullets
    * from.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The range of text to delete bullets from, based on TextElement indexes.
    */
  var textRange: js.UndefOr[Schema$Range] = js.native
}

object Schema$DeleteParagraphBulletsRequest {
  @scala.inline
  def apply(
    cellLocation: Schema$TableCellLocation = null,
    objectId: String = null,
    textRange: Schema$Range = null
  ): Schema$DeleteParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (textRange != null) __obj.updateDynamic("textRange")(textRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteParagraphBulletsRequest]
  }
}

