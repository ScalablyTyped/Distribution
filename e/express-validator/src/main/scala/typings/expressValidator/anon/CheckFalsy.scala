package typings.expressValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckFalsy extends js.Object {
  var checkFalsy: js.UndefOr[Boolean] = js.undefined
  var checkNull: js.UndefOr[Boolean] = js.undefined
}

object CheckFalsy {
  @scala.inline
  def apply(checkFalsy: js.UndefOr[Boolean] = js.undefined, checkNull: js.UndefOr[Boolean] = js.undefined): CheckFalsy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkFalsy)) __obj.updateDynamic("checkFalsy")(checkFalsy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkNull)) __obj.updateDynamic("checkNull")(checkNull.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckFalsy]
  }
}

