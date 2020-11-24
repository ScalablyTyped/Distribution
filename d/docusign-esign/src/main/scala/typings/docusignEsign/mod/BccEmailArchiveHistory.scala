package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BccEmailArchiveHistory extends js.Object {
  
  /**
    * The id of the account that owns the BCC email archive configuration.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The action taken on the BCC email archive configuration.
    *
    * Examples:
    *
    * - `CREATED`: The BCC email archive configuration has been created.
    * - `UPDATED`: The BCC email address has been activated by clicking on the activation link in the activation email message.
    * - `CLOSED`: The BCC email address has been marked as closed is no longer used for archiving.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * The BCC email address used to archive the emails that DocuSign generates.
    *
    * Example: customer_bcc@example.com
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the BCC email address was last modified.
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
}
object BccEmailArchiveHistory {
  
  @scala.inline
  def apply(): BccEmailArchiveHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BccEmailArchiveHistory]
  }
  
  @scala.inline
  implicit class BccEmailArchiveHistoryOps[Self <: BccEmailArchiveHistory] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
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
  }
}
