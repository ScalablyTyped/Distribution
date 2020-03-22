package typings.easyXHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlagString extends js.Object {
  var flag: js.UndefOr[String] = js.undefined
}

object AnonFlagString {
  @scala.inline
  def apply(flag: String = null): AnonFlagString = {
    val __obj = js.Dynamic.literal()
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlagString]
  }
}

