package typings.easeljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleEvent extends js.Object {
  def handleEvent(eventObj: js.Object): Boolean
}

object HandleEvent {
  @scala.inline
  def apply(handleEvent: js.Object => Boolean): HandleEvent = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[HandleEvent]
  }
}

