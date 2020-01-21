package typings.gapiClientReseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommitmentInterval extends js.Object {
  /** In this version of the API, annual commitment plan's interval is one year. */
  var commitmentInterval: js.UndefOr[AnonEndTime] = js.undefined
  /**
    * The isCommitmentPlan property's boolean value identifies the plan as an annual commitment plan:
    * - true — The subscription's plan is an annual commitment plan.
    * - false — The plan is not an annual commitment plan.
    */
  var isCommitmentPlan: js.UndefOr[Boolean] = js.undefined
  /**
    * The planName property is required. This is the name of the subscription's plan. For more information about the Google payment plans, see the API
    * concepts.
    *
    * Possible values are:
    * - ANNUAL_MONTHLY_PAY — The annual commitment plan with monthly payments
    * - ANNUAL_YEARLY_PAY — The annual commitment plan with yearly payments
    * - FLEXIBLE — The flexible plan
    * - TRIAL — The 30-day free trial plan. A subscription in trial will be suspended after the 30th free day if no payment plan is assigned. Calling
    * changePlan will assign a payment plan to a trial but will not activate the plan. A trial will automatically begin its assigned payment plan after its
    * 30th free day or immediately after calling startPaidService.
    */
  var planName: js.UndefOr[String] = js.undefined
}

object AnonCommitmentInterval {
  @scala.inline
  def apply(
    commitmentInterval: AnonEndTime = null,
    isCommitmentPlan: js.UndefOr[Boolean] = js.undefined,
    planName: String = null
  ): AnonCommitmentInterval = {
    val __obj = js.Dynamic.literal()
    if (commitmentInterval != null) __obj.updateDynamic("commitmentInterval")(commitmentInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(isCommitmentPlan)) __obj.updateDynamic("isCommitmentPlan")(isCommitmentPlan.asInstanceOf[js.Any])
    if (planName != null) __obj.updateDynamic("planName")(planName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommitmentInterval]
  }
}

