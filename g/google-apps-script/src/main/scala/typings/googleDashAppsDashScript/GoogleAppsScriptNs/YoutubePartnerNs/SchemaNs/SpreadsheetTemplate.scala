package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetTemplate extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var templateContent: js.UndefOr[String] = js.undefined
  var templateName: js.UndefOr[String] = js.undefined
  var templateType: js.UndefOr[String] = js.undefined
}

object SpreadsheetTemplate {
  @scala.inline
  def apply(
    kind: String = null,
    status: String = null,
    templateContent: String = null,
    templateName: String = null,
    templateType: String = null
  ): SpreadsheetTemplate = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (status != null) __obj.updateDynamic("status")(status)
    if (templateContent != null) __obj.updateDynamic("templateContent")(templateContent)
    if (templateName != null) __obj.updateDynamic("templateName")(templateName)
    if (templateType != null) __obj.updateDynamic("templateType")(templateType)
    __obj.asInstanceOf[SpreadsheetTemplate]
  }
}

