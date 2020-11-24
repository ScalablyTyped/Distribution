package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BccEmailArchive extends js.Object {
  
  /**
    * The id of the account that owns the BCC email archive configuration.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The id of the BCC email archive configuration.
    */
  var bccEmailArchiveId: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the BCC email archive configuration was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * Details about the user who created the BCC email archive configuration.
    */
  var createdBy: js.UndefOr[UserInfo] = js.native
  
  /**
    * The BCC email address to use for archiving DocuSign messages.
    *
    * Example: customer_bcc@example.com
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The GUID of the activation email message sent to the BCC email address.
    */
  var emailNotificationId: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the BCC email archive configuration was last modified.
    */
  var modified: js.UndefOr[String] = js.native
  
  /**
    * Details about the user who last modified the BCC email archive configuration.
    */
  var modifiedBy: js.UndefOr[UserInfo] = js.native
  
  /**
    * The status of the BCC email address. Possible values are:
    *
    * - `activation_sent`: An activation link has been sent to the BCC email address.
    * - `active`: The BCC email address is actively used for archiving.
    * - `closed`: The BCC email address is no longer used for archiving.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The helper URI for retrieving the BCC email archive.
    */
  var uri: js.UndefOr[String] = js.native
}
object BccEmailArchive {
  
  @scala.inline
  def apply(): BccEmailArchive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BccEmailArchive]
  }
  
  @scala.inline
  implicit class BccEmailArchiveOps[Self <: BccEmailArchive] (val x: Self) extends AnyVal {
    
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
    def setBccEmailArchiveId(value: String): Self = this.set("bccEmailArchiveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBccEmailArchiveId: Self = this.set("bccEmailArchiveId", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: UserInfo): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEmailNotificationId(value: String): Self = this.set("emailNotificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailNotificationId: Self = this.set("emailNotificationId", js.undefined)
    
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    
    @scala.inline
    def setModifiedBy(value: UserInfo): Self = this.set("modifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedBy: Self = this.set("modifiedBy", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
