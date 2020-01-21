package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTotal extends js.Object {
  var total: js.UndefOr[Double] = js.native
}

object AnonTotal {
  @scala.inline
  def apply(total: Int | Double = null): AnonTotal = {
    val __obj = js.Dynamic.literal()
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTotal]
  }
}

