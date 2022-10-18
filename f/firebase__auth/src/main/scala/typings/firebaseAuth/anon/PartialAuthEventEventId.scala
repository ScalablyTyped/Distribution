package typings.firebaseAuth.anon

import typings.firebaseAuth.distEsm5SrcModelPopupRedirectMod.AuthEventError
import typings.firebaseAuth.distEsm5SrcModelPopupRedirectMod.AuthEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@firebase/auth.@firebase/auth/dist/esm5/src/model/popup_redirect.AuthEvent> */
trait PartialAuthEventEventId extends StObject {
  
  var error: js.UndefOr[AuthEventError] = js.undefined
  
  var eventId: js.UndefOr[String | Null] = js.undefined
  
  var postBody: js.UndefOr[String | Null] = js.undefined
  
  var sessionId: js.UndefOr[String | Null] = js.undefined
  
  var tenantId: js.UndefOr[String | Null] = js.undefined
  
  var `type`: js.UndefOr[AuthEventType] = js.undefined
  
  var urlResponse: js.UndefOr[String | Null] = js.undefined
}
object PartialAuthEventEventId {
  
  inline def apply(): PartialAuthEventEventId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAuthEventEventId]
  }
  
  extension [Self <: PartialAuthEventEventId](x: Self) {
    
    inline def setError(value: AuthEventError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdNull: Self = StObject.set(x, "eventId", null)
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setPostBody(value: String): Self = StObject.set(x, "postBody", value.asInstanceOf[js.Any])
    
    inline def setPostBodyNull: Self = StObject.set(x, "postBody", null)
    
    inline def setPostBodyUndefined: Self = StObject.set(x, "postBody", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setType(value: AuthEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrlResponse(value: String): Self = StObject.set(x, "urlResponse", value.asInstanceOf[js.Any])
    
    inline def setUrlResponseNull: Self = StObject.set(x, "urlResponse", null)
    
    inline def setUrlResponseUndefined: Self = StObject.set(x, "urlResponse", js.undefined)
  }
}
