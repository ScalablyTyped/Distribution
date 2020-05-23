package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionPlan extends js.Object {
  var commitmentInterval: js.UndefOr[SubscriptionPlanCommitmentInterval] = js.undefined
  var isCommitmentPlan: js.UndefOr[Boolean] = js.undefined
  var planName: js.UndefOr[String] = js.undefined
}

object SubscriptionPlan {
  @scala.inline
  def apply(
    commitmentInterval: SubscriptionPlanCommitmentInterval = null,
    isCommitmentPlan: js.UndefOr[Boolean] = js.undefined,
    planName: String = null
  ): SubscriptionPlan = {
    val __obj = js.Dynamic.literal()
    if (commitmentInterval != null) __obj.updateDynamic("commitmentInterval")(commitmentInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(isCommitmentPlan)) __obj.updateDynamic("isCommitmentPlan")(isCommitmentPlan.get.asInstanceOf[js.Any])
    if (planName != null) __obj.updateDynamic("planName")(planName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionPlan]
  }
}

