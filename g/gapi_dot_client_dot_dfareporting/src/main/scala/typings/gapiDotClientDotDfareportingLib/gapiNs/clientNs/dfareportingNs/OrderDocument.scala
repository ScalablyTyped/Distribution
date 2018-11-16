package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OrderDocument extends js.Object {
  /** Account ID of this order document. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Advertiser ID of this order document. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The amended order document ID of this order document. An order document can be created by optionally amending another order document so that the change
               * history can be preserved.
               */
  var amendedOrderDocumentId: js.UndefOr[java.lang.String] = js.undefined
  /** IDs of users who have approved this order document. */
  var approvedByUserProfileIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether this order document is cancelled. */
  var cancelled: js.UndefOr[scala.Boolean] = js.undefined
  /** Information about the creation of this order document. */
  var createdInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /** Effective date of this order document. */
  var effectiveDate: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this order document. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#orderDocument". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** List of email addresses that received the last sent document. */
  var lastSentRecipients: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Timestamp of the last email sent with this order document. */
  var lastSentTime: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the order from which this order document is created. */
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  /** Project ID of this order document. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this order document has been signed. */
  var signed: js.UndefOr[scala.Boolean] = js.undefined
  /** Subaccount ID of this order document. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** Title of this order document. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Type of this order document */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

