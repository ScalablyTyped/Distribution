package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTotalItems extends js.Object {
  var totalItems: js.UndefOr[Double] = js.native
}

object AnonTotalItems {
  @scala.inline
  def apply(totalItems: Int | Double = null): AnonTotalItems = {
    val __obj = js.Dynamic.literal()
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTotalItems]
  }
}

