package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonC extends js.Object {
  var c: js.UndefOr[js.Array[AnonV]] = js.native
}

object AnonC {
  @scala.inline
  def apply(c: js.Array[AnonV] = null): AnonC = {
    val __obj = js.Dynamic.literal()
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonC]
  }
}

