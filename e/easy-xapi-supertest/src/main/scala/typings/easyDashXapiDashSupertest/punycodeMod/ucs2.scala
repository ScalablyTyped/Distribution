package typings.easyDashXapiDashSupertest.punycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ucs2 extends js.Object {
  def decode(string: String): String
  def encode(codePoints: js.Array[Double]): String
}

object ucs2 {
  @scala.inline
  def apply(decode: String => String, encode: js.Array[Double] => String): ucs2 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[ucs2]
  }
}

