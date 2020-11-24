package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangePlanRequest extends js.Object {
  
  var dealCode: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var planName: js.UndefOr[String] = js.native
  
  var purchaseOrderId: js.UndefOr[String] = js.native
  
  var seats: js.UndefOr[Seats] = js.native
}
object ChangePlanRequest {
  
  @scala.inline
  def apply(): ChangePlanRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangePlanRequest]
  }
  
  @scala.inline
  implicit class ChangePlanRequestOps[Self <: ChangePlanRequest] (val x: Self) extends AnyVal {
    
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
    def setDealCode(value: String): Self = this.set("dealCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealCode: Self = this.set("dealCode", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPlanName(value: String): Self = this.set("planName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanName: Self = this.set("planName", js.undefined)
    
    @scala.inline
    def setPurchaseOrderId(value: String): Self = this.set("purchaseOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseOrderId: Self = this.set("purchaseOrderId", js.undefined)
    
    @scala.inline
    def setSeats(value: Seats): Self = this.set("seats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeats: Self = this.set("seats", js.undefined)
  }
}
