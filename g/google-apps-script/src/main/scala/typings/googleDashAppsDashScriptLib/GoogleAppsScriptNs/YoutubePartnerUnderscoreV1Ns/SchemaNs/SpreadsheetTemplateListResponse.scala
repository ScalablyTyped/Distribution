package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetTemplateListResponse extends js.Object {
  var items: js.UndefOr[js.Array[SpreadsheetTemplate]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object SpreadsheetTemplateListResponse {
  @scala.inline
  def apply(
    items: js.Array[SpreadsheetTemplate] = null,
    kind: java.lang.String = null,
    status: java.lang.String = null
  ): SpreadsheetTemplateListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[SpreadsheetTemplateListResponse]
  }
}

