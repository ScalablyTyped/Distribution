package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var advertiserId: js.UndefOr[String] = js.undefined
  var approverUserProfileIds: js.UndefOr[js.Array[String]] = js.undefined
  var buyerInvoiceId: js.UndefOr[String] = js.undefined
  var buyerOrganizationName: js.UndefOr[String] = js.undefined
  var comments: js.UndefOr[String] = js.undefined
  var contacts: js.UndefOr[js.Array[OrderContact]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var planningTermId: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var sellerOrderId: js.UndefOr[String] = js.undefined
  var sellerOrganizationName: js.UndefOr[String] = js.undefined
  var siteId: js.UndefOr[js.Array[String]] = js.undefined
  var siteNames: js.UndefOr[js.Array[String]] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
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

