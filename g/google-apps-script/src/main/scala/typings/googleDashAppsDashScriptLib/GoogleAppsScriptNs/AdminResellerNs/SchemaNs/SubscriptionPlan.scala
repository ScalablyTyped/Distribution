package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionPlan extends js.Object {
  var commitmentInterval: js.UndefOr[SubscriptionPlanCommitmentInterval] = js.undefined
  var isCommitmentPlan: js.UndefOr[scala.Boolean] = js.undefined
  var planName: js.UndefOr[java.lang.String] = js.undefined
}

object SubscriptionPlan {
  @scala.inline
  def apply(
    commitmentInterval: SubscriptionPlanCommitmentInterval = null,
    isCommitmentPlan: js.UndefOr[scala.Boolean] = js.undefined,
    planName: java.lang.String = null
  ): SubscriptionPlan = {
    val __obj = js.Dynamic.literal()
    if (commitmentInterval != null) __obj.updateDynamic("commitmentInterval")(commitmentInterval)
    if (!js.isUndefined(isCommitmentPlan)) __obj.updateDynamic("isCommitmentPlan")(isCommitmentPlan)
    if (planName != null) __obj.updateDynamic("planName")(planName)
    __obj.asInstanceOf[SubscriptionPlan]
  }
}

