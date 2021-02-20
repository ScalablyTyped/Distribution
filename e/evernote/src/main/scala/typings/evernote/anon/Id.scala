package typings.evernote.anon

import typings.evernote.mod.Types.ContactType
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var messagingPermit: js.UndefOr[String] = js.native
  
  var messagingPermitExpires: js.UndefOr[Timestamp] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var photoLastUpdated: js.UndefOr[Timestamp] = js.native
  
  var photoUrl: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[ContactType] = js.native
}
object Id {
  
  @scala.inline
  def apply(): Id = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMessagingPermit(value: String): Self = StObject.set(x, "messagingPermit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagingPermitExpires(value: Timestamp): Self = StObject.set(x, "messagingPermitExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagingPermitExpiresUndefined: Self = StObject.set(x, "messagingPermitExpires", js.undefined)
    
    @scala.inline
    def setMessagingPermitUndefined: Self = StObject.set(x, "messagingPermit", js.undefined)
    
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
    def setType(value: ContactType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
