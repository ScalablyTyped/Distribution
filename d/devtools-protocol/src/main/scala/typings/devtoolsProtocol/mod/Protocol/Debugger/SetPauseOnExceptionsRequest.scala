package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.all
import typings.devtoolsProtocol.devtoolsProtocolStrings.none_
import typings.devtoolsProtocol.devtoolsProtocolStrings.uncaught
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPauseOnExceptionsRequest extends StObject {
  
  /**
    * Pause on exceptions mode. (SetPauseOnExceptionsRequestState enum)
    */
  var state: none_ | uncaught | all
}
object SetPauseOnExceptionsRequest {
  
  inline def apply(state: none_ | uncaught | all): SetPauseOnExceptionsRequest = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPauseOnExceptionsRequest]
  }
  
  extension [Self <: SetPauseOnExceptionsRequest](x: Self) {
    
    inline def setState(value: none_ | uncaught | all): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
