package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  /** Account ID of this order. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Advertiser ID of this order. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** IDs for users that have to approve documents created for this order. */
  var approverUserProfileIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Buyer invoice ID associated with this order. */
  var buyerInvoiceId: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the buyer organization. */
  var buyerOrganizationName: js.UndefOr[java.lang.String] = js.undefined
  /** Comments in this order. */
  var comments: js.UndefOr[java.lang.String] = js.undefined
  /** Contacts for this order. */
  var contacts: js.UndefOr[js.Array[OrderContact]] = js.undefined
  /** ID of this order. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#order". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the most recent modification of this order. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /** Name of this order. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Notes of this order. */
  var notes: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the terms and conditions template used in this order. */
  var planningTermId: js.UndefOr[java.lang.String] = js.undefined
  /** Project ID of this order. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** Seller order ID associated with this order. */
  var sellerOrderId: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the seller organization. */
  var sellerOrganizationName: js.UndefOr[java.lang.String] = js.undefined
  /** Site IDs this order is associated with. */
  var siteId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Free-form site names this order is associated with. */
  var siteNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Subaccount ID of this order. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** Terms and conditions of this order. */
  var termsAndConditions: js.UndefOr[java.lang.String] = js.undefined
}

object Order {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    advertiserId: java.lang.String = null,
    approverUserProfileIds: js.Array[java.lang.String] = null,
    buyerInvoiceId: java.lang.String = null,
    buyerOrganizationName: java.lang.String = null,
    comments: java.lang.String = null,
    contacts: js.Array[OrderContact] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    name: java.lang.String = null,
    notes: java.lang.String = null,
    planningTermId: java.lang.String = null,
    projectId: java.lang.String = null,
    sellerOrderId: java.lang.String = null,
    sellerOrganizationName: java.lang.String = null,
    siteId: js.Array[java.lang.String] = null,
    siteNames: js.Array[java.lang.String] = null,
    subaccountId: java.lang.String = null,
    termsAndConditions: java.lang.String = null
  ): Order = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (approverUserProfileIds != null) __obj.updateDynamic("approverUserProfileIds")(approverUserProfileIds)
    if (buyerInvoiceId != null) __obj.updateDynamic("buyerInvoiceId")(buyerInvoiceId)
    if (buyerOrganizationName != null) __obj.updateDynamic("buyerOrganizationName")(buyerOrganizationName)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (contacts != null) __obj.updateDynamic("contacts")(contacts)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (planningTermId != null) __obj.updateDynamic("planningTermId")(planningTermId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (sellerOrderId != null) __obj.updateDynamic("sellerOrderId")(sellerOrderId)
    if (sellerOrganizationName != null) __obj.updateDynamic("sellerOrganizationName")(sellerOrganizationName)
    if (siteId != null) __obj.updateDynamic("siteId")(siteId)
    if (siteNames != null) __obj.updateDynamic("siteNames")(siteNames)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (termsAndConditions != null) __obj.updateDynamic("termsAndConditions")(termsAndConditions)
    __obj.asInstanceOf[Order]
  }
}

