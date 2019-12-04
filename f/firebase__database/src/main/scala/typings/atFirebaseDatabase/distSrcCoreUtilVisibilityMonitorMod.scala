package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcCoreUtilEventEmitterMod.EventEmitter
import typings.atFirebaseDatabase.distSrcCoreUtilVisibilityMonitorMod.VisibilityMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/VisibilityMonitor", JSImport.Namespace)
@js.native
object distSrcCoreUtilVisibilityMonitorMod extends js.Object {
  @js.native
  class VisibilityMonitor () extends EventEmitter {
    var visible_ : js.Any = js.native
  }
  
  /* static members */
  @js.native
  object VisibilityMonitor extends js.Object {
    def getInstance(): VisibilityMonitor = js.native
  }
  
}

