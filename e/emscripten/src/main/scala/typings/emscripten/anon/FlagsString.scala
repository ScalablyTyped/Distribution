package typings.emscripten.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagsString extends js.Object {
  var flags: js.UndefOr[String] = js.undefined
}

object FlagsString {
  @scala.inline
  def apply(flags: String = null): FlagsString = {
    val __obj = js.Dynamic.literal()
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagsString]
  }
}

