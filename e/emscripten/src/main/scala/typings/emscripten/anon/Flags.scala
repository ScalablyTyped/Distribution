package typings.emscripten.anon

import typings.emscripten.emscriptenStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  var encoding: utf8
  var flags: js.UndefOr[String] = js.undefined
}

object Flags {
  @scala.inline
  def apply(encoding: utf8, flags: String = null): Flags = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
}

