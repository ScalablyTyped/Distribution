package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$VariableFormatValue extends js.Object {
  /**
    * The option to convert a string-type variable value to either lowercase or
    * uppercase.
    */
  var caseConversionType: js.UndefOr[String] = js.native
  /**
    * The value to convert if a variable value is false.
    */
  var convertFalseToValue: js.UndefOr[Schema$Parameter] = js.native
  /**
    * The value to convert if a variable value is null.
    */
  var convertNullToValue: js.UndefOr[Schema$Parameter] = js.native
  /**
    * The value to convert if a variable value is true.
    */
  var convertTrueToValue: js.UndefOr[Schema$Parameter] = js.native
  /**
    * The value to convert if a variable value is undefined.
    */
  var convertUndefinedToValue: js.UndefOr[Schema$Parameter] = js.native
}

object Schema$VariableFormatValue {
  @scala.inline
  def apply(
    caseConversionType: String = null,
    convertFalseToValue: Schema$Parameter = null,
    convertNullToValue: Schema$Parameter = null,
    convertTrueToValue: Schema$Parameter = null,
    convertUndefinedToValue: Schema$Parameter = null
  ): Schema$VariableFormatValue = {
    val __obj = js.Dynamic.literal()
    if (caseConversionType != null) __obj.updateDynamic("caseConversionType")(caseConversionType.asInstanceOf[js.Any])
    if (convertFalseToValue != null) __obj.updateDynamic("convertFalseToValue")(convertFalseToValue.asInstanceOf[js.Any])
    if (convertNullToValue != null) __obj.updateDynamic("convertNullToValue")(convertNullToValue.asInstanceOf[js.Any])
    if (convertTrueToValue != null) __obj.updateDynamic("convertTrueToValue")(convertTrueToValue.asInstanceOf[js.Any])
    if (convertUndefinedToValue != null) __obj.updateDynamic("convertUndefinedToValue")(convertUndefinedToValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VariableFormatValue]
  }
}

