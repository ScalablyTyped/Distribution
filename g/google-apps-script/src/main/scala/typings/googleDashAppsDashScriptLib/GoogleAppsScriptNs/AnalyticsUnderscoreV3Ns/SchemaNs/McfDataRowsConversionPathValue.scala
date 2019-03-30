package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait McfDataRowsConversionPathValue extends js.Object {
  var interactionType: js.UndefOr[java.lang.String] = js.undefined
  var nodeValue: js.UndefOr[java.lang.String] = js.undefined
}

object McfDataRowsConversionPathValue {
  @scala.inline
  def apply(interactionType: java.lang.String = null, nodeValue: java.lang.String = null): McfDataRowsConversionPathValue = {
    val __obj = js.Dynamic.literal()
    if (interactionType != null) __obj.updateDynamic("interactionType")(interactionType)
    if (nodeValue != null) __obj.updateDynamic("nodeValue")(nodeValue)
    __obj.asInstanceOf[McfDataRowsConversionPathValue]
  }
}

