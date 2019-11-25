package typings.easyDashXapiDashSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowHalfOpenBoolean extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
}

object Anon_AllowHalfOpenBoolean {
  @scala.inline
  def apply(allowHalfOpen: js.UndefOr[Boolean] = js.undefined): Anon_AllowHalfOpenBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowHalfOpenBoolean]
  }
}

