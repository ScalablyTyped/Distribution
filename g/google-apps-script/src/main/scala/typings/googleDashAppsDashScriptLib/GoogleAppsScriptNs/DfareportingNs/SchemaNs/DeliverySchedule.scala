package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliverySchedule extends js.Object {
  var frequencyCap: js.UndefOr[FrequencyCap] = js.undefined
  var hardCutoff: js.UndefOr[scala.Boolean] = js.undefined
  var impressionRatio: js.UndefOr[java.lang.String] = js.undefined
  var priority: js.UndefOr[java.lang.String] = js.undefined
}

object DeliverySchedule {
  @scala.inline
  def apply(
    frequencyCap: FrequencyCap = null,
    hardCutoff: js.UndefOr[scala.Boolean] = js.undefined,
    impressionRatio: java.lang.String = null,
    priority: java.lang.String = null
  ): DeliverySchedule = {
    val __obj = js.Dynamic.literal()
    if (frequencyCap != null) __obj.updateDynamic("frequencyCap")(frequencyCap)
    if (!js.isUndefined(hardCutoff)) __obj.updateDynamic("hardCutoff")(hardCutoff)
    if (impressionRatio != null) __obj.updateDynamic("impressionRatio")(impressionRatio)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    __obj.asInstanceOf[DeliverySchedule]
  }
}

