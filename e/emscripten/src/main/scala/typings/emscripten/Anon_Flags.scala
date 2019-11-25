package typings.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flags extends js.Object {
  var flags: js.UndefOr[String] = js.undefined
}

object Anon_Flags {
  @scala.inline
  def apply(flags: String = null): Anon_Flags = {
    val __obj = js.Dynamic.literal()
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Flags]
  }
}

