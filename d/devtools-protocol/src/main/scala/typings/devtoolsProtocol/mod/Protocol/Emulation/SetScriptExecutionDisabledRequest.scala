package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetScriptExecutionDisabledRequest extends StObject {
  
  /**
    * Whether script execution should be disabled in the page.
    */
  var value: Boolean
}
object SetScriptExecutionDisabledRequest {
  
  inline def apply(value: Boolean): SetScriptExecutionDisabledRequest = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScriptExecutionDisabledRequest]
  }
  
  extension [Self <: SetScriptExecutionDisabledRequest](x: Self) {
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
