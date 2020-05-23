package typings.easyXHeaders.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowHalfOpenBoolean extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
}

object AllowHalfOpenBoolean {
  @scala.inline
  def apply(allowHalfOpen: js.UndefOr[Boolean] = js.undefined): AllowHalfOpenBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowHalfOpenBoolean]
  }
}

