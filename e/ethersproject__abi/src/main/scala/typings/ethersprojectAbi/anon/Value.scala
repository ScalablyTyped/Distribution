package typings.ethersprojectAbi.anon

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var data: String
  var value: js.UndefOr[BigNumberish] = js.undefined
}

object Value {
  @scala.inline
  def apply(data: String, value: BigNumberish = null): Value = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

