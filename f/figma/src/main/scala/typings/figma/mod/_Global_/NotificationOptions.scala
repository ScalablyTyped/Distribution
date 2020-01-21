package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object NotificationOptions {
  @scala.inline
  def apply(timeout: Int | Double = null): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
}

