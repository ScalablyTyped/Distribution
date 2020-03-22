package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTotalItemsNumber extends js.Object {
  var totalItems: js.UndefOr[Double] = js.native
}

object AnonTotalItemsNumber {
  @scala.inline
  def apply(totalItems: Int | Double = null): AnonTotalItemsNumber = {
    val __obj = js.Dynamic.literal()
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTotalItemsNumber]
  }
}

