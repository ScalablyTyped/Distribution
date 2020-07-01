package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsInTrial extends js.Object {
  var isInTrial: js.UndefOr[Boolean] = js.native
  var trialEndTime: js.UndefOr[String] = js.native
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

