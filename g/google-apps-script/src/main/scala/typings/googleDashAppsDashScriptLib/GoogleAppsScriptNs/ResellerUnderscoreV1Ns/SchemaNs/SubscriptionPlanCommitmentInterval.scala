package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionPlanCommitmentInterval extends js.Object {
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

object SubscriptionPlanCommitmentInterval {
  @scala.inline
  def apply(endTime: java.lang.String = null, startTime: java.lang.String = null): SubscriptionPlanCommitmentInterval = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[SubscriptionPlanCommitmentInterval]
  }
}

