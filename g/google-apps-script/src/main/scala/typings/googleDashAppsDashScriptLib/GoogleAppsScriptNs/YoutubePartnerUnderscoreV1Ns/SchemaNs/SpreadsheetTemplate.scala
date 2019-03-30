package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetTemplate extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var templateContent: js.UndefOr[java.lang.String] = js.undefined
  var templateName: js.UndefOr[java.lang.String] = js.undefined
  var templateType: js.UndefOr[java.lang.String] = js.undefined
}

object SpreadsheetTemplate {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    status: java.lang.String = null,
    templateContent: java.lang.String = null,
    templateName: java.lang.String = null,
    templateType: java.lang.String = null
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

