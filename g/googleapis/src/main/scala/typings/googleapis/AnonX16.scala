package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonX16 extends js.Object {
  var x16: js.UndefOr[String] = js.native
  var x32: js.UndefOr[String] = js.native
}

object AnonX16 {
  @scala.inline
  def apply(x16: String = null, x32: String = null): AnonX16 = {
    val __obj = js.Dynamic.literal()
    if (x16 != null) __obj.updateDynamic("x16")(x16.asInstanceOf[js.Any])
    if (x32 != null) __obj.updateDynamic("x32")(x32.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX16]
  }
}

