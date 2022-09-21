package typings.ethJsonRpcMiddleware

import typings.ethBlockTracker.mod.PollingBlockTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockRefRewriteMod {
  
  @JSImport("eth-json-rpc-middleware/dist/block-ref-rewrite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBlockRefRewriteMiddleware(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockRefRewriteMiddleware")().asInstanceOf[Any]
  inline def createBlockRefRewriteMiddleware(hasBlockTracker: BlockRefRewriteMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockRefRewriteMiddleware")(hasBlockTracker.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait BlockRefRewriteMiddlewareOptions extends StObject {
    
    var blockTracker: js.UndefOr[PollingBlockTracker] = js.undefined
  }
  object BlockRefRewriteMiddlewareOptions {
    
    inline def apply(): BlockRefRewriteMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockRefRewriteMiddlewareOptions]
    }
    
    extension [Self <: BlockRefRewriteMiddlewareOptions](x: Self) {
      
      inline def setBlockTracker(value: PollingBlockTracker): Self = StObject.set(x, "blockTracker", value.asInstanceOf[js.Any])
      
      inline def setBlockTrackerUndefined: Self = StObject.set(x, "blockTracker", js.undefined)
    }
  }
}
