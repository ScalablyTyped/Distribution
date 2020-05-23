package typings.expo.anon

import typings.expo.updatesMod.UpdateEvent
import typings.expo.updatesMod.UpdateEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListener extends js.Object {
  var eventListener: js.UndefOr[UpdateEventListener] = js.undefined
}

object EventListener {
  @scala.inline
  def apply(eventListener: /* event */ UpdateEvent => Unit = null): EventListener = {
    val __obj = js.Dynamic.literal()
    if (eventListener != null) __obj.updateDynamic("eventListener")(js.Any.fromFunction1(eventListener))
    __obj.asInstanceOf[EventListener]
  }
}

