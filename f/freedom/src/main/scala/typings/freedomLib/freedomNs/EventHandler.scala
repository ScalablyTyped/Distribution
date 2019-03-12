package typings
package freedomLib.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventHandler extends js.Object {
  // The |off| function removes the event event handling function |f| from
  // both |on| and the |once| event handling.
  def off(t: java.lang.String, f: js.Function): scala.Unit
  // Adds |f| as an event handler for all subsiquent events of type |t|.
  def on(t: java.lang.String, f: js.Function): scala.Unit
  // Adds |f| as an event handler for only the next event of type |t|.
  def once(t: java.lang.String, f: js.Function): scala.Unit
}

object EventHandler {
  @scala.inline
  def apply(
    off: (java.lang.String, js.Function) => scala.Unit,
    on: (java.lang.String, js.Function) => scala.Unit,
    once: (java.lang.String, js.Function) => scala.Unit
  ): EventHandler = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
  
    __obj.asInstanceOf[EventHandler]
  }
}

