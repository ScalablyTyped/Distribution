package typings
package easyDashXDashHeadersLib.punycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ucs2 extends js.Object {
  def decode(string: java.lang.String): java.lang.String
  def encode(codePoints: js.Array[scala.Double]): java.lang.String
}

object ucs2 {
  @scala.inline
  def apply(
    decode: js.Function1[java.lang.String, java.lang.String],
    encode: js.Function1[js.Array[scala.Double], java.lang.String]
  ): ucs2 = {
    val __obj = js.Dynamic.literal(decode = decode, encode = encode)
  
    __obj.asInstanceOf[ucs2]
  }
}

