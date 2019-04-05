package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var billingMethod: js.UndefOr[java.lang.String] = js.undefined
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var customerDomain: js.UndefOr[java.lang.String] = js.undefined
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  var dealCode: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var plan: js.UndefOr[SubscriptionPlan] = js.undefined
  var purchaseOrderId: js.UndefOr[java.lang.String] = js.undefined
  var renewalSettings: js.UndefOr[RenewalSettings] = js.undefined
  var resourceUiUrl: js.UndefOr[java.lang.String] = js.undefined
  var seats: js.UndefOr[Seats] = js.undefined
  var skuId: js.UndefOr[java.lang.String] = js.undefined
  var skuName: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var subscriptionId: js.UndefOr[java.lang.String] = js.undefined
  var suspensionReasons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var transferInfo: js.UndefOr[SubscriptionTransferInfo] = js.undefined
  var trialSettings: js.UndefOr[SubscriptionTrialSettings] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(
    billingMethod: java.lang.String = null,
    creationTime: java.lang.String = null,
    customerDomain: java.lang.String = null,
    customerId: java.lang.String = null,
    dealCode: java.lang.String = null,
    kind: java.lang.String = null,
    plan: SubscriptionPlan = null,
    purchaseOrderId: java.lang.String = null,
    renewalSettings: RenewalSettings = null,
    resourceUiUrl: java.lang.String = null,
    seats: Seats = null,
    skuId: java.lang.String = null,
    skuName: java.lang.String = null,
    status: java.lang.String = null,
    subscriptionId: java.lang.String = null,
    suspensionReasons: js.Array[java.lang.String] = null,
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

