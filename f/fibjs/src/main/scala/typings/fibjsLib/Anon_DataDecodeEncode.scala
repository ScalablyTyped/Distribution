package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataDecodeEncode extends js.Object {
  def decode(data: Class_Buffer): js.Object
  def encode(data: js.Object): Class_Buffer
}

object Anon_DataDecodeEncode {
  @scala.inline
  def apply(decode: Class_Buffer => js.Object, encode: js.Object => Class_Buffer): Anon_DataDecodeEncode = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[Anon_DataDecodeEncode]
  }
}

