package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitmentInterval extends js.Object {
  var commitmentInterval: js.UndefOr[EndTime] = js.native
  var isCommitmentPlan: js.UndefOr[Boolean] = js.native
  var planName: js.UndefOr[String] = js.native
}

object CommitmentInterval {
  @scala.inline
  def apply(
    commitmentInterval: EndTime = null,
    isCommitmentPlan: js.UndefOr[Boolean] = js.undefined,
    planName: String = null
  ): CommitmentInterval = {
    val __obj = js.Dynamic.literal()
    if (commitmentInterval != null) __obj.updateDynamic("commitmentInterval")(commitmentInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(isCommitmentPlan)) __obj.updateDynamic("isCommitmentPlan")(isCommitmentPlan.get.asInstanceOf[js.Any])
    if (planName != null) __obj.updateDynamic("planName")(planName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitmentInterval]
  }
}

