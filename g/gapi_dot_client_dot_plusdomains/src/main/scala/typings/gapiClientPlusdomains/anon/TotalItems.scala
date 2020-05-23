package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TotalItems extends js.Object {
  /** Total number of people who +1'd this comment. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object TotalItems {
  @scala.inline
  def apply(totalItems: js.UndefOr[Double] = js.undefined): TotalItems = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalItems]
  }
}

