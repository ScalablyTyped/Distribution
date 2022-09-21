package typings.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventAccumulatorMod {
  
  @JSImport("@firebase/database/dist/node-esm/test/helpers/EventAccumulator", "EventAccumulator")
  @js.native
  open class EventAccumulator protected () extends StObject {
    def this(condition: js.Function) = this()
    
    def _testCondition(): Any = js.native
    
    def addEvent(): Unit = js.native
    def addEvent(eventData: Any): Unit = js.native
    
    var condition: js.Function = js.native
    
    var eventData: js.Array[Any] = js.native
    
    def onEvent(cb: js.Function): Unit = js.native
    
    /* private */ var onEventFxn: Any = js.native
    
    def onReset(cb: js.Function): Unit = js.native
    
    /* private */ var onResetFxn: Any = js.native
    
    var promise: Any = js.native
    
    var reject: Any = js.native
    
    def reset(): Unit = js.native
    def reset(condition: js.Function): Unit = js.native
    
    var resolve: Any = js.native
  }
  
  object EventAccumulatorFactory {
    
    @JSImport("@firebase/database/dist/node-esm/test/helpers/EventAccumulator", "EventAccumulatorFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def waitsForCount(maxCount: Any): EventAccumulator = ^.asInstanceOf[js.Dynamic].applyDynamic("waitsForCount")(maxCount.asInstanceOf[js.Any]).asInstanceOf[EventAccumulator]
    
    inline def waitsForExactCount(maxCount: Any): EventAccumulator = ^.asInstanceOf[js.Dynamic].applyDynamic("waitsForExactCount")(maxCount.asInstanceOf[js.Any]).asInstanceOf[EventAccumulator]
  }
}
