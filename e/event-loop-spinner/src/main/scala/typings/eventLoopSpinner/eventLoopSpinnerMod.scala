package typings.eventLoopSpinner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("event-loop-spinner/dist/event-loop-spinner", JSImport.Namespace)
@js.native
object eventLoopSpinnerMod extends js.Object {
  @js.native
  class EventLoopSpinner () extends js.Object {
    def this(thresholdMs: Double) = this()
    var afterLastSpin: js.Any = js.native
    var thresholdMs: js.Any = js.native
    def isStarving(): Boolean = js.native
    def reset(): Unit = js.native
    def spin(): js.Promise[Unit] = js.native
  }
  
}

