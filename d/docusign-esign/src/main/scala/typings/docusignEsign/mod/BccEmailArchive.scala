package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BccEmailArchive extends StObject {
  
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
  implicit class BccEmailArchiveMutableBuilder[Self <: BccEmailArchive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBccEmailArchiveId(value: String): Self = StObject.set(x, "bccEmailArchiveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccEmailArchiveIdUndefined: Self = StObject.set(x, "bccEmailArchiveId", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: UserInfo): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNotificationId(value: String): Self = StObject.set(x, "emailNotificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNotificationIdUndefined: Self = StObject.set(x, "emailNotificationId", js.undefined)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedBy(value: UserInfo): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedByUndefined: Self = StObject.set(x, "modifiedBy", js.undefined)
    
    @scala.inline
    def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
