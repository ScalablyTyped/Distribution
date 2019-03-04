package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Charset extends js.Object {
  def decode(charset: java.lang.String, data: Class_Buffer): java.lang.String
  def encode(charset: java.lang.String, data: java.lang.String): Class_Buffer
  def isEncoding(charset: java.lang.String): scala.Boolean
}

object Anon_Charset {
  @scala.inline
  def apply(
    decode: js.Function2[java.lang.String, Class_Buffer, java.lang.String],
    encode: js.Function2[java.lang.String, java.lang.String, Class_Buffer],
    isEncoding: js.Function1[java.lang.String, scala.Boolean]
  ): Anon_Charset = {
    val __obj = js.Dynamic.literal(decode = decode, encode = encode, isEncoding = isEncoding)
  
    __obj.asInstanceOf[Anon_Charset]
  }
}

