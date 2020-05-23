package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object NotificationOptions {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
}

