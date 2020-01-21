package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsInTrial extends js.Object {
  var isInTrial: js.UndefOr[Boolean] = js.native
  var trialEndTime: js.UndefOr[String] = js.native
}

object AnonIsInTrial {
  @scala.inline
  def apply(isInTrial: js.UndefOr[Boolean] = js.undefined, trialEndTime: String = null): AnonIsInTrial = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isInTrial)) __obj.updateDynamic("isInTrial")(isInTrial.asInstanceOf[js.Any])
    if (trialEndTime != null) __obj.updateDynamic("trialEndTime")(trialEndTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsInTrial]
  }
}

