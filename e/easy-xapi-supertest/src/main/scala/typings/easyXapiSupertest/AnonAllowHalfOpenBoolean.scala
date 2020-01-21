package typings.easyXapiSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowHalfOpenBoolean extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
}

object AnonAllowHalfOpenBoolean {
  @scala.inline
  def apply(allowHalfOpen: js.UndefOr[Boolean] = js.undefined): AnonAllowHalfOpenBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowHalfOpenBoolean]
  }
}

