package typings.flight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  def logAll(): Unit
  def logByAction(action: String): Unit
  def logByName(name: String): Unit
  def logNone(): Unit
}

object AnonAction {
  @scala.inline
  def apply(logAll: () => Unit, logByAction: String => Unit, logByName: String => Unit, logNone: () => Unit): AnonAction = {
    val __obj = js.Dynamic.literal(logAll = js.Any.fromFunction0(logAll), logByAction = js.Any.fromFunction1(logByAction), logByName = js.Any.fromFunction1(logByName), logNone = js.Any.fromFunction0(logNone))
  
    __obj.asInstanceOf[AnonAction]
  }
}

