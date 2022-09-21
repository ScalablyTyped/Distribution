package typings.ethJsonRpcMiddleware

import typings.ethBlockTracker.mod.PollingBlockTracker
import typings.ethJsonRpcMiddleware.typesMod.SafeEventEmitterProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryOnEmptyMod {
  
  @JSImport("eth-json-rpc-middleware/dist/retryOnEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRetryOnEmptyMiddleware(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createRetryOnEmptyMiddleware")().asInstanceOf[Any]
  inline def createRetryOnEmptyMiddleware(hasProviderBlockTracker: RetryOnEmptyMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createRetryOnEmptyMiddleware")(hasProviderBlockTracker.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait RetryOnEmptyMiddlewareOptions extends StObject {
    
    var blockTracker: js.UndefOr[PollingBlockTracker] = js.undefined
    
    var provider: js.UndefOr[SafeEventEmitterProvider] = js.undefined
  }
  object RetryOnEmptyMiddlewareOptions {
    
    inline def apply(): RetryOnEmptyMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOnEmptyMiddlewareOptions]
    }
    
    extension [Self <: RetryOnEmptyMiddlewareOptions](x: Self) {
      
      inline def setBlockTracker(value: PollingBlockTracker): Self = StObject.set(x, "blockTracker", value.asInstanceOf[js.Any])
      
      inline def setBlockTrackerUndefined: Self = StObject.set(x, "blockTracker", js.undefined)
      
      inline def setProvider(value: SafeEventEmitterProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
  }
}
