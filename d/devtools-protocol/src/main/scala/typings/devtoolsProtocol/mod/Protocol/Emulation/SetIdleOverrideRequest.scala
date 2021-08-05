package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIdleOverrideRequest extends StObject {
  
  /**
    * Mock isScreenUnlocked
    */
  var isScreenUnlocked: Boolean
  
  /**
    * Mock isUserActive
    */
  var isUserActive: Boolean
}
object SetIdleOverrideRequest {
  
  inline def apply(isScreenUnlocked: Boolean, isUserActive: Boolean): SetIdleOverrideRequest = {
    val __obj = js.Dynamic.literal(isScreenUnlocked = isScreenUnlocked.asInstanceOf[js.Any], isUserActive = isUserActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdleOverrideRequest]
  }
  
  extension [Self <: SetIdleOverrideRequest](x: Self) {
    
    inline def setIsScreenUnlocked(value: Boolean): Self = StObject.set(x, "isScreenUnlocked", value.asInstanceOf[js.Any])
    
    inline def setIsUserActive(value: Boolean): Self = StObject.set(x, "isUserActive", value.asInstanceOf[js.Any])
  }
}
