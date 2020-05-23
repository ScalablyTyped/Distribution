package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDocument extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var advertiserId: js.UndefOr[String] = js.undefined
  var amendedOrderDocumentId: js.UndefOr[String] = js.undefined
  var approvedByUserProfileIds: js.UndefOr[js.Array[String]] = js.undefined
  var cancelled: js.UndefOr[Boolean] = js.undefined
  var createdInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var effectiveDate: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastSentRecipients: js.UndefOr[js.Array[String]] = js.undefined
  var lastSentTime: js.UndefOr[String] = js.undefined
  var orderId: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var signed: js.UndefOr[Boolean] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
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
    if (!js.isUndefined(cancelled)) __obj.updateDynamic("cancelled")(cancelled.get.asInstanceOf[js.Any])
    if (createdInfo != null) __obj.updateDynamic("createdInfo")(createdInfo.asInstanceOf[js.Any])
    if (effectiveDate != null) __obj.updateDynamic("effectiveDate")(effectiveDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastSentRecipients != null) __obj.updateDynamic("lastSentRecipients")(lastSentRecipients.asInstanceOf[js.Any])
    if (lastSentTime != null) __obj.updateDynamic("lastSentTime")(lastSentTime.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed.get.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderDocument]
  }
}

