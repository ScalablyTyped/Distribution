package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderpaymentsNotifyChargeRequest extends js.Object {
  
  var chargeState: js.UndefOr[String] = js.native
  
  var invoiceId: js.UndefOr[String] = js.native
  
  var invoiceIds: js.UndefOr[js.Array[String]] = js.native
}
object OrderpaymentsNotifyChargeRequest {
  
  @scala.inline
  def apply(): OrderpaymentsNotifyChargeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderpaymentsNotifyChargeRequest]
  }
  
  @scala.inline
  implicit class OrderpaymentsNotifyChargeRequestOps[Self <: OrderpaymentsNotifyChargeRequest] (val x: Self) extends AnyVal {
    
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
    def setChargeState(value: String): Self = this.set("chargeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargeState: Self = this.set("chargeState", js.undefined)
    
    @scala.inline
    def setInvoiceId(value: String): Self = this.set("invoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceId: Self = this.set("invoiceId", js.undefined)
    
    @scala.inline
    def setInvoiceIdsVarargs(value: String*): Self = this.set("invoiceIds", js.Array(value :_*))
    
    @scala.inline
    def setInvoiceIds(value: js.Array[String]): Self = this.set("invoiceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceIds: Self = this.set("invoiceIds", js.undefined)
  }
}
