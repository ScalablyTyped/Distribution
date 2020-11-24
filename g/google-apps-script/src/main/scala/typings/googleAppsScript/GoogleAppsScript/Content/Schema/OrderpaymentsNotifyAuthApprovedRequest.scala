package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderpaymentsNotifyAuthApprovedRequest extends js.Object {
  
  var authAmountPretax: js.UndefOr[Price] = js.native
  
  var authAmountTax: js.UndefOr[Price] = js.native
}
object OrderpaymentsNotifyAuthApprovedRequest {
  
  @scala.inline
  def apply(): OrderpaymentsNotifyAuthApprovedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderpaymentsNotifyAuthApprovedRequest]
  }
  
  @scala.inline
  implicit class OrderpaymentsNotifyAuthApprovedRequestOps[Self <: OrderpaymentsNotifyAuthApprovedRequest] (val x: Self) extends AnyVal {
    
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
    def setAuthAmountPretax(value: Price): Self = this.set("authAmountPretax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthAmountPretax: Self = this.set("authAmountPretax", js.undefined)
    
    @scala.inline
    def setAuthAmountTax(value: Price): Self = this.set("authAmountTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthAmountTax: Self = this.set("authAmountTax", js.undefined)
  }
}
