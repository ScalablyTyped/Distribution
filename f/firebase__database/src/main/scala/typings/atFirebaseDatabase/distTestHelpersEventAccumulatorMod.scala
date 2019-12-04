package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distTestHelpersEventAccumulatorMod.EventAccumulator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/test/helpers/EventAccumulator", JSImport.Namespace)
@js.native
object distTestHelpersEventAccumulatorMod extends js.Object {
  @js.native
  class EventAccumulator protected () extends js.Object {
    def this(condition: js.Function) = this()
    var condition: js.Function = js.native
    var eventData: js.Array[_] = js.native
    var onEventFxn: js.Any = js.native
    var onResetFxn: js.Any = js.native
    var promise: js.Any = js.native
    var reject: js.Any = js.native
    var resolve: js.Any = js.native
    def _testCondition(): js.Any = js.native
    def addEvent(): Unit = js.native
    def addEvent(eventData: js.Any): Unit = js.native
    def onEvent(cb: js.Function): Unit = js.native
    def onReset(cb: js.Function): Unit = js.native
    def reset(): Unit = js.native
    def reset(condition: js.Function): Unit = js.native
  }
  
  @js.native
  object EventAccumulatorFactory extends js.Object {
    def waitsForCount(maxCount: js.Any): EventAccumulator = js.native
  }
  
}

