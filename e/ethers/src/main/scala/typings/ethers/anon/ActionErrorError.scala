package typings.ethers.anon

import typings.ethers.ethersStrings.receiveRpcError
import typings.ethers.typesProvidersProviderJsonrpcMod.DebugEventJsonRpcApiProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionErrorError
  extends StObject
     with DebugEventJsonRpcApiProvider {
  
  var action: receiveRpcError
  
  var error: js.Error
}
object ActionErrorError {
  
  inline def apply(error: js.Error): ActionErrorError = {
    val __obj = js.Dynamic.literal(action = "receiveRpcError", error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionErrorError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionErrorError] (val x: Self) extends AnyVal {
    
    inline def setAction(value: receiveRpcError): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
