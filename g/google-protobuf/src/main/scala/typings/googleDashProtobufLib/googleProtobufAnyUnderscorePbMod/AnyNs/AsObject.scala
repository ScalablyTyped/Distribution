package typings
package googleDashProtobufLib.googleProtobufAnyUnderscorePbMod.AnyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var typeUrl: java.lang.String
  var value: stdLib.Uint8Array | java.lang.String
}

object AsObject {
  @scala.inline
  def apply(typeUrl: java.lang.String, value: stdLib.Uint8Array | java.lang.String): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("typeUrl")(typeUrl)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

