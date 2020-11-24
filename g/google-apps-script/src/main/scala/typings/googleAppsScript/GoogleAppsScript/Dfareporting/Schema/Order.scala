package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var advertiserId: js.UndefOr[String] = js.native
  
  var approverUserProfileIds: js.UndefOr[js.Array[String]] = js.native
  
  var buyerInvoiceId: js.UndefOr[String] = js.native
  
  var buyerOrganizationName: js.UndefOr[String] = js.native
  
  var comments: js.UndefOr[String] = js.native
  
  var contacts: js.UndefOr[js.Array[OrderContact]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var notes: js.UndefOr[String] = js.native
  
  var planningTermId: js.UndefOr[String] = js.native
  
  var projectId: js.UndefOr[String] = js.native
  
  var sellerOrderId: js.UndefOr[String] = js.native
  
  var sellerOrganizationName: js.UndefOr[String] = js.native
  
  var siteId: js.UndefOr[js.Array[String]] = js.native
  
  var siteNames: js.UndefOr[js.Array[String]] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
  
  var termsAndConditions: js.UndefOr[String] = js.native
}
object Order {
  
  @scala.inline
  def apply(): Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit class OrderOps[Self <: Order] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setApproverUserProfileIdsVarargs(value: String*): Self = this.set("approverUserProfileIds", js.Array(value :_*))
    
    @scala.inline
    def setApproverUserProfileIds(value: js.Array[String]): Self = this.set("approverUserProfileIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproverUserProfileIds: Self = this.set("approverUserProfileIds", js.undefined)
    
    @scala.inline
    def setBuyerInvoiceId(value: String): Self = this.set("buyerInvoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyerInvoiceId: Self = this.set("buyerInvoiceId", js.undefined)
    
    @scala.inline
    def setBuyerOrganizationName(value: String): Self = this.set("buyerOrganizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyerOrganizationName: Self = this.set("buyerOrganizationName", js.undefined)
    
    @scala.inline
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setContactsVarargs(value: OrderContact*): Self = this.set("contacts", js.Array(value :_*))
    
    @scala.inline
    def setContacts(value: js.Array[OrderContact]): Self = this.set("contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContacts: Self = this.set("contacts", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: LastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setPlanningTermId(value: String): Self = this.set("planningTermId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanningTermId: Self = this.set("planningTermId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setSellerOrderId(value: String): Self = this.set("sellerOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellerOrderId: Self = this.set("sellerOrderId", js.undefined)
    
    @scala.inline
    def setSellerOrganizationName(value: String): Self = this.set("sellerOrganizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellerOrganizationName: Self = this.set("sellerOrganizationName", js.undefined)
    
    @scala.inline
    def setSiteIdVarargs(value: String*): Self = this.set("siteId", js.Array(value :_*))
    
    @scala.inline
    def setSiteId(value: js.Array[String]): Self = this.set("siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
    
    @scala.inline
    def setSiteNamesVarargs(value: String*): Self = this.set("siteNames", js.Array(value :_*))
    
    @scala.inline
    def setSiteNames(value: js.Array[String]): Self = this.set("siteNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteNames: Self = this.set("siteNames", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setTermsAndConditions(value: String): Self = this.set("termsAndConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermsAndConditions: Self = this.set("termsAndConditions", js.undefined)
  }
}
