package typings.detox.mod.global.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircusTestEventListenerBase extends js.Object {
  def handleTestEvent(event: js.Any, state: js.Any): js.Promise[Unit]
}

object CircusTestEventListenerBase {
  @scala.inline
  def apply(handleTestEvent: (js.Any, js.Any) => js.Promise[Unit]): CircusTestEventListenerBase = {
    val __obj = js.Dynamic.literal(handleTestEvent = js.Any.fromFunction2(handleTestEvent))
    __obj.asInstanceOf[CircusTestEventListenerBase]
  }
}

