package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRPHRegistrationModeRequest extends StObject {
  
  var mode: AutoResponseMode
}
object SetRPHRegistrationModeRequest {
  
  inline def apply(mode: AutoResponseMode): SetRPHRegistrationModeRequest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRPHRegistrationModeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetRPHRegistrationModeRequest] (val x: Self) extends AnyVal {
    
    inline def setMode(value: AutoResponseMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
