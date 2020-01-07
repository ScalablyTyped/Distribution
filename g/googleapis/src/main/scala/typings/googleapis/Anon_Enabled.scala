package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Enabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var lockedTime: js.UndefOr[String] = js.native
}

object Anon_Enabled {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, lockedTime: String = null): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (lockedTime != null) __obj.updateDynamic("lockedTime")(lockedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Enabled]
  }
}

