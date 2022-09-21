package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUser extends StObject {
  
  /**
    * Output only. The user's display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier of the user's Google Workspace domain.
    */
  var domainId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. When `true`, the user is deleted or their profile is not visible.
    */
  var isAnonymous: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Resource name for a Google Chat user. Represents a [person](https://developers.google.com/people/api/rest/v1/people#Person) in the People API or a [user](https://developers.google.com/admin-sdk/directory/reference/rest/v1/users) in the Admin SDK Directory API. Formatted as: `users/{user\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaUser {
  
  inline def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  extension [Self <: SchemaUser](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDomainId(value: String): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdNull: Self = StObject.set(x, "domainId", null)
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
    
    inline def setIsAnonymous(value: Boolean): Self = StObject.set(x, "isAnonymous", value.asInstanceOf[js.Any])
    
    inline def setIsAnonymousNull: Self = StObject.set(x, "isAnonymous", null)
    
    inline def setIsAnonymousUndefined: Self = StObject.set(x, "isAnonymous", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
