package typings.errCode.anon

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  var code: NonNullable[js.UndefOr[scala.Nothing]]
}

object `3` {
  @scala.inline
  def apply(code: js.UndefOr[NonNullable[js.UndefOr[scala.Nothing]]] = js.undefined): `3` = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
}

