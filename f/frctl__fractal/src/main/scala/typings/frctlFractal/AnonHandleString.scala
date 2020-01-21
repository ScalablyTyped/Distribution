package typings.frctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandleString extends js.Object {
  var handle: js.UndefOr[String] = js.undefined
}

object AnonHandleString {
  @scala.inline
  def apply(handle: String = null): AnonHandleString = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandleString]
  }
}

