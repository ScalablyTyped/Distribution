package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Measure extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var aggregation: js.UndefOr[java.lang.String] = js.undefined
  var availableAggregations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var formula: js.UndefOr[java.lang.String] = js.undefined
  var grandTotalCaption: js.UndefOr[java.lang.String] = js.undefined
  var uniqueName: js.UndefOr[java.lang.String] = js.undefined
}

object Measure {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    aggregation: java.lang.String = null,
    availableAggregations: js.Array[java.lang.String] = null,
    caption: java.lang.String = null,
    format: java.lang.String = null,
    formula: java.lang.String = null,
    grandTotalCaption: java.lang.String = null,
    uniqueName: java.lang.String = null
  ): Measure = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (aggregation != null) __obj.updateDynamic("aggregation")(aggregation)
    if (availableAggregations != null) __obj.updateDynamic("availableAggregations")(availableAggregations)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (grandTotalCaption != null) __obj.updateDynamic("grandTotalCaption")(grandTotalCaption)
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName)
    __obj.asInstanceOf[Measure]
  }
}

