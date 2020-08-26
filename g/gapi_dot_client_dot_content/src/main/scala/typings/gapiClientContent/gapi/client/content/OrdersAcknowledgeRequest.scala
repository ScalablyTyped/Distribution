package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersAcknowledgeRequest extends js.Object {
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.native
}

object OrdersAcknowledgeRequest {
  @scala.inline
  def apply(): OrdersAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersAcknowledgeRequest]
  }
  @scala.inline
  implicit class OrdersAcknowledgeRequestOps[Self <: OrdersAcknowledgeRequest] (val x: Self) extends AnyVal {
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
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
  }
  
}

