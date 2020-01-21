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
    timeMillis: Int | Double = null,
    timePercent: Int | Double = null,
    viewabilityPercent: Int | Double = null
  ): CustomViewabilityMetricConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible.asInstanceOf[js.Any])
    if (timeMillis != null) __obj.updateDynamic("timeMillis")(timeMillis.asInstanceOf[js.Any])
    if (timePercent != null) __obj.updateDynamic("timePercent")(timePercent.asInstanceOf[js.Any])
    if (viewabilityPercent != null) __obj.updateDynamic("viewabilityPercent")(viewabilityPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomViewabilityMetricConfiguration]
  }
}

