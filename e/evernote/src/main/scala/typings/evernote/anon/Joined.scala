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
  
  @scala.inline
  def apply(): Joined = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Joined]
  }
  
  @scala.inline
  implicit class JoinedMutableBuilder[Self <: Joined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: BusinessUserAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setId(value: UserID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setJoined(value: Timestamp): Self = StObject.set(x, "joined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinedUndefined: Self = StObject.set(x, "joined", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhotoLastUpdated(value: Timestamp): Self = StObject.set(x, "photoLastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoLastUpdatedUndefined: Self = StObject.set(x, "photoLastUpdated", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setRole(value: BusinessUserRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
