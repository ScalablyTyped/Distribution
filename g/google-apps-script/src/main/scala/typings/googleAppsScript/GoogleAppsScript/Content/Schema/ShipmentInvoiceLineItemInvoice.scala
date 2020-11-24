package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShipmentInvoiceLineItemInvoice extends js.Object {
  
  var lineItemId: js.UndefOr[String] = js.native
  
  var productId: js.UndefOr[String] = js.native
  
  var shipmentUnitIds: js.UndefOr[js.Array[String]] = js.native
  
  var unitInvoice: js.UndefOr[UnitInvoice] = js.native
}
object ShipmentInvoiceLineItemInvoice {
  
  @scala.inline
  def apply(): ShipmentInvoiceLineItemInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShipmentInvoiceLineItemInvoice]
  }
  
  @scala.inline
  implicit class ShipmentInvoiceLineItemInvoiceOps[Self <: ShipmentInvoiceLineItemInvoice] (val x: Self) extends AnyVal {
    
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
    def setLineItemId(value: String): Self = this.set("lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItemId: Self = this.set("lineItemId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setShipmentUnitIdsVarargs(value: String*): Self = this.set("shipmentUnitIds", js.Array(value :_*))
    
    @scala.inline
    def setShipmentUnitIds(value: js.Array[String]): Self = this.set("shipmentUnitIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentUnitIds: Self = this.set("shipmentUnitIds", js.undefined)
    
    @scala.inline
    def setUnitInvoice(value: UnitInvoice): Self = this.set("unitInvoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitInvoice: Self = this.set("unitInvoice", js.undefined)
  }
}
