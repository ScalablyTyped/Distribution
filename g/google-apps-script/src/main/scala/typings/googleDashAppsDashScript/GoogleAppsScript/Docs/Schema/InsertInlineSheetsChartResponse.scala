package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertInlineSheetsChartResponse extends js.Object {
  var objectId: js.UndefOr[String] = js.undefined
}

object InsertInlineSheetsChartResponse {
  @scala.inline
  def apply(objectId: String = null): InsertInlineSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertInlineSheetsChartResponse]
  }
}

