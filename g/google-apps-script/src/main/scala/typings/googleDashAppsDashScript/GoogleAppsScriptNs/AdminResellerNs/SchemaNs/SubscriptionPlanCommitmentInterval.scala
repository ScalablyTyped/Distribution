package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionPlanCommitmentInterval extends js.Object {
  var endTime: js.UndefOr[String] = js.undefined
  var startTime: js.UndefOr[String] = js.undefined
}

object SubscriptionPlanCommitmentInterval {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): SubscriptionPlanCommitmentInterval = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[SubscriptionPlanCommitmentInterval]
  }
}

