package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersShipLineItemsRequest extends js.Object {
  
  var carrier: js.UndefOr[String] = js.native
  
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.native
  
  var operationId: js.UndefOr[String] = js.native
  
  var shipmentGroupId: js.UndefOr[String] = js.native
  
  var shipmentId: js.UndefOr[String] = js.native
  
  var shipmentInfos: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.native
  
  var trackingId: js.UndefOr[String] = js.native
}
object OrdersShipLineItemsRequest {
  
  @scala.inline
  def apply(): OrdersShipLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersShipLineItemsRequest]
  }
  
  @scala.inline
  implicit class OrdersShipLineItemsRequestOps[Self <: OrdersShipLineItemsRequest] (val x: Self) extends AnyVal {
    
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
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: OrderShipmentLineItemShipment*): Self = this.set("lineItems", js.Array(value :_*))
    
    @scala.inline
    def setLineItems(value: js.Array[OrderShipmentLineItemShipment]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setShipmentGroupId(value: String): Self = this.set("shipmentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentGroupId: Self = this.set("shipmentGroupId", js.undefined)
    
    @scala.inline
    def setShipmentId(value: String): Self = this.set("shipmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentId: Self = this.set("shipmentId", js.undefined)
    
    @scala.inline
    def setShipmentInfosVarargs(value: OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo*): Self = this.set("shipmentInfos", js.Array(value :_*))
    
    @scala.inline
    def setShipmentInfos(value: js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]): Self = this.set("shipmentInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentInfos: Self = this.set("shipmentInfos", js.undefined)
    
    @scala.inline
    def setTrackingId(value: String): Self = this.set("trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingId: Self = this.set("trackingId", js.undefined)
  }
}
