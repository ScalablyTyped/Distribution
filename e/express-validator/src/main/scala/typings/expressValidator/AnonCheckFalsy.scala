package typings.expressValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckFalsy extends js.Object {
  var checkFalsy: js.UndefOr[Boolean] = js.undefined
  var checkNull: js.UndefOr[Boolean] = js.undefined
}

object AnonCheckFalsy {
  @scala.inline
  def apply(checkFalsy: js.UndefOr[Boolean] = js.undefined, checkNull: js.UndefOr[Boolean] = js.undefined): AnonCheckFalsy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkFalsy)) __obj.updateDynamic("checkFalsy")(checkFalsy.asInstanceOf[js.Any])
    if (!js.isUndefined(checkNull)) __obj.updateDynamic("checkNull")(checkNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckFalsy]
  }
}

