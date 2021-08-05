package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageStoreUrl extends StObject {
  
  var messageStoreUrl: js.UndefOr[String] = js.undefined
  
  var noteStoreUrl: js.UndefOr[String] = js.undefined
  
  var userStoreUrl: js.UndefOr[String] = js.undefined
  
  var userWebSocketUrl: js.UndefOr[String] = js.undefined
  
  var utilityUrl: js.UndefOr[String] = js.undefined
  
  var webApiUrlPrefix: js.UndefOr[String] = js.undefined
}
object MessageStoreUrl {
  
  inline def apply(): MessageStoreUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageStoreUrl]
  }
  
  extension [Self <: MessageStoreUrl](x: Self) {
    
    inline def setMessageStoreUrl(value: String): Self = StObject.set(x, "messageStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setMessageStoreUrlUndefined: Self = StObject.set(x, "messageStoreUrl", js.undefined)
    
    inline def setNoteStoreUrl(value: String): Self = StObject.set(x, "noteStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setNoteStoreUrlUndefined: Self = StObject.set(x, "noteStoreUrl", js.undefined)
    
    inline def setUserStoreUrl(value: String): Self = StObject.set(x, "userStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setUserStoreUrlUndefined: Self = StObject.set(x, "userStoreUrl", js.undefined)
    
    inline def setUserWebSocketUrl(value: String): Self = StObject.set(x, "userWebSocketUrl", value.asInstanceOf[js.Any])
    
    inline def setUserWebSocketUrlUndefined: Self = StObject.set(x, "userWebSocketUrl", js.undefined)
    
    inline def setUtilityUrl(value: String): Self = StObject.set(x, "utilityUrl", value.asInstanceOf[js.Any])
    
    inline def setUtilityUrlUndefined: Self = StObject.set(x, "utilityUrl", js.undefined)
    
    inline def setWebApiUrlPrefix(value: String): Self = StObject.set(x, "webApiUrlPrefix", value.asInstanceOf[js.Any])
    
    inline def setWebApiUrlPrefixUndefined: Self = StObject.set(x, "webApiUrlPrefix", js.undefined)
  }
}
