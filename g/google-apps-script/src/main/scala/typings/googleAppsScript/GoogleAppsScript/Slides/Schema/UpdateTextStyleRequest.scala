package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTextStyleRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[TextStyle] = js.undefined
  var textRange: js.UndefOr[Range] = js.undefined
}

object UpdateTextStyleRequest {
  @scala.inline
  def apply(
    cellLocation: TableCellLocation = null,
    fields: String = null,
    objectId: String = null,
    style: TextStyle = null,
    textRange: Range = null
  ): UpdateTextStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textRange != null) __obj.updateDynamic("textRange")(textRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTextStyleRequest]
  }
}

