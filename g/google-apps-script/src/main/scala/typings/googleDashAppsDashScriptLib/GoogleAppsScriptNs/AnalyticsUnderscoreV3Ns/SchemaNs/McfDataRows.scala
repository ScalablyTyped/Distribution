package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait McfDataRows extends js.Object {
  var conversionPathValue: js.UndefOr[js.Array[McfDataRowsConversionPathValue]] = js.undefined
  var primitiveValue: js.UndefOr[java.lang.String] = js.undefined
}

object McfDataRows {
  @scala.inline
  def apply(
    conversionPathValue: js.Array[McfDataRowsConversionPathValue] = null,
    primitiveValue: java.lang.String = null
  ): McfDataRows = {
    val __obj = js.Dynamic.literal()
    if (conversionPathValue != null) __obj.updateDynamic("conversionPathValue")(conversionPathValue)
    if (primitiveValue != null) __obj.updateDynamic("primitiveValue")(primitiveValue)
    __obj.asInstanceOf[McfDataRows]
  }
}

