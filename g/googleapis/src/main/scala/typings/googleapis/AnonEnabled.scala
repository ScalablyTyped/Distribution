package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var lockedTime: js.UndefOr[String] = js.native
}

object AnonEnabled {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, lockedTime: String = null): AnonEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (lockedTime != null) __obj.updateDynamic("lockedTime")(lockedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnabled]
  }
}

