package typings.googleGax.fallbackErrorMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtobufAny extends js.Object {
  var type_url: String
  var value: Uint8Array
}

object ProtobufAny {
  @scala.inline
  def apply(type_url: String, value: Uint8Array): ProtobufAny = {
    val __obj = js.Dynamic.literal(type_url = type_url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProtobufAny]
  }
}

