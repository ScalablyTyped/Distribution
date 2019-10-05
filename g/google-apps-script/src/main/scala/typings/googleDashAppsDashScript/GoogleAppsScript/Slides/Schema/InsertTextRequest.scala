package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTextRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var insertionIndex: js.UndefOr[Double] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object InsertTextRequest {
  @scala.inline
  def apply(
    cellLocation: TableCellLocation = null,
    insertionIndex: Int | Double = null,
    objectId: String = null,
    text: String = null
  ): InsertTextRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (insertionIndex != null) __obj.updateDynamic("insertionIndex")(insertionIndex.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[InsertTextRequest]
  }
}

