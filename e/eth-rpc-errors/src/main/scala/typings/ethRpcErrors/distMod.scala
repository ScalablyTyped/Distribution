package typings.ethRpcErrors

import typings.ethRpcErrors.anon.Custom
import typings.ethRpcErrors.anon.FallbackError
import typings.ethRpcErrors.anon.InvalidInput
import typings.ethRpcErrors.distClassesMod.SerializedEthereumRpcError
import typings.ethRpcErrors.distErrorConstantsMod.ErrorCodes_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("eth-rpc-errors/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("eth-rpc-errors/dist", "EthereumProviderError")
  @js.native
  open class EthereumProviderError[T] protected ()
    extends typings.ethRpcErrors.distClassesMod.EthereumProviderError[T] {
    /**
      * Create an Ethereum Provider JSON-RPC error.
      * `code` must be an integer in the 1000 <= 4999 range.
      */
    def this(code: Double, message: String) = this()
    def this(code: Double, message: String, data: T) = this()
  }
  
  @JSImport("eth-rpc-errors/dist", "EthereumRpcError")
  @js.native
  open class EthereumRpcError[T] protected ()
    extends typings.ethRpcErrors.distClassesMod.EthereumRpcError[T] {
    def this(code: Double, message: String) = this()
    def this(code: Double, message: String, data: T) = this()
  }
  
  @JSImport("eth-rpc-errors/dist", "errorCodes")
  @js.native
  val errorCodes: ErrorCodes_ = js.native
  
  object ethErrors {
    
    @JSImport("eth-rpc-errors/dist", "ethErrors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("eth-rpc-errors/dist", "ethErrors.provider")
    @js.native
    def provider: Custom = js.native
    inline def provider_=(x: Custom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("provider")(x.asInstanceOf[js.Any])
    
    @JSImport("eth-rpc-errors/dist", "ethErrors.rpc")
    @js.native
    def rpc: InvalidInput = js.native
    inline def rpc_=(x: InvalidInput): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rpc")(x.asInstanceOf[js.Any])
  }
  
  inline def getMessageFromCode(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessageFromCode")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getMessageFromCode(code: Double, fallbackMessage: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMessageFromCode")(code.asInstanceOf[js.Any], fallbackMessage.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serializeError(error: Any): SerializedEthereumRpcError = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeError")(error.asInstanceOf[js.Any]).asInstanceOf[SerializedEthereumRpcError]
  inline def serializeError(error: Any, param1: FallbackError): SerializedEthereumRpcError = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeError")(error.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[SerializedEthereumRpcError]
}
