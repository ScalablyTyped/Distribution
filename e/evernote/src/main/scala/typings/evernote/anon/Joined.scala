package typings.evernote.anon

import typings.evernote.mod.Types.BusinessUserAttributes
import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Joined extends StObject {
  
  var attributes: js.UndefOr[BusinessUserAttributes] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[UserID] = js.undefined
  
  var joined: js.UndefOr[Timestamp] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var photoLastUpdated: js.UndefOr[Timestamp] = js.undefined
  
  var photoUrl: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[BusinessUserRole] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object Joined {
  
  inline def apply(): Joined = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Joined]
  }
  
  extension [Self <: Joined](x: Self) {
    
    inline def setAttributes(value: BusinessUserAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setId(value: UserID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setJoined(value: Timestamp): Self = StObject.set(x, "joined", value.asInstanceOf[js.Any])
    
    inline def setJoinedUndefined: Self = StObject.set(x, "joined", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhotoLastUpdated(value: Timestamp): Self = StObject.set(x, "photoLastUpdated", value.asInstanceOf[js.Any])
    
    inline def setPhotoLastUpdatedUndefined: Self = StObject.set(x, "photoLastUpdated", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setRole(value: BusinessUserRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
