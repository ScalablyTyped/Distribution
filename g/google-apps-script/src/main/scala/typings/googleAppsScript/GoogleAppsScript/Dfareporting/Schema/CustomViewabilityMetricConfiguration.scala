package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomViewabilityMetricConfiguration extends js.Object {
  var audible: js.UndefOr[Boolean] = js.undefined
  var timeMillis: js.UndefOr[Double] = js.undefined
  var timePercent: js.UndefOr[Double] = js.undefined
  var viewabilityPercent: js.UndefOr[Double] = js.undefined
}

object CustomViewabilityMetricConfiguration {
  @scala.inline
  def apply(
    audible: js.UndefOr[Boolean] = js.undefined,
    timeMillis: js.UndefOr[Double] = js.undefined,
    timePercent: js.UndefOr[Double] = js.undefined,
    viewabilityPercent: js.UndefOr[Double] = js.undefined
  ): CustomViewabilityMetricConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeMillis)) __obj.updateDynamic("timeMillis")(timeMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timePercent)) __obj.updateDynamic("timePercent")(timePercent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewabilityPercent)) __obj.updateDynamic("viewabilityPercent")(viewabilityPercent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomViewabilityMetricConfiguration]
  }
}

