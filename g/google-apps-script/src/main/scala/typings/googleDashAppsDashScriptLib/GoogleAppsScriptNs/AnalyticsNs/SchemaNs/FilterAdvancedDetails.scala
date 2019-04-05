package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterAdvancedDetails extends js.Object {
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var extractA: js.UndefOr[java.lang.String] = js.undefined
  var extractB: js.UndefOr[java.lang.String] = js.undefined
  var fieldA: js.UndefOr[java.lang.String] = js.undefined
  var fieldAIndex: js.UndefOr[scala.Double] = js.undefined
  var fieldARequired: js.UndefOr[scala.Boolean] = js.undefined
  var fieldB: js.UndefOr[java.lang.String] = js.undefined
  var fieldBIndex: js.UndefOr[scala.Double] = js.undefined
  var fieldBRequired: js.UndefOr[scala.Boolean] = js.undefined
  var outputConstructor: js.UndefOr[java.lang.String] = js.undefined
  var outputToField: js.UndefOr[java.lang.String] = js.undefined
  var outputToFieldIndex: js.UndefOr[scala.Double] = js.undefined
  var overrideOutputField: js.UndefOr[scala.Boolean] = js.undefined
}

object FilterAdvancedDetails {
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

