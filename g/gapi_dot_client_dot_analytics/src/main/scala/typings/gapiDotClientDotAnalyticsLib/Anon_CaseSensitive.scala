package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitive extends js.Object {
  /** Indicates if the filter expressions are case sensitive. */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** Expression to extract from field A. */
  var extractA: js.UndefOr[java.lang.String] = js.undefined
  /** Expression to extract from field B. */
  var extractB: js.UndefOr[java.lang.String] = js.undefined
  /** Field A. */
  var fieldA: js.UndefOr[java.lang.String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldAIndex: js.UndefOr[scala.Double] = js.undefined
  /** Indicates if field A is required to match. */
  var fieldARequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Field B. */
  var fieldB: js.UndefOr[java.lang.String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldBIndex: js.UndefOr[scala.Double] = js.undefined
  /** Indicates if field B is required to match. */
  var fieldBRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Expression used to construct the output value. */
  var outputConstructor: js.UndefOr[java.lang.String] = js.undefined
  /** Output field. */
  var outputToField: js.UndefOr[java.lang.String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var outputToFieldIndex: js.UndefOr[scala.Double] = js.undefined
  /** Indicates if the existing value of the output field, if any, should be overridden by the output expression. */
  var overrideOutputField: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    extractA: java.lang.String = null,
    extractB: java.lang.String = null,
    fieldA: java.lang.String = null,
    fieldAIndex: scala.Int | scala.Double = null,
    fieldARequired: js.UndefOr[scala.Boolean] = js.undefined,
    fieldB: java.lang.String = null,
    fieldBIndex: scala.Int | scala.Double = null,
    fieldBRequired: js.UndefOr[scala.Boolean] = js.undefined,
    outputConstructor: java.lang.String = null,
    outputToField: java.lang.String = null,
    outputToFieldIndex: scala.Int | scala.Double = null,
    overrideOutputField: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (extractA != null) __obj.updateDynamic("extractA")(extractA)
    if (extractB != null) __obj.updateDynamic("extractB")(extractB)
    if (fieldA != null) __obj.updateDynamic("fieldA")(fieldA)
    if (fieldAIndex != null) __obj.updateDynamic("fieldAIndex")(fieldAIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldARequired)) __obj.updateDynamic("fieldARequired")(fieldARequired)
    if (fieldB != null) __obj.updateDynamic("fieldB")(fieldB)
    if (fieldBIndex != null) __obj.updateDynamic("fieldBIndex")(fieldBIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldBRequired)) __obj.updateDynamic("fieldBRequired")(fieldBRequired)
    if (outputConstructor != null) __obj.updateDynamic("outputConstructor")(outputConstructor)
    if (outputToField != null) __obj.updateDynamic("outputToField")(outputToField)
    if (outputToFieldIndex != null) __obj.updateDynamic("outputToFieldIndex")(outputToFieldIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideOutputField)) __obj.updateDynamic("overrideOutputField")(overrideOutputField)
    __obj.asInstanceOf[Anon_CaseSensitive]
  }
}

