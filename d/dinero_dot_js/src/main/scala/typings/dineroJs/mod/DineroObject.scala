package typings.dineroJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DineroObject extends js.Object {
  var amount: Double = js.native
  var currency: Currency = js.native
  var precision: Double = js.native
}

object DineroObject {
  @scala.inline
  def apply(amount: Double, currency: Currency, precision: Double): DineroObject = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[DineroObject]
  }
  @scala.inline
  implicit class DineroObjectOps[Self <: DineroObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: Currency): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
  }
  
}

