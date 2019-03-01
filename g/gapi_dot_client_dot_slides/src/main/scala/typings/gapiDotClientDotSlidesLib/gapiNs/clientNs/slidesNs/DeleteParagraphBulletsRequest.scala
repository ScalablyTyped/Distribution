package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteParagraphBulletsRequest extends js.Object {
  /**
    * The optional table cell location if the text to be modified is in a table
    * cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  /**
    * The object ID of the shape or table containing the text to delete bullets
    * from.
    */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /** The range of text to delete bullets from, based on TextElement indexes. */
  var textRange: js.UndefOr[Range] = js.undefined
}

object DeleteParagraphBulletsRequest {
  @scala.inline
  def apply(cellLocation: TableCellLocation = null, objectId: java.lang.String = null, textRange: Range = null): DeleteParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (textRange != null) __obj.updateDynamic("textRange")(textRange)
    __obj.asInstanceOf[DeleteParagraphBulletsRequest]
  }
}

