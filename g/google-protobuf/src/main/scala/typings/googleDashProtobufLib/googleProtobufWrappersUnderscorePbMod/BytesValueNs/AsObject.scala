package typings
package googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BytesValueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var value: stdLib.Uint8Array | java.lang.String
}

object AsObject {
  @scala.inline
  def apply(value: stdLib.Uint8Array | java.lang.String): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

