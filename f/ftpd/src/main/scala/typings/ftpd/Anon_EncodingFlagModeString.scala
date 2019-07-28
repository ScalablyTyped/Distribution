package typings.ftpd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlagModeString extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
}

object Anon_EncodingFlagModeString {
  @scala.inline
  def apply(encoding: String = null, flag: String = null, mode: String = null): Anon_EncodingFlagModeString = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[Anon_EncodingFlagModeString]
  }
}

