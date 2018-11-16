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

