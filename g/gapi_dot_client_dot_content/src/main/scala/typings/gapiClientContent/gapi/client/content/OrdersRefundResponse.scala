package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersRefundResponse extends js.Object {
  /** The status of the execution. */
  var executionStatus: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersRefundResponse". */
  var kind: js.UndefOr[String] = js.native
}

object OrdersRefundResponse {
  @scala.inline
  def apply(): OrdersRefundResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersRefundResponse]
  }
  @scala.inline
  implicit class OrdersRefundResponseOps[Self <: OrdersRefundResponse] (val x: Self) extends AnyVal {
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
    def setExecutionStatus(value: String): Self = this.set("executionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionStatus: Self = this.set("executionStatus", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

