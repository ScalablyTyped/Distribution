package typings.ethBlockTracker

import typings.ethBlockTracker.baseBlockTrackerMod.BaseBlockTracker
import typings.ethBlockTracker.baseBlockTrackerMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pollingBlockTrackerMod {
  
  @JSImport("eth-block-tracker/dist/PollingBlockTracker", "PollingBlockTracker")
  @js.native
  open class PollingBlockTracker () extends BaseBlockTracker {
    def this(opts: PollingBlockTrackerOptions) = this()
    
    /* private */ var _fetchLatestBlock: Any = js.native
    
    /* private */ var _keepEventLoopActive: Any = js.native
    
    /* private */ var _pollingInterval: Any = js.native
    
    /* private */ var _provider: Any = js.native
    
    /* private */ var _retryTimeout: Any = js.native
    
    /* private */ var _setSkipCacheFlag: Any = js.native
    
    /* private */ var _synchronize: Any = js.native
    
    /* private */ var _updateLatestBlock: Any = js.native
    
    def checkForLatestBlock(): js.Promise[String] = js.native
  }
  
  trait PollingBlockTrackerOptions extends StObject {
    
    var blockResetDuration: js.UndefOr[Double] = js.undefined
    
    var keepEventLoopActive: js.UndefOr[Boolean] = js.undefined
    
    var pollingInterval: js.UndefOr[Double] = js.undefined
    
    var provider: js.UndefOr[Provider] = js.undefined
    
    var retryTimeout: js.UndefOr[Double] = js.undefined
    
    var setSkipCacheFlag: js.UndefOr[Boolean] = js.undefined
  }
  object PollingBlockTrackerOptions {
    
    inline def apply(): PollingBlockTrackerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PollingBlockTrackerOptions]
    }
    
    extension [Self <: PollingBlockTrackerOptions](x: Self) {
      
      inline def setBlockResetDuration(value: Double): Self = StObject.set(x, "blockResetDuration", value.asInstanceOf[js.Any])
      
      inline def setBlockResetDurationUndefined: Self = StObject.set(x, "blockResetDuration", js.undefined)
      
      inline def setKeepEventLoopActive(value: Boolean): Self = StObject.set(x, "keepEventLoopActive", value.asInstanceOf[js.Any])
      
      inline def setKeepEventLoopActiveUndefined: Self = StObject.set(x, "keepEventLoopActive", js.undefined)
      
      inline def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
      
      inline def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setRetryTimeout(value: Double): Self = StObject.set(x, "retryTimeout", value.asInstanceOf[js.Any])
      
      inline def setRetryTimeoutUndefined: Self = StObject.set(x, "retryTimeout", js.undefined)
      
      inline def setSetSkipCacheFlag(value: Boolean): Self = StObject.set(x, "setSkipCacheFlag", value.asInstanceOf[js.Any])
      
      inline def setSetSkipCacheFlagUndefined: Self = StObject.set(x, "setSkipCacheFlag", js.undefined)
    }
  }
}
