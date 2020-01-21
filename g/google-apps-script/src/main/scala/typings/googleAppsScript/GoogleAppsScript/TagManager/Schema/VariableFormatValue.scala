package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableFormatValue extends js.Object {
  var caseConversionType: js.UndefOr[String] = js.undefined
  var convertFalseToValue: js.UndefOr[Parameter] = js.undefined
  var convertNullToValue: js.UndefOr[Parameter] = js.undefined
  var convertTrueToValue: js.UndefOr[Parameter] = js.undefined
  var convertUndefinedToValue: js.UndefOr[Parameter] = js.undefined
}

object VariableFormatValue {
  @scala.inline
  def apply(
    caseConversionType: String = null,
    convertFalseToValue: Parameter = null,
    convertNullToValue: Parameter = null,
    convertTrueToValue: Parameter = null,
    convertUndefinedToValue: Parameter = null
  ): VariableFormatValue = {
    val __obj = js.Dynamic.literal()
    if (caseConversionType != null) __obj.updateDynamic("caseConversionType")(caseConversionType.asInstanceOf[js.Any])
    if (convertFalseToValue != null) __obj.updateDynamic("convertFalseToValue")(convertFalseToValue.asInstanceOf[js.Any])
    if (convertNullToValue != null) __obj.updateDynamic("convertNullToValue")(convertNullToValue.asInstanceOf[js.Any])
    if (convertTrueToValue != null) __obj.updateDynamic("convertTrueToValue")(convertTrueToValue.asInstanceOf[js.Any])
    if (convertUndefinedToValue != null) __obj.updateDynamic("convertUndefinedToValue")(convertUndefinedToValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableFormatValue]
  }
}

