package typings.firebaseAuth.authMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
trait AuthEvent extends StObject {
  
  var error: js.UndefOr[AuthEventError] = js.undefined
  
  var eventId: String | Null
  
  var postBody: String | Null
  
  var sessionId: String | Null
  
  var tenantId: String | Null
  
  var `type`: AuthEventType
  
  var urlResponse: String | Null
}
object AuthEvent {
  
  inline def apply(`type`: AuthEventType): AuthEvent = {
    val __obj = js.Dynamic.literal(eventId = null, postBody = null, sessionId = null, tenantId = null, urlResponse = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthEvent]
  }
  
  extension [Self <: AuthEvent](x: Self) {
    
    inline def setError(value: AuthEventError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdNull: Self = StObject.set(x, "eventId", null)
    
    inline def setPostBody(value: String): Self = StObject.set(x, "postBody", value.asInstanceOf[js.Any])
    
    inline def setPostBodyNull: Self = StObject.set(x, "postBody", null)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setType(value: AuthEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrlResponse(value: String): Self = StObject.set(x, "urlResponse", value.asInstanceOf[js.Any])
    
    inline def setUrlResponseNull: Self = StObject.set(x, "urlResponse", null)
  }
}
