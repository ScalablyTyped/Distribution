package typings.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonC extends js.Object {
  var c: js.UndefOr[js.Array[AnonV]] = js.undefined
}

object AnonC {
  @scala.inline
  def apply(c: js.Array[AnonV] = null): AnonC = {
    val __obj = js.Dynamic.literal()
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonC]
  }
}

