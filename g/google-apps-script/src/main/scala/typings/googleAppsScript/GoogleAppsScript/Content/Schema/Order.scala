package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Order extends js.Object {
  var acknowledged: js.UndefOr[Boolean] = js.native
  var channelType: js.UndefOr[String] = js.native
  var customer: js.UndefOr[OrderCustomer] = js.native
  var deliveryDetails: js.UndefOr[OrderDeliveryDetails] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var lineItems: js.UndefOr[js.Array[OrderLineItem]] = js.native
  var merchantId: js.UndefOr[String] = js.native
  var merchantOrderId: js.UndefOr[String] = js.native
  var netAmount: js.UndefOr[Price] = js.native
  var paymentMethod: js.UndefOr[OrderPaymentMethod] = js.native
  var paymentStatus: js.UndefOr[String] = js.native
  var placedDate: js.UndefOr[String] = js.native
  var promotions: js.UndefOr[js.Array[OrderLegacyPromotion]] = js.native
  var refunds: js.UndefOr[js.Array[OrderRefund]] = js.native
  var shipments: js.UndefOr[js.Array[OrderShipment]] = js.native
  var shippingCost: js.UndefOr[Price] = js.native
  var shippingCostTax: js.UndefOr[Price] = js.native
  var shippingOption: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var taxCollector: js.UndefOr[String] = js.native
}

object Order {
  @scala.inline
  def apply(): Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Order]
  }
  @scala.inline
  implicit class OrderOps[Self <: Order] (val x: Self) extends AnyVal {
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
    def setAcknowledged(value: Boolean): Self = this.set("acknowledged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcknowledged: Self = this.set("acknowledged", js.undefined)
    @scala.inline
    def setChannelType(value: String): Self = this.set("channelType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelType: Self = this.set("channelType", js.undefined)
    @scala.inline
    def setCustomer(value: OrderCustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    @scala.inline
    def setDeliveryDetails(value: OrderDeliveryDetails): Self = this.set("deliveryDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryDetails: Self = this.set("deliveryDetails", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLineItemsVarargs(value: OrderLineItem*): Self = this.set("lineItems", js.Array(value :_*))
    @scala.inline
    def setLineItems(value: js.Array[OrderLineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    @scala.inline
    def setMerchantOrderId(value: String): Self = this.set("merchantOrderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantOrderId: Self = this.set("merchantOrderId", js.undefined)
    @scala.inline
    def setNetAmount(value: Price): Self = this.set("netAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetAmount: Self = this.set("netAmount", js.undefined)
    @scala.inline
    def setPaymentMethod(value: OrderPaymentMethod): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
    @scala.inline
    def setPaymentStatus(value: String): Self = this.set("paymentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentStatus: Self = this.set("paymentStatus", js.undefined)
    @scala.inline
    def setPlacedDate(value: String): Self = this.set("placedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacedDate: Self = this.set("placedDate", js.undefined)
    @scala.inline
    def setPromotionsVarargs(value: OrderLegacyPromotion*): Self = this.set("promotions", js.Array(value :_*))
    @scala.inline
    def setPromotions(value: js.Array[OrderLegacyPromotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
    @scala.inline
    def setRefundsVarargs(value: OrderRefund*): Self = this.set("refunds", js.Array(value :_*))
    @scala.inline
    def setRefunds(value: js.Array[OrderRefund]): Self = this.set("refunds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefunds: Self = this.set("refunds", js.undefined)
    @scala.inline
    def setShipmentsVarargs(value: OrderShipment*): Self = this.set("shipments", js.Array(value :_*))
    @scala.inline
    def setShipments(value: js.Array[OrderShipment]): Self = this.set("shipments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipments: Self = this.set("shipments", js.undefined)
    @scala.inline
    def setShippingCost(value: Price): Self = this.set("shippingCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingCost: Self = this.set("shippingCost", js.undefined)
    @scala.inline
    def setShippingCostTax(value: Price): Self = this.set("shippingCostTax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingCostTax: Self = this.set("shippingCostTax", js.undefined)
    @scala.inline
    def setShippingOption(value: String): Self = this.set("shippingOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingOption: Self = this.set("shippingOption", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTaxCollector(value: String): Self = this.set("taxCollector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxCollector: Self = this.set("taxCollector", js.undefined)
  }
  
}

