package typings.ethJsonRpcMiddleware

import typings.ethBlockTracker.mod.PollingBlockTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockTrackerInspectorMod {
  
  @JSImport("eth-json-rpc-middleware/dist/block-tracker-inspector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBlockTrackerInspectorMiddleware(hasBlockTracker: BlockTrackerInspectorMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockTrackerInspectorMiddleware")(hasBlockTracker.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait BlockTrackerInspectorMiddlewareOptions extends StObject {
    
    var blockTracker: PollingBlockTracker
  }
  object BlockTrackerInspectorMiddlewareOptions {
    
    inline def apply(blockTracker: PollingBlockTracker): BlockTrackerInspectorMiddlewareOptions = {
      val __obj = js.Dynamic.literal(blockTracker = blockTracker.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockTrackerInspectorMiddlewareOptions]
    }
    
    extension [Self <: BlockTrackerInspectorMiddlewareOptions](x: Self) {
      
      inline def setBlockTracker(value: PollingBlockTracker): Self = StObject.set(x, "blockTracker", value.asInstanceOf[js.Any])
    }
  }
}
