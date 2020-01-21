package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationHandler extends js.Object {
  def cancel(): Unit
}

object NotificationHandler {
  @scala.inline
  def apply(cancel: () => Unit): NotificationHandler = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
  
    __obj.asInstanceOf[NotificationHandler]
  }
}

