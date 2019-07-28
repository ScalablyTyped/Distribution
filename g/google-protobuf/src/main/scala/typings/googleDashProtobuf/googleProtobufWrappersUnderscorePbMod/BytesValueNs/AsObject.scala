package typings.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod.BytesValueNs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var value: Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(value: Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

