package typings.ethJsonRpcMiddleware

import typings.ethJsonRpcMiddleware.typesMod.SafeEventEmitterProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerFromMiddlewareMod {
  
  @JSImport("eth-json-rpc-middleware/dist/providerFromMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def providerFromMiddleware(
    middleware: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcMiddleware<Array<string>, Block> */ Any
  ): SafeEventEmitterProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("providerFromMiddleware")(middleware.asInstanceOf[js.Any]).asInstanceOf[SafeEventEmitterProvider]
}
