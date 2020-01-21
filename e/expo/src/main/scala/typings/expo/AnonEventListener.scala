package typings.expo

import typings.expo.updatesMod.UpdateEvent
import typings.expo.updatesMod.UpdateEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventListener extends js.Object {
  var eventListener: js.UndefOr[UpdateEventListener] = js.undefined
}

object AnonEventListener {
  @scala.inline
  def apply(eventListener: /* event */ UpdateEvent => Unit = null): AnonEventListener = {
    val __obj = js.Dynamic.literal()
    if (eventListener != null) __obj.updateDynamic("eventListener")(js.Any.fromFunction1(eventListener))
    __obj.asInstanceOf[AnonEventListener]
  }
}

