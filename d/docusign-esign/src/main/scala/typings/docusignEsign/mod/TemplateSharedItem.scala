package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateSharedItem extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * Information about the user who owns the template.
    */
  var owner: js.UndefOr[UserInfo] = js.undefined
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * How the template is shared. One of:
    *
    * - `not_shared`
    * - `shared_to`
    *
    */
  var shared: js.UndefOr[String] = js.undefined
  
  /**
    * List of groups that share the template.
    */
  var sharedGroups: js.UndefOr[
    js.Array[/* Information about items shared among groups. */ MemberGroupSharedItem]
  ] = js.undefined
  
  /**
    * List of users that share the template.
    */
  var sharedUsers: js.UndefOr[js.Array[/* Information about a shared item. */ UserSharedItem]] = js.undefined
  
  /**
    * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
    */
  var templateId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the shared template.
    */
  var templateName: js.UndefOr[String] = js.undefined
}
object TemplateSharedItem {
  
  inline def apply(): TemplateSharedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSharedItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateSharedItem] (val x: Self) extends AnyVal {
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setOwner(value: UserInfo): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setShared(value: String): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedGroups(value: js.Array[/* Information about items shared among groups. */ MemberGroupSharedItem]): Self = StObject.set(x, "sharedGroups", value.asInstanceOf[js.Any])
    
    inline def setSharedGroupsUndefined: Self = StObject.set(x, "sharedGroups", js.undefined)
    
    inline def setSharedGroupsVarargs(value: (/* Information about items shared among groups. */ MemberGroupSharedItem)*): Self = StObject.set(x, "sharedGroups", js.Array(value*))
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setSharedUsers(value: js.Array[/* Information about a shared item. */ UserSharedItem]): Self = StObject.set(x, "sharedUsers", value.asInstanceOf[js.Any])
    
    inline def setSharedUsersUndefined: Self = StObject.set(x, "sharedUsers", js.undefined)
    
    inline def setSharedUsersVarargs(value: (/* Information about a shared item. */ UserSharedItem)*): Self = StObject.set(x, "sharedUsers", js.Array(value*))
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    inline def setTemplateName(value: String): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
  }
}
