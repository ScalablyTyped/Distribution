package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Total extends js.Object {
  var total: js.UndefOr[Double] = js.native
}

object Anon_Total {
  @scala.inline
  def apply(total: Int | Double = null): Anon_Total = {
    val __obj = js.Dynamic.literal()
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Total]
  }
}

