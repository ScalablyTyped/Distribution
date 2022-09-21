package typings.ethBlockTracker

import typings.metamaskSafeEventEmitter.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseBlockTrackerMod {
  
  @JSImport("eth-block-tracker/dist/BaseBlockTracker", "BaseBlockTracker")
  @js.native
  abstract class BaseBlockTracker protected () extends default {
    def this(opts: BaseBlockTrackerArgs) = this()
    
    /* private */ var _blockResetDuration: Any = js.native
    
    /* private */ var _blockResetTimeout: Any = js.native
    
    /* private */ var _cancelBlockResetTimeout: Any = js.native
    
    /* private */ var _currentBlock: Any = js.native
    
    /**
      * To be implemented in subclass.
      */
    /* protected */ def _end(): js.Promise[Unit] = js.native
    
    /* private */ var _getBlockTrackerEventCount: Any = js.native
    
    /* protected */ var _isRunning: Boolean = js.native
    
    /* private */ var _maybeEnd: Any = js.native
    
    /* private */ var _maybeStart: Any = js.native
    
    /* protected */ def _newPotentialLatest(newBlock: String): Unit = js.native
    
    /* private */ var _onNewListener: Any = js.native
    
    /* private */ var _onRemoveListener: Any = js.native
    
    /* private */ var _resetCurrentBlock: Any = js.native
    
    /* private */ var _setCurrentBlock: Any = js.native
    
    /* private */ var _setupBlockResetTimeout: Any = js.native
    
    /* private */ var _setupInternalEvents: Any = js.native
    
    /**
      * To be implemented in subclass.
      */
    /* protected */ def _start(): js.Promise[Unit] = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def getCurrentBlock(): String | Null = js.native
    
    def getLatestBlock(): js.Promise[String] = js.native
    
    def isRunning(): Boolean = js.native
  }
  
  trait BaseBlockTrackerArgs extends StObject {
    
    var blockResetDuration: js.UndefOr[Double] = js.undefined
  }
  object BaseBlockTrackerArgs {
    
    inline def apply(): BaseBlockTrackerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseBlockTrackerArgs]
    }
    
    extension [Self <: BaseBlockTrackerArgs](x: Self) {
      
      inline def setBlockResetDuration(value: Double): Self = StObject.set(x, "blockResetDuration", value.asInstanceOf[js.Any])
      
      inline def setBlockResetDurationUndefined: Self = StObject.set(x, "blockResetDuration", js.undefined)
    }
  }
  
  @js.native
  trait Provider extends default {
    
    def sendAsync[T, U](
      req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<T> */ Any,
      cb: js.Function2[
          /* err */ js.Error, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcResponse<U> */ /* response */ Any, 
          Unit
        ]
    ): Unit = js.native
  }
}
