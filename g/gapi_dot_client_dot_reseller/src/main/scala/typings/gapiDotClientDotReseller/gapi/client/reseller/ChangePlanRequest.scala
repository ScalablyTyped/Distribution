package typings.gapiDotClientDotReseller.gapi.client.reseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePlanRequest extends js.Object {
  /**
    * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must be included in changePlan request in order to receive
    * discounted rate. This property is optional. If a deal code has already been added to a subscription, this property may be left empty and the existing
    * discounted rate will still apply (if not empty, only provide the deal code that is already present on the subscription). If a deal code has never been
    * added to a subscription and this property is left blank, regular pricing will apply.
    */
  var dealCode: js.UndefOr[String] = js.undefined
  /** Identifies the resource as a subscription change plan request. Value: subscriptions#changePlanRequest */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The planName property is required. This is the name of the subscription's payment plan. For more information about the Google payment plans, see API
    * concepts.
    *
    * Possible values are:
    * - ANNUAL_MONTHLY_PAY - The annual commitment plan with monthly payments
    * - ANNUAL_YEARLY_PAY - The annual commitment plan with yearly payments
    * - FLEXIBLE - The flexible plan
    * - TRIAL - The 30-day free trial plan
    */
  var planName: js.UndefOr[String] = js.undefined
  /**
    * This is an optional property. This purchase order (PO) information is for resellers to use for their company tracking usage. If a purchaseOrderId value
    * is given it appears in the API responses and shows up in the invoice. The property accepts up to 80 plain text characters.
    */
  var purchaseOrderId: js.UndefOr[String] = js.undefined
  /** This is a required property. The seats property is the number of user seat licenses. */
  var seats: js.UndefOr[Seats] = js.undefined
}

object ChangePlanRequest {
  @scala.inline
  def apply(
    dealCode: String = null,
    kind: String = null,
    planName: String = null,
    purchaseOrderId: String = null,
    seats: Seats = null
  ): ChangePlanRequest = {
    val __obj = js.Dynamic.literal()
    if (dealCode != null) __obj.updateDynamic("dealCode")(dealCode.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (planName != null) __obj.updateDynamic("planName")(planName.asInstanceOf[js.Any])
    if (purchaseOrderId != null) __obj.updateDynamic("purchaseOrderId")(purchaseOrderId.asInstanceOf[js.Any])
    if (seats != null) __obj.updateDynamic("seats")(seats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangePlanRequest]
  }
}

