package typings.firebaseDatabase

import typings.firebaseDatabase.eventEmitterMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/VisibilityMonitor", JSImport.Namespace)
@js.native
object visibilityMonitorMod extends js.Object {
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

