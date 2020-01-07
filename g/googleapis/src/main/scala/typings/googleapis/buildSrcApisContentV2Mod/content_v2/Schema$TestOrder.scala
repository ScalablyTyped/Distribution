package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TestOrder extends js.Object {
  /**
    * The details of the customer who placed the order.
    */
  var customer: js.UndefOr[Schema$TestOrderCustomer] = js.native
  /**
    * Whether the orderinvoices service should support this order.
    */
  var enableOrderinvoices: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#testOrder&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Line items that are ordered. At least one line item must be provided.
    */
  var lineItems: js.UndefOr[js.Array[Schema$TestOrderLineItem]] = js.native
  /**
    * Determines if test order must be pulled by merchant or pushed to merchant
    * via push integration.
    */
  var notificationMode: js.UndefOr[String] = js.native
  /**
    * The details of the payment method.
    */
  var paymentMethod: js.UndefOr[Schema$TestOrderPaymentMethod] = js.native
  /**
    * Identifier of one of the predefined delivery addresses for the delivery.
    */
  var predefinedDeliveryAddress: js.UndefOr[String] = js.native
  /**
    * Deprecated. Ignored if provided.
    */
  var promotions: js.UndefOr[js.Array[Schema$OrderLegacyPromotion]] = js.native
  /**
    * The price of shipping for all items. Shipping tax is automatically
    * calculated for MFL orders. For non-MFL orders, tax settings from Merchant
    * Center are applied. Note that shipping is not taxed in certain states.
    */
  var shippingCost: js.UndefOr[Schema$Price] = js.native
  /**
    * Deprecated. Ignored if provided.
    */
  var shippingCostTax: js.UndefOr[Schema$Price] = js.native
  /**
    * The requested shipping option.
    */
  var shippingOption: js.UndefOr[String] = js.native
}

object Schema$TestOrder {
  @scala.inline
  def apply(
    customer: Schema$TestOrderCustomer = null,
    enableOrderinvoices: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    lineItems: js.Array[Schema$TestOrderLineItem] = null,
    notificationMode: String = null,
    paymentMethod: Schema$TestOrderPaymentMethod = null,
    predefinedDeliveryAddress: String = null,
    promotions: js.Array[Schema$OrderLegacyPromotion] = null,
    shippingCost: Schema$Price = null,
    shippingCostTax: Schema$Price = null,
    shippingOption: String = null
  ): Schema$TestOrder = {
    val __obj = js.Dynamic.literal()
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOrderinvoices)) __obj.updateDynamic("enableOrderinvoices")(enableOrderinvoices.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    if (notificationMode != null) __obj.updateDynamic("notificationMode")(notificationMode.asInstanceOf[js.Any])
    if (paymentMethod != null) __obj.updateDynamic("paymentMethod")(paymentMethod.asInstanceOf[js.Any])
    if (predefinedDeliveryAddress != null) __obj.updateDynamic("predefinedDeliveryAddress")(predefinedDeliveryAddress.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    if (shippingCost != null) __obj.updateDynamic("shippingCost")(shippingCost.asInstanceOf[js.Any])
    if (shippingCostTax != null) __obj.updateDynamic("shippingCostTax")(shippingCostTax.asInstanceOf[js.Any])
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestOrder]
  }
}

