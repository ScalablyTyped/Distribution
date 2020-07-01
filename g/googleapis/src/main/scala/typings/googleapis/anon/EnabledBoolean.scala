package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnabledBoolean extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
}

object EnabledBoolean {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): EnabledBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledBoolean]
  }
}

