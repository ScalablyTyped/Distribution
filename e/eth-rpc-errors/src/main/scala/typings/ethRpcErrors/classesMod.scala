package typings.ethRpcErrors

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classesMod {
  
  @JSImport("eth-rpc-errors/dist/classes", "EthereumProviderError")
  @js.native
  open class EthereumProviderError[T] protected () extends EthereumRpcError[T] {
    /**
      * Create an Ethereum Provider JSON-RPC error.
      * `code` must be an integer in the 1000 <= 4999 range.
      */
    def this(code: Double, message: String) = this()
    def this(code: Double, message: String, data: T) = this()
  }
  
  @JSImport("eth-rpc-errors/dist/classes", "EthereumRpcError")
  @js.native
  open class EthereumRpcError[T] protected ()
    extends StObject
       with Error {
    def this(code: Double, message: String) = this()
    def this(code: Double, message: String, data: T) = this()
    
    var code: Double = js.native
    
    var data: js.UndefOr[T] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Returns a plain object with all public class properties.
      */
    def serialize(): SerializedEthereumRpcError = js.native
  }
  
  trait SerializedEthereumRpcError extends StObject {
    
    var code: Double
    
    var data: js.UndefOr[Any] = js.undefined
    
    var message: String
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object SerializedEthereumRpcError {
    
    inline def apply(code: Double, message: String): SerializedEthereumRpcError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedEthereumRpcError]
    }
    
    extension [Self <: SerializedEthereumRpcError](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
