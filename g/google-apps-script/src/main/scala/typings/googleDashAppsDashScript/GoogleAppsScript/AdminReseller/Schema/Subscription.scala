package typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var billingMethod: js.UndefOr[String] = js.undefined
  var creationTime: js.UndefOr[String] = js.undefined
  var customerDomain: js.UndefOr[String] = js.undefined
  var customerId: js.UndefOr[String] = js.undefined
  var dealCode: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var plan: js.UndefOr[SubscriptionPlan] = js.undefined
  var purchaseOrderId: js.UndefOr[String] = js.undefined
  var renewalSettings: js.UndefOr[RenewalSettings] = js.undefined
  var resourceUiUrl: js.UndefOr[String] = js.undefined
  var seats: js.UndefOr[Seats] = js.undefined
  var skuId: js.UndefOr[String] = js.undefined
  var skuName: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var subscriptionId: js.UndefOr[String] = js.undefined
  var suspensionReasons: js.UndefOr[js.Array[String]] = js.undefined
  var transferInfo: js.UndefOr[SubscriptionTransferInfo] = js.undefined
  var trialSettings: js.UndefOr[SubscriptionTrialSettings] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(
    billingMethod: String = null,
    creationTime: String = null,
    customerDomain: String = null,
    customerId: String = null,
    dealCode: String = null,
    kind: String = null,
    plan: SubscriptionPlan = null,
    purchaseOrderId: String = null,
    renewalSettings: RenewalSettings = null,
    resourceUiUrl: String = null,
    seats: Seats = null,
    skuId: String = null,
    skuName: String = null,
    status: String = null,
    subscriptionId: String = null,
    suspensionReasons: js.Array[String] = null,
    transferInfo: SubscriptionTransferInfo = null,
    trialSettings: SubscriptionTrialSettings = null
  ): Subscription = {
    val __obj = js.Dynamic.literal()
    if (billingMethod != null) __obj.updateDynamic("billingMethod")(billingMethod)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (customerDomain != null) __obj.updateDynamic("customerDomain")(customerDomain)
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (dealCode != null) __obj.updateDynamic("dealCode")(dealCode)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (purchaseOrderId != null) __obj.updateDynamic("purchaseOrderId")(purchaseOrderId)
    if (renewalSettings != null) __obj.updateDynamic("renewalSettings")(renewalSettings)
    if (resourceUiUrl != null) __obj.updateDynamic("resourceUiUrl")(resourceUiUrl)
    if (seats != null) __obj.updateDynamic("seats")(seats)
    if (skuId != null) __obj.updateDynamic("skuId")(skuId)
    if (skuName != null) __obj.updateDynamic("skuName")(skuName)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subscriptionId != null) __obj.updateDynamic("subscriptionId")(subscriptionId)
    if (suspensionReasons != null) __obj.updateDynamic("suspensionReasons")(suspensionReasons)
    if (transferInfo != null) __obj.updateDynamic("transferInfo")(transferInfo)
    if (trialSettings != null) __obj.updateDynamic("trialSettings")(trialSettings)
    __obj.asInstanceOf[Subscription]
  }
}

