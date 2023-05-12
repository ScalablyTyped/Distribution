package typings.ethers.anon

import typings.ethers.ethersStrings.receiveRpcResult
import typings.ethers.typesProvidersProviderJsonrpcMod.DebugEventJsonRpcApiProvider
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcError
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultArray
  extends StObject
     with DebugEventJsonRpcApiProvider {
  
  var action: receiveRpcResult
  
  var result: js.Array[JsonRpcResult | JsonRpcError]
}
object ResultArray {
  
  inline def apply(result: js.Array[JsonRpcResult | JsonRpcError]): ResultArray = {
    val __obj = js.Dynamic.literal(action = "receiveRpcResult", result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultArray] (val x: Self) extends AnyVal {
    
    inline def setAction(value: receiveRpcResult): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Array[JsonRpcResult | JsonRpcError]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: (JsonRpcResult | JsonRpcError)*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
