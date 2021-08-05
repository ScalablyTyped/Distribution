package typings.evernote.anon

import typings.evernote.mod.Types.ContactType
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var messagingPermit: js.UndefOr[String] = js.undefined
  
  var messagingPermitExpires: js.UndefOr[Timestamp] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var photoLastUpdated: js.UndefOr[Timestamp] = js.undefined
  
  var photoUrl: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[ContactType] = js.undefined
}
object Id {
  
  inline def apply(): Id = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessagingPermit(value: String): Self = StObject.set(x, "messagingPermit", value.asInstanceOf[js.Any])
    
    inline def setMessagingPermitExpires(value: Timestamp): Self = StObject.set(x, "messagingPermitExpires", value.asInstanceOf[js.Any])
    
    inline def setMessagingPermitExpiresUndefined: Self = StObject.set(x, "messagingPermitExpires", js.undefined)
    
    inline def setMessagingPermitUndefined: Self = StObject.set(x, "messagingPermit", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhotoLastUpdated(value: Timestamp): Self = StObject.set(x, "photoLastUpdated", value.asInstanceOf[js.Any])
    
    inline def setPhotoLastUpdatedUndefined: Self = StObject.set(x, "photoLastUpdated", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setType(value: ContactType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
