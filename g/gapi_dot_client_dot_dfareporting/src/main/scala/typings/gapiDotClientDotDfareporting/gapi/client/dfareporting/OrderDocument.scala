package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDocument extends js.Object {
  /** Account ID of this order document. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Advertiser ID of this order document. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /**
    * The amended order document ID of this order document. An order document can be created by optionally amending another order document so that the change
    * history can be preserved.
    */
  var amendedOrderDocumentId: js.UndefOr[String] = js.undefined
  /** IDs of users who have approved this order document. */
  var approvedByUserProfileIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Whether this order document is cancelled. */
  var cancelled: js.UndefOr[Boolean] = js.undefined
  /** Information about the creation of this order document. */
  var createdInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /** Effective date of this order document. */
  var effectiveDate: js.UndefOr[String] = js.undefined
  /** ID of this order document. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#orderDocument". */
  var kind: js.UndefOr[String] = js.undefined
  /** List of email addresses that received the last sent document. */
  var lastSentRecipients: js.UndefOr[js.Array[String]] = js.undefined
  /** Timestamp of the last email sent with this order document. */
  var lastSentTime: js.UndefOr[String] = js.undefined
  /** ID of the order from which this order document is created. */
  var orderId: js.UndefOr[String] = js.undefined
  /** Project ID of this order document. */
  var projectId: js.UndefOr[String] = js.undefined
  /** Whether this order document has been signed. */
  var signed: js.UndefOr[Boolean] = js.undefined
  /** Subaccount ID of this order document. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /** Title of this order document. */
  var title: js.UndefOr[String] = js.undefined
  /** Type of this order document */
  var `type`: js.UndefOr[String] = js.undefined
}

object OrderDocument {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    amendedOrderDocumentId: String = null,
    approvedByUserProfileIds: js.Array[String] = null,
    cancelled: js.UndefOr[Boolean] = js.undefined,
    createdInfo: LastModifiedInfo = null,
    effectiveDate: String = null,
    id: String = null,
    kind: String = null,
    lastSentRecipients: js.Array[String] = null,
    lastSentTime: String = null,
    orderId: String = null,
    projectId: String = null,
    signed: js.UndefOr[Boolean] = js.undefined,
    subaccountId: String = null,
    title: String = null,
    `type`: String = null
  ): OrderDocument = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (amendedOrderDocumentId != null) __obj.updateDynamic("amendedOrderDocumentId")(amendedOrderDocumentId.asInstanceOf[js.Any])
    if (approvedByUserProfileIds != null) __obj.updateDynamic("approvedByUserProfileIds")(approvedByUserProfileIds.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelled)) __obj.updateDynamic("cancelled")(cancelled.asInstanceOf[js.Any])
    if (createdInfo != null) __obj.updateDynamic("createdInfo")(createdInfo.asInstanceOf[js.Any])
    if (effectiveDate != null) __obj.updateDynamic("effectiveDate")(effectiveDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastSentRecipients != null) __obj.updateDynamic("lastSentRecipients")(lastSentRecipients.asInstanceOf[js.Any])
    if (lastSentTime != null) __obj.updateDynamic("lastSentTime")(lastSentTime.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderDocument]
  }
}

