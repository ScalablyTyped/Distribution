package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base32 extends js.Object {
  val base32Ns: js.Any
  def decode(data: java.lang.String): Class_Buffer
  def encode(data: Class_Buffer): java.lang.String
}

object Anon_Base32 {
  @scala.inline
  def apply(
    base32Ns: js.Any,
    decode: java.lang.String => Class_Buffer,
    encode: Class_Buffer => java.lang.String
  ): Anon_Base32 = {
    val __obj = js.Dynamic.literal(base32Ns = base32Ns, decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[Anon_Base32]
  }
}

