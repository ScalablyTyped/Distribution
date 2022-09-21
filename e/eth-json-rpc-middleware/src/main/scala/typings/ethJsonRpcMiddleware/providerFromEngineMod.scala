package typings.ethJsonRpcMiddleware

import typings.ethJsonRpcMiddleware.typesMod.SafeEventEmitterProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerFromEngineMod {
  
  @JSImport("eth-json-rpc-middleware/dist/providerFromEngine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def providerFromEngine(
    engine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcEngine */ Any
  ): SafeEventEmitterProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("providerFromEngine")(engine.asInstanceOf[js.Any]).asInstanceOf[SafeEventEmitterProvider]
}
