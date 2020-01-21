package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommitmentInterval extends js.Object {
  var commitmentInterval: js.UndefOr[AnonEndTime] = js.native
  var isCommitmentPlan: js.UndefOr[Boolean] = js.native
  var planName: js.UndefOr[String] = js.native
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

