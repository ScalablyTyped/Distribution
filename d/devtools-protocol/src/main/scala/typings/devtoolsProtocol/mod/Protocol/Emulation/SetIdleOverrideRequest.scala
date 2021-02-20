package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetIdleOverrideRequest extends StObject {
  
  /**
    * Mock isScreenUnlocked
    */
  var isScreenUnlocked: Boolean = js.native
  
  /**
    * Mock isUserActive
    */
  var isUserActive: Boolean = js.native
}
object SetIdleOverrideRequest {
  
  @scala.inline
  def apply(isScreenUnlocked: Boolean, isUserActive: Boolean): SetIdleOverrideRequest = {
    val __obj = js.Dynamic.literal(isScreenUnlocked = isScreenUnlocked.asInstanceOf[js.Any], isUserActive = isUserActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdleOverrideRequest]
  }
  
  @scala.inline
  implicit class SetIdleOverrideRequestMutableBuilder[Self <: SetIdleOverrideRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsScreenUnlocked(value: Boolean): Self = StObject.set(x, "isScreenUnlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUserActive(value: Boolean): Self = StObject.set(x, "isUserActive", value.asInstanceOf[js.Any])
  }
}
