package typings.googleDashProtobuf.googleProtobufAnyUnderscorePbMod.Any

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var typeUrl: String
  var value: Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(typeUrl: String, value: Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(typeUrl = typeUrl, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

