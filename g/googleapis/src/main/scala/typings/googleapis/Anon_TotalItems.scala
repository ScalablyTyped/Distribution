package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_TotalItems extends js.Object {
  var totalItems: js.UndefOr[Double] = js.native
}

object Anon_TotalItems {
  @scala.inline
  def apply(totalItems: Int | Double = null): Anon_TotalItems = {
    val __obj = js.Dynamic.literal()
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TotalItems]
  }
}

