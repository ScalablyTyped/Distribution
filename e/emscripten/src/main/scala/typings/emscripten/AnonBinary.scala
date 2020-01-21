package typings.emscripten

import typings.emscripten.emscriptenStrings.binary
import typings.emscripten.emscriptenStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBinary extends js.Object {
  var encoding: js.UndefOr[binary | utf8] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
}

object AnonBinary {
  @scala.inline
  def apply(encoding: binary | utf8 = null, flags: String = null): AnonBinary = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBinary]
  }
}

