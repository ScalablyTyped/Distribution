package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventHandler extends StObject {
  
  // The |off| function removes the event event handling function |f| from
  // both |on| and the |once| event handling.
  def off(t: String, f: js.Function): Unit
  
  // Adds |f| as an event handler for all subsiquent events of type |t|.
  def on(t: String, f: js.Function): Unit
  
  // Adds |f| as an event handler for only the next event of type |t|.
  def once(t: String, f: js.Function): Unit
}
object EventHandler {
  
  inline def apply(
    off: (String, js.Function) => Unit,
    on: (String, js.Function) => Unit,
    once: (String, js.Function) => Unit
  ): EventHandler = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
    __obj.asInstanceOf[EventHandler]
  }
  
  extension [Self <: EventHandler](x: Self) {
    
    inline def setOff(value: (String, js.Function) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(value: (String, js.Function) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOnce(value: (String, js.Function) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
  }
}
