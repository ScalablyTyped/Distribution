package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IsInTrial extends js.Object {
  var isInTrial: js.UndefOr[Boolean] = js.native
  var trialEndTime: js.UndefOr[String] = js.native
}

object Anon_IsInTrial {
  @scala.inline
  def apply(isInTrial: js.UndefOr[Boolean] = js.undefined, trialEndTime: String = null): Anon_IsInTrial = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isInTrial)) __obj.updateDynamic("isInTrial")(isInTrial.asInstanceOf[js.Any])
    if (trialEndTime != null) __obj.updateDynamic("trialEndTime")(trialEndTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsInTrial]
  }
}

