package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetSkipAllPausesRequest extends StObject {
  
  /**
    * New value for skip pauses state.
    */
  var skip: Boolean = js.native
}
object SetSkipAllPausesRequest {
  
  @scala.inline
  def apply(skip: Boolean): SetSkipAllPausesRequest = {
    val __obj = js.Dynamic.literal(skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSkipAllPausesRequest]
  }
  
  @scala.inline
  implicit class SetSkipAllPausesRequestMutableBuilder[Self <: SetSkipAllPausesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
  }
}
