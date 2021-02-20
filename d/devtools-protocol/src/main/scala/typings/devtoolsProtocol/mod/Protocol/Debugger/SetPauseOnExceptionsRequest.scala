package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.all
import typings.devtoolsProtocol.devtoolsProtocolStrings.none_
import typings.devtoolsProtocol.devtoolsProtocolStrings.uncaught
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetPauseOnExceptionsRequest extends StObject {
  
  /**
    * Pause on exceptions mode. (SetPauseOnExceptionsRequestState enum)
    */
  var state: none_ | uncaught | all = js.native
}
object SetPauseOnExceptionsRequest {
  
  @scala.inline
  def apply(state: none_ | uncaught | all): SetPauseOnExceptionsRequest = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPauseOnExceptionsRequest]
  }
  
  @scala.inline
  implicit class SetPauseOnExceptionsRequestMutableBuilder[Self <: SetPauseOnExceptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: none_ | uncaught | all): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
