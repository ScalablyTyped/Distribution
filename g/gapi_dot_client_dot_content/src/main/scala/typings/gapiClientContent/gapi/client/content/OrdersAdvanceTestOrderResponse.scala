package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersAdvanceTestOrderResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersAdvanceTestOrderResponse". */
  var kind: js.UndefOr[String] = js.native
}

object OrdersAdvanceTestOrderResponse {
  @scala.inline
  def apply(): OrdersAdvanceTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersAdvanceTestOrderResponse]
  }
  @scala.inline
  implicit class OrdersAdvanceTestOrderResponseOps[Self <: OrdersAdvanceTestOrderResponse] (val x: Self) extends AnyVal {
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
  }
  
}

