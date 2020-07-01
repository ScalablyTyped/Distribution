package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var lockedTime: js.UndefOr[String] = js.native
}

object Enabled {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, lockedTime: String = null): Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (lockedTime != null) __obj.updateDynamic("lockedTime")(lockedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
}

