package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnabledBoolean extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
}

object AnonEnabledBoolean {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): AnonEnabledBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnabledBoolean]
  }
}

