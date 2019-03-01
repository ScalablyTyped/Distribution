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
    off: js.Function2[java.lang.String, js.Function, scala.Unit],
    on: js.Function2[java.lang.String, js.Function, scala.Unit],
    once: js.Function2[java.lang.String, js.Function, scala.Unit]
  ): EventHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("off")(off)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("once")(once)
    __obj.asInstanceOf[EventHandler]
  }
}

