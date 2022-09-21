package typings.ethJsonRpcMiddleware

import typings.ethBlockTracker.mod.PollingBlockTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockCacheMod {
  
  @JSImport("eth-json-rpc-middleware/dist/block-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBlockCacheMiddleware(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockCacheMiddleware")().asInstanceOf[Any]
  inline def createBlockCacheMiddleware(hasBlockTracker: BlockCacheMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockCacheMiddleware")(hasBlockTracker.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait BlockCacheMiddlewareOptions extends StObject {
    
    var blockTracker: js.UndefOr[PollingBlockTracker] = js.undefined
  }
  object BlockCacheMiddlewareOptions {
    
    inline def apply(): BlockCacheMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockCacheMiddlewareOptions]
    }
    
    extension [Self <: BlockCacheMiddlewareOptions](x: Self) {
      
      inline def setBlockTracker(value: PollingBlockTracker): Self = StObject.set(x, "blockTracker", value.asInstanceOf[js.Any])
      
      inline def setBlockTrackerUndefined: Self = StObject.set(x, "blockTracker", js.undefined)
    }
  }
}
