package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  val hexNs: js.Any
  def decode(data: java.lang.String): Class_Buffer
  def encode(data: Class_Buffer): java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(decode: java.lang.String => Class_Buffer, encode: Class_Buffer => java.lang.String, hexNs: js.Any): Anon_Data = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), hexNs = hexNs)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

