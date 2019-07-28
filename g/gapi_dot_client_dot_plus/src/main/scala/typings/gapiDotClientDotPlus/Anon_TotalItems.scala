package typings.gapiDotClientDotPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TotalItems extends js.Object {
  /** Total number of people who +1'd this comment. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object Anon_TotalItems {
  @scala.inline
  def apply(totalItems: Int | Double = null): Anon_TotalItems = {
    val __obj = js.Dynamic.literal()
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TotalItems]
  }
}

