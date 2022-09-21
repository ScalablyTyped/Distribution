package typings.ethJsonRpcMiddleware

import typings.ethBlockTracker.mod.PollingBlockTracker
import typings.ethJsonRpcMiddleware.typesMod.SafeEventEmitterProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockRefMod {
  
  @JSImport("eth-json-rpc-middleware/dist/block-ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBlockRefMiddleware(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockRefMiddleware")().asInstanceOf[Any]
  inline def createBlockRefMiddleware(hasProviderBlockTracker: BlockRefMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockRefMiddleware")(hasProviderBlockTracker.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait BlockRefMiddlewareOptions extends StObject {
    
    var blockTracker: js.UndefOr[PollingBlockTracker] = js.undefined
    
    var provider: js.UndefOr[SafeEventEmitterProvider] = js.undefined
  }
  object BlockRefMiddlewareOptions {
    
    inline def apply(): BlockRefMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockRefMiddlewareOptions]
    }
    
    extension [Self <: BlockRefMiddlewareOptions](x: Self) {
      
      inline def setBlockTracker(value: PollingBlockTracker): Self = StObject.set(x, "blockTracker", value.asInstanceOf[js.Any])
      
      inline def setBlockTrackerUndefined: Self = StObject.set(x, "blockTracker", js.undefined)
      
      inline def setProvider(value: SafeEventEmitterProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
  }
}
