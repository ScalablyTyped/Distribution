package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDocument extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  var amendedOrderDocumentId: js.UndefOr[java.lang.String] = js.undefined
  var approvedByUserProfileIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var cancelled: js.UndefOr[scala.Boolean] = js.undefined
  var createdInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var effectiveDate: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastSentRecipients: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var lastSentTime: js.UndefOr[java.lang.String] = js.undefined
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  var signed: js.UndefOr[scala.Boolean] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object OrderDocument {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    advertiserId: java.lang.String = null,
    amendedOrderDocumentId: java.lang.String = null,
    approvedByUserProfileIds: js.Array[java.lang.String] = null,
    cancelled: js.UndefOr[scala.Boolean] = js.undefined,
    createdInfo: LastModifiedInfo = null,
    effectiveDate: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lastSentRecipients: js.Array[java.lang.String] = null,
    lastSentTime: java.lang.String = null,
    orderId: java.lang.String = null,
    projectId: java.lang.String = null,
    signed: js.UndefOr[scala.Boolean] = js.undefined,
    subaccountId: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
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

