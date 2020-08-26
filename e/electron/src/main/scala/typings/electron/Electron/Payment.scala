package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payment extends js.Object {
  /**
    * The identifier of the purchased product.
    */
  var productIdentifier: String = js.native
  /**
    * The quantity purchased.
    */
  var quantity: Double = js.native
}

object Payment {
  @scala.inline
  def apply(productIdentifier: String, quantity: Double): Payment = {
    val __obj = js.Dynamic.literal(productIdentifier = productIdentifier.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment]
  }
  @scala.inline
  implicit class PaymentOps[Self <: Payment] (val x: Self) extends AnyVal {
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
    def setProductIdentifier(value: String): Self = this.set("productIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
  }
  
}

