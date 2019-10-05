package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrder extends js.Object {
  var customer: js.UndefOr[TestOrderCustomer] = js.undefined
  var enableOrderinvoices: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lineItems: js.UndefOr[js.Array[TestOrderLineItem]] = js.undefined
  var notificationMode: js.UndefOr[String] = js.undefined
  var paymentMethod: js.UndefOr[TestOrderPaymentMethod] = js.undefined
  var predefinedDeliveryAddress: js.UndefOr[String] = js.undefined
  var promotions: js.UndefOr[js.Array[OrderLegacyPromotion]] = js.undefined
  var shippingCost: js.UndefOr[Price] = js.undefined
  var shippingCostTax: js.UndefOr[Price] = js.undefined
  var shippingOption: js.UndefOr[String] = js.undefined
}

object TestOrder {
  @scala.inline
  def apply(
    customer: TestOrderCustomer = null,
    enableOrderinvoices: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    lineItems: js.Array[TestOrderLineItem] = null,
    notificationMode: String = null,
    paymentMethod: TestOrderPaymentMethod = null,
    predefinedDeliveryAddress: String = null,
    promotions: js.Array[OrderLegacyPromotion] = null,
    shippingCost: Price = null,
    shippingCostTax: Price = null,
    shippingOption: String = null
  ): TestOrder = {
    val __obj = js.Dynamic.literal()
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (!js.isUndefined(enableOrderinvoices)) __obj.updateDynamic("enableOrderinvoices")(enableOrderinvoices)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems)
    if (notificationMode != null) __obj.updateDynamic("notificationMode")(notificationMode)
    if (paymentMethod != null) __obj.updateDynamic("paymentMethod")(paymentMethod)
    if (predefinedDeliveryAddress != null) __obj.updateDynamic("predefinedDeliveryAddress")(predefinedDeliveryAddress)
    if (promotions != null) __obj.updateDynamic("promotions")(promotions)
    if (shippingCost != null) __obj.updateDynamic("shippingCost")(shippingCost)
    if (shippingCostTax != null) __obj.updateDynamic("shippingCostTax")(shippingCostTax)
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption)
    __obj.asInstanceOf[TestOrder]
  }
}

