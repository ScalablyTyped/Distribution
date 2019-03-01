package typings
package fsDashMockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlags extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var flags: js.UndefOr[java.lang.String] = js.undefined
  var string: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EncodingFlags {
  @scala.inline
  def apply(encoding: java.lang.String = null, flags: java.lang.String = null, string: java.lang.String = null): Anon_EncodingFlags = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (string != null) __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[Anon_EncodingFlags]
  }
}

