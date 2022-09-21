package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionInfo extends StObject {
  
  var sessionInfo: String
}
object SessionInfo {
  
  inline def apply(sessionInfo: String): SessionInfo = {
    val __obj = js.Dynamic.literal(sessionInfo = sessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionInfo]
  }
  
  extension [Self <: SessionInfo](x: Self) {
    
    inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
  }
}
