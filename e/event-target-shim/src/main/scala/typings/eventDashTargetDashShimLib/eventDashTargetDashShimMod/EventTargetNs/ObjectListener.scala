package typings
package eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectListener[TEvent] extends js.Object {
  def handleEvent(event: TEvent): scala.Unit
}

object ObjectListener {
  @scala.inline
  def apply[TEvent](handleEvent: js.Function1[TEvent, scala.Unit]): ObjectListener[TEvent] = {
    val __obj = js.Dynamic.literal(handleEvent = handleEvent)
  
    __obj.asInstanceOf[ObjectListener[TEvent]]
  }
}

