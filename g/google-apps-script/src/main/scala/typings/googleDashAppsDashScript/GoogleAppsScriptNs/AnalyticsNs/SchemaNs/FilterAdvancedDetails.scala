package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterAdvancedDetails extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var extractA: js.UndefOr[String] = js.undefined
  var extractB: js.UndefOr[String] = js.undefined
  var fieldA: js.UndefOr[String] = js.undefined
  var fieldAIndex: js.UndefOr[Double] = js.undefined
  var fieldARequired: js.UndefOr[Boolean] = js.undefined
  var fieldB: js.UndefOr[String] = js.undefined
  var fieldBIndex: js.UndefOr[Double] = js.undefined
  var fieldBRequired: js.UndefOr[Boolean] = js.undefined
  var outputConstructor: js.UndefOr[String] = js.undefined
  var outputToField: js.UndefOr[String] = js.undefined
  var outputToFieldIndex: js.UndefOr[Double] = js.undefined
  var overrideOutputField: js.UndefOr[Boolean] = js.undefined
}

object FilterAdvancedDetails {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    extractA: String = null,
    extractB: String = null,
    fieldA: String = null,
    fieldAIndex: Int | Double = null,
    fieldARequired: js.UndefOr[Boolean] = js.undefined,
    fieldB: String = null,
    fieldBIndex: Int | Double = null,
    fieldBRequired: js.UndefOr[Boolean] = js.undefined,
    outputConstructor: String = null,
    outputToField: String = null,
    outputToFieldIndex: Int | Double = null,
    overrideOutputField: js.UndefOr[Boolean] = js.undefined
  ): FilterAdvancedDetails = {
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
    __obj.asInstanceOf[FilterAdvancedDetails]
  }
}

