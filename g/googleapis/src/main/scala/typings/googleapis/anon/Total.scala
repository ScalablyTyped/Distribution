package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Total extends js.Object {
  var total: js.UndefOr[Double] = js.native
}

object Total {
  @scala.inline
  def apply(total: js.UndefOr[Double] = js.undefined): Total = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Total]
  }
}

