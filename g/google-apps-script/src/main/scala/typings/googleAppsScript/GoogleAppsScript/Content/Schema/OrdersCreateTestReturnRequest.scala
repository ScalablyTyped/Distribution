package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCreateTestReturnRequest extends js.Object {
  var items: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryCreateTestReturnReturnItem]] = js.native
}

object OrdersCreateTestReturnRequest {
  @scala.inline
  def apply(): OrdersCreateTestReturnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCreateTestReturnRequest]
  }
  @scala.inline
  implicit class OrdersCreateTestReturnRequestOps[Self <: OrdersCreateTestReturnRequest] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: OrdersCustomBatchRequestEntryCreateTestReturnReturnItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[OrdersCustomBatchRequestEntryCreateTestReturnReturnItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

