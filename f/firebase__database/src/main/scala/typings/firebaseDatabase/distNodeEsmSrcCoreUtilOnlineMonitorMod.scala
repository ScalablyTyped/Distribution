package typings.firebaseDatabase

import typings.firebaseDatabase.distNodeEsmSrcCoreUtilEventEmitterMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreUtilOnlineMonitorMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/OnlineMonitor", "OnlineMonitor")
  @js.native
  open class OnlineMonitor () extends EventEmitter {
    
    def currentlyOnline(): Boolean = js.native
    
    /* private */ var online_ : Any = js.native
  }
  /* static members */
  object OnlineMonitor {
    
    @JSImport("@firebase/database/dist/node-esm/src/core/util/OnlineMonitor", "OnlineMonitor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): OnlineMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[OnlineMonitor]
  }
}
