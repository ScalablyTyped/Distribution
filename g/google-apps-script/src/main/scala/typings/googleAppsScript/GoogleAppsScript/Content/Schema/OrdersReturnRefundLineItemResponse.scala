package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersReturnRefundLineItemResponse extends js.Object {
  
  var executionStatus: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object OrdersReturnRefundLineItemResponse {
  
  @scala.inline
  def apply(): OrdersReturnRefundLineItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersReturnRefundLineItemResponse]
  }
  
  @scala.inline
  implicit class OrdersReturnRefundLineItemResponseOps[Self <: OrdersReturnRefundLineItemResponse] (val x: Self) extends AnyVal {
    
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
