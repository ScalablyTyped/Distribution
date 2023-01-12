package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BccEmailArchiveHistory extends StObject {
  
  /**
    * The id of the account that owns the BCC email archive configuration.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The action taken on the BCC email archive configuration.
    *
    * Examples:
    *
    * - `CREATED`: The BCC email archive configuration has been created.
    * - `UPDATED`: The BCC email address has been activated by clicking on the activation link in the activation email message.
    * - `CLOSED`: The BCC email address has been marked as closed is no longer used for archiving.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * The BCC email address used to archive the emails that DocuSign generates.
    *
    * Example: customer_bcc@example.com
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime when the BCC email address was last modified.
    */
  var modified: js.UndefOr[String] = js.undefined
  
  /**
    * Details about the user who last modified the BCC email archive configuration.
    */
  var modifiedBy: js.UndefOr[UserInfo] = js.undefined
  
  /**
    * The status of the BCC email address. Possible values are:
    *
    * - `activation_sent`: An activation link has been sent to the BCC email address.
    * - `active`: The BCC email address is actively used for archiving.
    * - `closed`: The BCC email address is no longer used for archiving.
    */
  var status: js.UndefOr[String] = js.undefined
}
object BccEmailArchiveHistory {
  
  inline def apply(): BccEmailArchiveHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BccEmailArchiveHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BccEmailArchiveHistory] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedBy(value: UserInfo): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    inline def setModifiedByUndefined: Self = StObject.set(x, "modifiedBy", js.undefined)
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
