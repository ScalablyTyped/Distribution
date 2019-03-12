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
    decode: (java.lang.String, Class_Buffer) => java.lang.String,
    encode: (java.lang.String, java.lang.String) => Class_Buffer,
    isEncoding: java.lang.String => scala.Boolean
  ): Anon_Charset = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction2(encode), isEncoding = js.Any.fromFunction1(isEncoding))
  
    __obj.asInstanceOf[Anon_Charset]
  }
}

