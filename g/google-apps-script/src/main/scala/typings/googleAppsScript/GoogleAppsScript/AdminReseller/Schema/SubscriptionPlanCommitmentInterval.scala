package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

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
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionPlanCommitmentInterval]
  }
}

