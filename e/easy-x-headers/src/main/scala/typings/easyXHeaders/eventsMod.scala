package typings.easyXHeaders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("events", "EventEmitter")
  @js.native
  open class EventEmitter ()
    extends StObject
       with typings.easyXHeaders.NodeJS.EventEmitter
  /* static members */
  object EventEmitter {
    
    @JSImport("events", "EventEmitter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def listenerCount(emitter: EventEmitter, event: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
