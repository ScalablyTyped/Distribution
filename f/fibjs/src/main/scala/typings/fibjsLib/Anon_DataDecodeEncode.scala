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
  def apply(decode: js.Function1[Class_Buffer, js.Object], encode: js.Function1[js.Object, Class_Buffer]): Anon_DataDecodeEncode = {
    val __obj = js.Dynamic.literal(decode = decode, encode = encode)
  
    __obj.asInstanceOf[Anon_DataDecodeEncode]
  }
}

