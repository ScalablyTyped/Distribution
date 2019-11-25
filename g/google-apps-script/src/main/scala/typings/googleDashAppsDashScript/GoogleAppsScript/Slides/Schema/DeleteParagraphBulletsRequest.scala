package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteParagraphBulletsRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var textRange: js.UndefOr[Range] = js.undefined
}

object DeleteParagraphBulletsRequest {
  @scala.inline
  def apply(cellLocation: TableCellLocation = null, objectId: String = null, textRange: Range = null): DeleteParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (textRange != null) __obj.updateDynamic("textRange")(textRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParagraphBulletsRequest]
  }
}

