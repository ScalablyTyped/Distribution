package typings.emscripten

import typings.emscripten.emscriptenStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlags extends js.Object {
  var encoding: utf8
  var flags: js.UndefOr[String] = js.undefined
}

object AnonFlags {
  @scala.inline
  def apply(encoding: utf8, flags: String = null): AnonFlags = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlags]
  }
}

