package typings.easeljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  def handleEvent(eventObj: js.Object): Unit
}

object `0` {
  @scala.inline
  def apply(handleEvent: js.Object => Unit): `0` = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[`0`]
  }
}

