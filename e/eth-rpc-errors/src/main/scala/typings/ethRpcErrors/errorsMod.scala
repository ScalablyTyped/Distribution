package typings.ethRpcErrors

import typings.ethRpcErrors.anon.Custom
import typings.ethRpcErrors.anon.InvalidInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  object ethErrors {
    
    @JSImport("eth-rpc-errors/dist/errors", "ethErrors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("eth-rpc-errors/dist/errors", "ethErrors.provider")
    @js.native
    def provider: Custom = js.native
    inline def provider_=(x: Custom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("provider")(x.asInstanceOf[js.Any])
    
    @JSImport("eth-rpc-errors/dist/errors", "ethErrors.rpc")
    @js.native
    def rpc: InvalidInput = js.native
    inline def rpc_=(x: InvalidInput): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rpc")(x.asInstanceOf[js.Any])
  }
  
  type CustomErrorArg[T] = ServerErrorOptions[T]
  
  trait EthereumErrorOptions[T] extends StObject {
    
    var data: js.UndefOr[T] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object EthereumErrorOptions {
    
    inline def apply[T](): EthereumErrorOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EthereumErrorOptions[T]]
    }
    
    extension [Self <: EthereumErrorOptions[?], T](x: Self & EthereumErrorOptions[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait ServerErrorOptions[T]
    extends StObject
       with EthereumErrorOptions[T] {
    
    var code: Double
  }
  object ServerErrorOptions {
    
    inline def apply[T](code: Double): ServerErrorOptions[T] = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerErrorOptions[T]]
    }
    
    extension [Self <: ServerErrorOptions[?], T](x: Self & ServerErrorOptions[T]) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
