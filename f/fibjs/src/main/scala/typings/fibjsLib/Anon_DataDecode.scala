package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataDecode extends js.Object {
  val jsonNs: js.Any
  def decode(data: java.lang.String): js.Any
  def encode(data: js.Any): java.lang.String
}

object Anon_DataDecode {
  @scala.inline
  def apply(
    decode: js.Function1[java.lang.String, js.Any],
    encode: js.Function1[js.Any, java.lang.String],
    jsonNs: js.Any
  ): Anon_DataDecode = {
    val __obj = js.Dynamic.literal(decode = decode, encode = encode, jsonNs = jsonNs)
  
    __obj.asInstanceOf[Anon_DataDecode]
  }
}

