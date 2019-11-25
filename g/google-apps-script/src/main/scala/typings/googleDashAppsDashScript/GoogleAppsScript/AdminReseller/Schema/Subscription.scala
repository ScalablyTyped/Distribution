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
    if (billingMethod != null) __obj.updateDynamic("billingMethod")(billingMethod.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (customerDomain != null) __obj.updateDynamic("customerDomain")(customerDomain.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (dealCode != null) __obj.updateDynamic("dealCode")(dealCode.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (purchaseOrderId != null) __obj.updateDynamic("purchaseOrderId")(purchaseOrderId.asInstanceOf[js.Any])
    if (renewalSettings != null) __obj.updateDynamic("renewalSettings")(renewalSettings.asInstanceOf[js.Any])
    if (resourceUiUrl != null) __obj.updateDynamic("resourceUiUrl")(resourceUiUrl.asInstanceOf[js.Any])
    if (seats != null) __obj.updateDynamic("seats")(seats.asInstanceOf[js.Any])
    if (skuId != null) __obj.updateDynamic("skuId")(skuId.asInstanceOf[js.Any])
    if (skuName != null) __obj.updateDynamic("skuName")(skuName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subscriptionId != null) __obj.updateDynamic("subscriptionId")(subscriptionId.asInstanceOf[js.Any])
    if (suspensionReasons != null) __obj.updateDynamic("suspensionReasons")(suspensionReasons.asInstanceOf[js.Any])
    if (transferInfo != null) __obj.updateDynamic("transferInfo")(transferInfo.asInstanceOf[js.Any])
    if (trialSettings != null) __obj.updateDynamic("trialSettings")(trialSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
}

