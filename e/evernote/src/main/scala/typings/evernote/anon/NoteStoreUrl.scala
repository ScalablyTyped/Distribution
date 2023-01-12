package typings.evernote.anon

import typings.evernote.mod.Types.ServiceLevel
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoteStoreUrl extends StObject {
  
  var noteStoreUrl: js.UndefOr[String] = js.undefined
  
  var serviceLevel: js.UndefOr[ServiceLevel] = js.undefined
  
  var userId: js.UndefOr[UserID] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var webApiUrlPrefix: js.UndefOr[String] = js.undefined
}
object NoteStoreUrl {
  
  inline def apply(): NoteStoreUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteStoreUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoteStoreUrl] (val x: Self) extends AnyVal {
    
    inline def setNoteStoreUrl(value: String): Self = StObject.set(x, "noteStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setNoteStoreUrlUndefined: Self = StObject.set(x, "noteStoreUrl", js.undefined)
    
    inline def setServiceLevel(value: ServiceLevel): Self = StObject.set(x, "serviceLevel", value.asInstanceOf[js.Any])
    
    inline def setServiceLevelUndefined: Self = StObject.set(x, "serviceLevel", js.undefined)
    
    inline def setUserId(value: UserID): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setWebApiUrlPrefix(value: String): Self = StObject.set(x, "webApiUrlPrefix", value.asInstanceOf[js.Any])
    
    inline def setWebApiUrlPrefixUndefined: Self = StObject.set(x, "webApiUrlPrefix", js.undefined)
  }
}
