package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaseSensitive extends js.Object {
  /** Indicates if the filter expressions are case sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /** Expression to extract from field A. */
  var extractA: js.UndefOr[String] = js.undefined
  /** Expression to extract from field B. */
  var extractB: js.UndefOr[String] = js.undefined
  /** Field A. */
  var fieldA: js.UndefOr[String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldAIndex: js.UndefOr[Double] = js.undefined
  /** Indicates if field A is required to match. */
  var fieldARequired: js.UndefOr[Boolean] = js.undefined
  /** Field B. */
  var fieldB: js.UndefOr[String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldBIndex: js.UndefOr[Double] = js.undefined
  /** Indicates if field B is required to match. */
  var fieldBRequired: js.UndefOr[Boolean] = js.undefined
  /** Expression used to construct the output value. */
  var outputConstructor: js.UndefOr[String] = js.undefined
  /** Output field. */
  var outputToField: js.UndefOr[String] = js.undefined
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var outputToFieldIndex: js.UndefOr[Double] = js.undefined
  /** Indicates if the existing value of the output field, if any, should be overridden by the output expression. */
  var overrideOutputField: js.UndefOr[Boolean] = js.undefined
}

object CaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    extractA: String = null,
    extractB: String = null,
    fieldA: String = null,
    fieldAIndex: js.UndefOr[Double] = js.undefined,
    fieldARequired: js.UndefOr[Boolean] = js.undefined,
    fieldB: String = null,
    fieldBIndex: js.UndefOr[Double] = js.undefined,
    fieldBRequired: js.UndefOr[Boolean] = js.undefined,
    outputConstructor: String = null,
    outputToField: String = null,
    outputToFieldIndex: js.UndefOr[Double] = js.undefined,
    overrideOutputField: js.UndefOr[Boolean] = js.undefined
  ): CaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (extractA != null) __obj.updateDynamic("extractA")(extractA.asInstanceOf[js.Any])
    if (extractB != null) __obj.updateDynamic("extractB")(extractB.asInstanceOf[js.Any])
    if (fieldA != null) __obj.updateDynamic("fieldA")(fieldA.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldAIndex)) __obj.updateDynamic("fieldAIndex")(fieldAIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldARequired)) __obj.updateDynamic("fieldARequired")(fieldARequired.get.asInstanceOf[js.Any])
    if (fieldB != null) __obj.updateDynamic("fieldB")(fieldB.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldBIndex)) __obj.updateDynamic("fieldBIndex")(fieldBIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldBRequired)) __obj.updateDynamic("fieldBRequired")(fieldBRequired.get.asInstanceOf[js.Any])
    if (outputConstructor != null) __obj.updateDynamic("outputConstructor")(outputConstructor.asInstanceOf[js.Any])
    if (outputToField != null) __obj.updateDynamic("outputToField")(outputToField.asInstanceOf[js.Any])
    if (!js.isUndefined(outputToFieldIndex)) __obj.updateDynamic("outputToFieldIndex")(outputToFieldIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideOutputField)) __obj.updateDynamic("overrideOutputField")(overrideOutputField.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
}

