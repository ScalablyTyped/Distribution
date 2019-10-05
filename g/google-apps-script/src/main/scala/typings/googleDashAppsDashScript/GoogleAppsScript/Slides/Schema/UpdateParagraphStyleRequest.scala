package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateParagraphStyleRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.ParagraphStyle] = js.undefined
  var textRange: js.UndefOr[Range] = js.undefined
}

object UpdateParagraphStyleRequest {
  @scala.inline
  def apply(
    cellLocation: TableCellLocation = null,
    fields: String = null,
    objectId: String = null,
    style: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.ParagraphStyle = null,
    textRange: Range = null
  ): UpdateParagraphStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (style != null) __obj.updateDynamic("style")(style)
    if (textRange != null) __obj.updateDynamic("textRange")(textRange)
    __obj.asInstanceOf[UpdateParagraphStyleRequest]
  }
}

