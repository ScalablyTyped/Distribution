package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TotalItems extends js.Object {
  /** Total number of people who +1'd this comment. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object Anon_TotalItems {
  @scala.inline
  def apply(totalItems: scala.Int | scala.Double = null): Anon_TotalItems = {
    val __obj = js.Dynamic.literal()
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TotalItems]
  }
}

