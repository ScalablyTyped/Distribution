package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionTrialSettings extends js.Object {
  var isInTrial: js.UndefOr[scala.Boolean] = js.undefined
  var trialEndTime: js.UndefOr[java.lang.String] = js.undefined
}

object SubscriptionTrialSettings {
  @scala.inline
  def apply(isInTrial: js.UndefOr[scala.Boolean] = js.undefined, trialEndTime: java.lang.String = null): SubscriptionTrialSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isInTrial)) __obj.updateDynamic("isInTrial")(isInTrial)
    if (trialEndTime != null) __obj.updateDynamic("trialEndTime")(trialEndTime)
    __obj.asInstanceOf[SubscriptionTrialSettings]
  }
}

