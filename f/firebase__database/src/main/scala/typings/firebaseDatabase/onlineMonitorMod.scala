package typings.firebaseDatabase

import typings.firebaseDatabase.eventEmitterMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onlineMonitorMod {
  
  @JSImport("@firebase/database/dist/src/core/util/OnlineMonitor", "OnlineMonitor")
  @js.native
  class OnlineMonitor () extends EventEmitter {
    
    /**
      * @return {boolean}
      */
    def currentlyOnline(): Boolean = js.native
    
    var online_ : js.Any = js.native
  }
  /* static members */
  object OnlineMonitor {
    
    @JSImport("@firebase/database/dist/src/core/util/OnlineMonitor", "OnlineMonitor")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getInstance(): OnlineMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[OnlineMonitor]
  }
}
