package typings.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTotalItems extends js.Object {
  /** Total number of people who +1'd this comment. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object AnonTotalItems {
  @scala.inline
  def apply(totalItems: Int | Double = null): AnonTotalItems = {
    val __obj = js.Dynamic.literal()
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTotalItems]
  }
}

