package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCreateTestOrderResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersCreateTestOrderResponse". */
  var kind: js.UndefOr[String] = js.native
  /** The ID of the newly created test order. */
  var orderId: js.UndefOr[String] = js.native
}

object OrdersCreateTestOrderResponse {
  @scala.inline
  def apply(): OrdersCreateTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCreateTestOrderResponse]
  }
  @scala.inline
  implicit class OrdersCreateTestOrderResponseOps[Self <: OrdersCreateTestOrderResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
  }
  
}

