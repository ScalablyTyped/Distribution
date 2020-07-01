package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TotalItemsNumber extends js.Object {
  var totalItems: js.UndefOr[Double] = js.native
}

object TotalItemsNumber {
  @scala.inline
  def apply(totalItems: js.UndefOr[Double] = js.undefined): TotalItemsNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalItemsNumber]
  }
}

