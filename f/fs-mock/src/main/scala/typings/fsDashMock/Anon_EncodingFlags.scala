package typings.fsDashMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlags extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var string: js.UndefOr[String] = js.undefined
}

object Anon_EncodingFlags {
  @scala.inline
  def apply(encoding: String = null, flags: String = null, string: String = null): Anon_EncodingFlags = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingFlags]
  }
}

