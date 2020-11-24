package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderDocument extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var advertiserId: js.UndefOr[String] = js.native
  
  var amendedOrderDocumentId: js.UndefOr[String] = js.native
  
  var approvedByUserProfileIds: js.UndefOr[js.Array[String]] = js.native
  
  var cancelled: js.UndefOr[Boolean] = js.native
  
  var createdInfo: js.UndefOr[LastModifiedInfo] = js.native
  
  var effectiveDate: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var lastSentRecipients: js.UndefOr[js.Array[String]] = js.native
  
  var lastSentTime: js.UndefOr[String] = js.native
  
  var orderId: js.UndefOr[String] = js.native
  
  var projectId: js.UndefOr[String] = js.native
  
  var signed: js.UndefOr[Boolean] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object OrderDocument {
  
  @scala.inline
  def apply(): OrderDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderDocument]
  }
  
  @scala.inline
  implicit class OrderDocumentOps[Self <: OrderDocument] (val x: Self) extends AnyVal {
    
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
    def setAmendedOrderDocumentId(value: String): Self = this.set("amendedOrderDocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmendedOrderDocumentId: Self = this.set("amendedOrderDocumentId", js.undefined)
    
    @scala.inline
    def setApprovedByUserProfileIdsVarargs(value: String*): Self = this.set("approvedByUserProfileIds", js.Array(value :_*))
    
    @scala.inline
    def setApprovedByUserProfileIds(value: js.Array[String]): Self = this.set("approvedByUserProfileIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovedByUserProfileIds: Self = this.set("approvedByUserProfileIds", js.undefined)
    
    @scala.inline
    def setCancelled(value: Boolean): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelled: Self = this.set("cancelled", js.undefined)
    
    @scala.inline
    def setCreatedInfo(value: LastModifiedInfo): Self = this.set("createdInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedInfo: Self = this.set("createdInfo", js.undefined)
    
    @scala.inline
    def setEffectiveDate(value: String): Self = this.set("effectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDate: Self = this.set("effectiveDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastSentRecipientsVarargs(value: String*): Self = this.set("lastSentRecipients", js.Array(value :_*))
    
    @scala.inline
    def setLastSentRecipients(value: js.Array[String]): Self = this.set("lastSentRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSentRecipients: Self = this.set("lastSentRecipients", js.undefined)
    
    @scala.inline
    def setLastSentTime(value: String): Self = this.set("lastSentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSentTime: Self = this.set("lastSentTime", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
