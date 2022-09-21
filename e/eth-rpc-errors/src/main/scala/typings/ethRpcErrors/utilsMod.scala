package typings.ethRpcErrors

import typings.ethRpcErrors.anon.FallbackError
import typings.ethRpcErrors.classesMod.SerializedEthereumRpcError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("eth-rpc-errors/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("eth-rpc-errors/dist/utils", "JSON_RPC_SERVER_ERROR_MESSAGE")
  @js.native
  val JSON_RPC_SERVER_ERROR_MESSAGE: /* "Unspecified server error." */ String = js.native
  
  inline def getMessageFromCode(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessageFromCode")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getMessageFromCode(code: Double, fallbackMessage: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMessageFromCode")(code.asInstanceOf[js.Any], fallbackMessage.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isValidCode(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCode")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def serializeError(error: Any): SerializedEthereumRpcError = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeError")(error.asInstanceOf[js.Any]).asInstanceOf[SerializedEthereumRpcError]
  inline def serializeError(error: Any, hasFallbackErrorShouldIncludeStack: FallbackError): SerializedEthereumRpcError = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeError")(error.asInstanceOf[js.Any], hasFallbackErrorShouldIncludeStack.asInstanceOf[js.Any])).asInstanceOf[SerializedEthereumRpcError]
}
