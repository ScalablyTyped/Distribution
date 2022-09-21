package typings.ethJsonRpcMiddleware

import typings.ethJsonRpcMiddleware.typesMod.SafeEventEmitterProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerAsMiddlewareMod {
  
  @JSImport("eth-json-rpc-middleware/dist/providerAsMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ethersProviderAsMiddleware(provider: SafeEventEmitterProvider): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ethersProviderAsMiddleware")(provider.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def providerAsMiddleware(provider: SafeEventEmitterProvider): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("providerAsMiddleware")(provider.asInstanceOf[js.Any]).asInstanceOf[Any]
}
