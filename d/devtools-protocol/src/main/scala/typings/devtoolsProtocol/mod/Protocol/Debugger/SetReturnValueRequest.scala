package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.CallArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetReturnValueRequest extends StObject {
  
  /**
    * New return value.
    */
  var newValue: CallArgument = js.native
}
object SetReturnValueRequest {
  
  @scala.inline
  def apply(newValue: CallArgument): SetReturnValueRequest = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetReturnValueRequest]
  }
  
  @scala.inline
  implicit class SetReturnValueRequestMutableBuilder[Self <: SetReturnValueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: CallArgument): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
  }
}
