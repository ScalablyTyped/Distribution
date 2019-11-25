package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

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
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (templateContent != null) __obj.updateDynamic("templateContent")(templateContent.asInstanceOf[js.Any])
    if (templateName != null) __obj.updateDynamic("templateName")(templateName.asInstanceOf[js.Any])
    if (templateType != null) __obj.updateDynamic("templateType")(templateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetTemplate]
  }
}

