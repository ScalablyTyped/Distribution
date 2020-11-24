package typings.firebaseDatabase

import typings.firebaseDatabase.eventEmitterMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/util/OnlineMonitor", JSImport.Namespace)
@js.native
object onlineMonitorMod extends js.Object {
  
  @js.native
  class OnlineMonitor () extends EventEmitter {
    
    /**
      * @return {boolean}
      */
    def currentlyOnline(): Boolean = js.native
    
    var online_ : js.Any = js.native
  }
  /* static members */
  @js.native
  object OnlineMonitor extends js.Object {
    
    def getInstance(): OnlineMonitor = js.native
  }
}
