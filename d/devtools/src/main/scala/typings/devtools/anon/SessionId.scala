package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionId extends StObject {
  
  var capabilities: BrowserName
  
  var sessionId: String
}
object SessionId {
  
  @scala.inline
  def apply(capabilities: BrowserName, sessionId: String): SessionId = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionId]
  }
  
  @scala.inline
  implicit class SessionIdMutableBuilder[Self <: SessionId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: BrowserName): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
