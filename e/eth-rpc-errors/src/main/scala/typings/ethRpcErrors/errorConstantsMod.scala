package typings.ethRpcErrors

import typings.ethRpcErrors.anon.ChainDisconnected
import typings.ethRpcErrors.anon.Internal
import typings.ethRpcErrors.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorConstantsMod {
  
  @JSImport("eth-rpc-errors/dist/error-constants", "errorCodes")
  @js.native
  val errorCodes: ErrorCodes_ = js.native
  
  object errorValues {
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.-32000")
    @js.native
    val `32000`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.-32001")
    @js.native
    val `32001`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.-32002")
    @js.native
    val `32002`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.-32003")
    @js.native
    val `32003`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.-32004")
    @js.native
    val `32004`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.-32005")
    @js.native
    val `32005`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.-32600")
    @js.native
    val `32600`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.-32601")
    @js.native
    val `32601`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.-32602")
    @js.native
    val `32602`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.-32603")
    @js.native
    val `32603`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.-32700")
    @js.native
    val `32700`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.4001")
    @js.native
    val `4001`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.4100")
    @js.native
    val `4100`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.4200")
    @js.native
    val `4200`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.4900")
    @js.native
    val `4900`: Message = js.native
    
    @JSImport("eth-rpc-errors/dist/error-constants", "errorValues.4901")
    @js.native
    val `4901`: Message = js.native
  }
  
  trait ErrorCodes_ extends StObject {
    
    val provider: ChainDisconnected
    
    val rpc: Internal
  }
  object ErrorCodes_ {
    
    inline def apply(provider: ChainDisconnected, rpc: Internal): ErrorCodes_ = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], rpc = rpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorCodes_]
    }
    
    extension [Self <: ErrorCodes_](x: Self) {
      
      inline def setProvider(value: ChainDisconnected): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setRpc(value: Internal): Self = StObject.set(x, "rpc", value.asInstanceOf[js.Any])
    }
  }
}
