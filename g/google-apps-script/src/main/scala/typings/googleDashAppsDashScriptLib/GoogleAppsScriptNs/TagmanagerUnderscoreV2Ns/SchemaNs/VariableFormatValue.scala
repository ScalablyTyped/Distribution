package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableFormatValue extends js.Object {
  var caseConversionType: js.UndefOr[java.lang.String] = js.undefined
  var convertFalseToValue: js.UndefOr[Parameter] = js.undefined
  var convertNullToValue: js.UndefOr[Parameter] = js.undefined
  var convertTrueToValue: js.UndefOr[Parameter] = js.undefined
  var convertUndefinedToValue: js.UndefOr[Parameter] = js.undefined
}

object VariableFormatValue {
  @scala.inline
  def apply(
    caseConversionType: java.lang.String = null,
    convertFalseToValue: Parameter = null,
    convertNullToValue: Parameter = null,
    convertTrueToValue: Parameter = null,
    convertUndefinedToValue: Parameter = null
  ): VariableFormatValue = {
    val __obj = js.Dynamic.literal()
    if (caseConversionType != null) __obj.updateDynamic("caseConversionType")(caseConversionType)
    if (convertFalseToValue != null) __obj.updateDynamic("convertFalseToValue")(convertFalseToValue)
    if (convertNullToValue != null) __obj.updateDynamic("convertNullToValue")(convertNullToValue)
    if (convertTrueToValue != null) __obj.updateDynamic("convertTrueToValue")(convertTrueToValue)
    if (convertUndefinedToValue != null) __obj.updateDynamic("convertUndefinedToValue")(convertUndefinedToValue)
    __obj.asInstanceOf[VariableFormatValue]
  }
}

