package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  /** Account ID of this order. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Advertiser ID of this order. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** IDs for users that have to approve documents created for this order. */
  var approverUserProfileIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Buyer invoice ID associated with this order. */
  var buyerInvoiceId: js.UndefOr[String] = js.undefined
  /** Name of the buyer organization. */
  var buyerOrganizationName: js.UndefOr[String] = js.undefined
  /** Comments in this order. */
  var comments: js.UndefOr[String] = js.undefined
  /** Contacts for this order. */
  var contacts: js.UndefOr[js.Array[OrderContact]] = js.undefined
  /** ID of this order. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#order". */
  var kind: js.UndefOr[String] = js.undefined
  /** Information about the most recent modification of this order. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /** Name of this order. */
  var name: js.UndefOr[String] = js.undefined
  /** Notes of this order. */
  var notes: js.UndefOr[String] = js.undefined
  /** ID of the terms and conditions template used in this order. */
  var planningTermId: js.UndefOr[String] = js.undefined
  /** Project ID of this order. */
  var projectId: js.UndefOr[String] = js.undefined
  /** Seller order ID associated with this order. */
  var sellerOrderId: js.UndefOr[String] = js.undefined
  /** Name of the seller organization. */
  var sellerOrganizationName: js.UndefOr[String] = js.undefined
  /** Site IDs this order is associated with. */
  var siteId: js.UndefOr[js.Array[String]] = js.undefined
  /** Free-form site names this order is associated with. */
  var siteNames: js.UndefOr[js.Array[String]] = js.undefined
  /** Subaccount ID of this order. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /** Terms and conditions of this order. */
  var termsAndConditions: js.UndefOr[String] = js.undefined
}

object Order {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    approverUserProfileIds: js.Array[String] = null,
    buyerInvoiceId: String = null,
    buyerOrganizationName: String = null,
    comments: String = null,
    contacts: js.Array[OrderContact] = null,
    id: String = null,
    kind: String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    name: String = null,
    notes: String = null,
    planningTermId: String = null,
    projectId: String = null,
    sellerOrderId: String = null,
    sellerOrganizationName: String = null,
    siteId: js.Array[String] = null,
    siteNames: js.Array[String] = null,
    subaccountId: String = null,
    termsAndConditions: String = null
  ): Order = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (approverUserProfileIds != null) __obj.updateDynamic("approverUserProfileIds")(approverUserProfileIds.asInstanceOf[js.Any])
    if (buyerInvoiceId != null) __obj.updateDynamic("buyerInvoiceId")(buyerInvoiceId.asInstanceOf[js.Any])
    if (buyerOrganizationName != null) __obj.updateDynamic("buyerOrganizationName")(buyerOrganizationName.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (contacts != null) __obj.updateDynamic("contacts")(contacts.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (planningTermId != null) __obj.updateDynamic("planningTermId")(planningTermId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (sellerOrderId != null) __obj.updateDynamic("sellerOrderId")(sellerOrderId.asInstanceOf[js.Any])
    if (sellerOrganizationName != null) __obj.updateDynamic("sellerOrganizationName")(sellerOrganizationName.asInstanceOf[js.Any])
    if (siteId != null) __obj.updateDynamic("siteId")(siteId.asInstanceOf[js.Any])
    if (siteNames != null) __obj.updateDynamic("siteNames")(siteNames.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (termsAndConditions != null) __obj.updateDynamic("termsAndConditions")(termsAndConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}

