package typings.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventAccumulatorMod {
  
  @JSImport("@firebase/database/dist/test/helpers/EventAccumulator", "EventAccumulator")
  @js.native
  class EventAccumulator protected () extends StObject {
    def this(condition: js.Function) = this()
    
    def _testCondition(): js.Any = js.native
    
    def addEvent(): Unit = js.native
    def addEvent(eventData: js.Any): Unit = js.native
    
    var condition: js.Function = js.native
    
    var eventData: js.Array[js.Any] = js.native
    
    def onEvent(cb: js.Function): Unit = js.native
    
    var onEventFxn: js.Any = js.native
    
    def onReset(cb: js.Function): Unit = js.native
    
    var onResetFxn: js.Any = js.native
    
    var promise: js.Any = js.native
    
    var reject: js.Any = js.native
    
    def reset(): Unit = js.native
    def reset(condition: js.Function): Unit = js.native
    
    var resolve: js.Any = js.native
  }
  
  object EventAccumulatorFactory {
    
    @JSImport("@firebase/database/dist/test/helpers/EventAccumulator", "EventAccumulatorFactory")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def waitsForCount(maxCount: js.Any): EventAccumulator = ^.asInstanceOf[js.Dynamic].applyDynamic("waitsForCount")(maxCount.asInstanceOf[js.Any]).asInstanceOf[EventAccumulator]
  }
}
