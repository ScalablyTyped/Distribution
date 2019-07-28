package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Measure extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var aggregation: js.UndefOr[String] = js.undefined
  var availableAggregations: js.UndefOr[js.Array[String]] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var formula: js.UndefOr[String] = js.undefined
  var grandTotalCaption: js.UndefOr[String] = js.undefined
  var uniqueName: js.UndefOr[String] = js.undefined
}

object Measure {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    aggregation: String = null,
    availableAggregations: js.Array[String] = null,
    caption: String = null,
    format: String = null,
    formula: String = null,
    grandTotalCaption: String = null,
    uniqueName: String = null
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

