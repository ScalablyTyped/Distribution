package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreUtilEventEmitterMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreUtilVisibilityMonitorMod {
  
  @JSImport("@firebase/database/dist/src/core/util/VisibilityMonitor", "VisibilityMonitor")
  @js.native
  open class VisibilityMonitor () extends EventEmitter {
    
    /* private */ var visible_ : Any = js.native
  }
  /* static members */
  object VisibilityMonitor {
    
    @JSImport("@firebase/database/dist/src/core/util/VisibilityMonitor", "VisibilityMonitor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): VisibilityMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[VisibilityMonitor]
  }
}
