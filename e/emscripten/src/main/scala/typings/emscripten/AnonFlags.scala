package typings.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlags extends js.Object {
  var flags: js.UndefOr[String] = js.undefined
}

object AnonFlags {
  @scala.inline
  def apply(flags: String = null): AnonFlags = {
    val __obj = js.Dynamic.literal()
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlags]
  }
}

