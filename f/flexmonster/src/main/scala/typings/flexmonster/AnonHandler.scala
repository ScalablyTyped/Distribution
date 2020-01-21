package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandler extends js.Object {
  var handler: js.UndefOr[js.Function0[Unit]] = js.undefined
  var label: String
}

object AnonHandler {
  @scala.inline
  def apply(label: String, handler: () => Unit = null): AnonHandler = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction0(handler))
    __obj.asInstanceOf[AnonHandler]
  }
}

