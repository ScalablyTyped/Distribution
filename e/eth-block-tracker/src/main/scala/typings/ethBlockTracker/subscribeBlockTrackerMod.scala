package typings.ethBlockTracker

import typings.ethBlockTracker.baseBlockTrackerMod.BaseBlockTracker
import typings.ethBlockTracker.baseBlockTrackerMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeBlockTrackerMod {
  
  @JSImport("eth-block-tracker/dist/SubscribeBlockTracker", "SubscribeBlockTracker")
  @js.native
  open class SubscribeBlockTracker () extends BaseBlockTracker {
    def this(opts: SubscribeBlockTrackerOptions) = this()
    
    /* private */ var _call: Any = js.native
    
    /* private */ var _handleSubData: Any = js.native
    
    /* private */ var _provider: Any = js.native
    
    /* private */ var _subscriptionId: Any = js.native
    
    def checkForLatestBlock(): js.Promise[String] = js.native
  }
  
  trait SubscribeBlockTrackerOptions extends StObject {
    
    var blockResetDuration: js.UndefOr[Double] = js.undefined
    
    var provider: js.UndefOr[Provider] = js.undefined
  }
  object SubscribeBlockTrackerOptions {
    
    inline def apply(): SubscribeBlockTrackerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeBlockTrackerOptions]
    }
    
    extension [Self <: SubscribeBlockTrackerOptions](x: Self) {
      
      inline def setBlockResetDuration(value: Double): Self = StObject.set(x, "blockResetDuration", value.asInstanceOf[js.Any])
      
      inline def setBlockResetDurationUndefined: Self = StObject.set(x, "blockResetDuration", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
  }
}
