package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomViewabilityMetricConfiguration extends js.Object {
  var audible: js.UndefOr[scala.Boolean] = js.undefined
  var timeMillis: js.UndefOr[scala.Double] = js.undefined
  var timePercent: js.UndefOr[scala.Double] = js.undefined
  var viewabilityPercent: js.UndefOr[scala.Double] = js.undefined
}

object CustomViewabilityMetricConfiguration {
  @scala.inline
  def apply(
    audible: js.UndefOr[scala.Boolean] = js.undefined,
    timeMillis: scala.Int | scala.Double = null,
    timePercent: scala.Int | scala.Double = null,
    viewabilityPercent: scala.Int | scala.Double = null
  ): CustomViewabilityMetricConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible)
    if (timeMillis != null) __obj.updateDynamic("timeMillis")(timeMillis.asInstanceOf[js.Any])
    if (timePercent != null) __obj.updateDynamic("timePercent")(timePercent.asInstanceOf[js.Any])
    if (viewabilityPercent != null) __obj.updateDynamic("viewabilityPercent")(viewabilityPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomViewabilityMetricConfiguration]
  }
}

