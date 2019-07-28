package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (amendedOrderDocumentId != null) __obj.updateDynamic("amendedOrderDocumentId")(amendedOrderDocumentId)
    if (approvedByUserProfileIds != null) __obj.updateDynamic("approvedByUserProfileIds")(approvedByUserProfileIds)
    if (!js.isUndefined(cancelled)) __obj.updateDynamic("cancelled")(cancelled)
    if (createdInfo != null) __obj.updateDynamic("createdInfo")(createdInfo)
    if (effectiveDate != null) __obj.updateDynamic("effectiveDate")(effectiveDate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastSentRecipients != null) __obj.updateDynamic("lastSentRecipients")(lastSentRecipients)
    if (lastSentTime != null) __obj.updateDynamic("lastSentTime")(lastSentTime)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OrderDocument]
  }
}

