package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetTemplateListResponse extends js.Object {
  var items: js.UndefOr[js.Array[SpreadsheetTemplate]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object SpreadsheetTemplateListResponse {
  @scala.inline
  def apply(items: js.Array[SpreadsheetTemplate] = null, kind: String = null, status: String = null): SpreadsheetTemplateListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetTemplateListResponse]
  }
}

