package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentOwner extends js.Object {
  
  var conflictNotificationEmail: js.UndefOr[String] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var disputeNotificationEmails: js.UndefOr[js.Array[String]] = js.native
  
  var fingerprintReportNotificationEmails: js.UndefOr[js.Array[String]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var primaryNotificationEmails: js.UndefOr[js.Array[String]] = js.native
}
object ContentOwner {
  
  @scala.inline
  def apply(): ContentOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentOwner]
  }
  
  @scala.inline
  implicit class ContentOwnerOps[Self <: ContentOwner] (val x: Self) extends AnyVal {
    
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
    def setConflictNotificationEmail(value: String): Self = this.set("conflictNotificationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictNotificationEmail: Self = this.set("conflictNotificationEmail", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisputeNotificationEmailsVarargs(value: String*): Self = this.set("disputeNotificationEmails", js.Array(value :_*))
    
    @scala.inline
    def setDisputeNotificationEmails(value: js.Array[String]): Self = this.set("disputeNotificationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisputeNotificationEmails: Self = this.set("disputeNotificationEmails", js.undefined)
    
    @scala.inline
    def setFingerprintReportNotificationEmailsVarargs(value: String*): Self = this.set("fingerprintReportNotificationEmails", js.Array(value :_*))
    
    @scala.inline
    def setFingerprintReportNotificationEmails(value: js.Array[String]): Self = this.set("fingerprintReportNotificationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprintReportNotificationEmails: Self = this.set("fingerprintReportNotificationEmails", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPrimaryNotificationEmailsVarargs(value: String*): Self = this.set("primaryNotificationEmails", js.Array(value :_*))
    
    @scala.inline
    def setPrimaryNotificationEmails(value: js.Array[String]): Self = this.set("primaryNotificationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryNotificationEmails: Self = this.set("primaryNotificationEmails", js.undefined)
  }
}
