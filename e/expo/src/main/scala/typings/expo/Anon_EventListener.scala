package typings.expo

import typings.expo.buildUpdatesUpdatesMod.UpdateEvent
import typings.expo.buildUpdatesUpdatesMod.UpdateEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventListener extends js.Object {
  var eventListener: js.UndefOr[UpdateEventListener] = js.undefined
}

object Anon_EventListener {
  @scala.inline
  def apply(eventListener: /* event */ UpdateEvent => Unit = null): Anon_EventListener = {
    val __obj = js.Dynamic.literal()
    if (eventListener != null) __obj.updateDynamic("eventListener")(js.Any.fromFunction1(eventListener))
    __obj.asInstanceOf[Anon_EventListener]
  }
}

