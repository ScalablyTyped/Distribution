package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.CallArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetReturnValueRequest extends StObject {
  
  /**
    * New return value.
    */
  var newValue: CallArgument
}
object SetReturnValueRequest {
  
  inline def apply(newValue: CallArgument): SetReturnValueRequest = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetReturnValueRequest]
  }
  
  extension [Self <: SetReturnValueRequest](x: Self) {
    
    inline def setNewValue(value: CallArgument): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
  }
}
