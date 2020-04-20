package typings.eventTargetShim.mod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectListener[TEvent] extends js.Object {
  def handleEvent(event: TEvent): Unit
}

object ObjectListener {
  @scala.inline
  def apply[TEvent](handleEvent: TEvent => Unit): ObjectListener[TEvent] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[ObjectListener[TEvent]]
  }
}

