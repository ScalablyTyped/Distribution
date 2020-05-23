package typings.gapiClientReseller.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsInTrial extends js.Object {
  /**
    * Determines if a subscription's plan is in a 30-day free trial or not:
    * - true — The plan is in trial.
    * - false — The plan is not in trial.
    */
  var isInTrial: js.UndefOr[Boolean] = js.undefined
  /** Date when the trial ends. The value is in milliseconds using the UNIX Epoch format. See an example Epoch converter. */
  var trialEndTime: js.UndefOr[String] = js.undefined
}

object IsInTrial {
  @scala.inline
  def apply(isInTrial: js.UndefOr[Boolean] = js.undefined, trialEndTime: String = null): IsInTrial = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isInTrial)) __obj.updateDynamic("isInTrial")(isInTrial.get.asInstanceOf[js.Any])
    if (trialEndTime != null) __obj.updateDynamic("trialEndTime")(trialEndTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInTrial]
  }
}

