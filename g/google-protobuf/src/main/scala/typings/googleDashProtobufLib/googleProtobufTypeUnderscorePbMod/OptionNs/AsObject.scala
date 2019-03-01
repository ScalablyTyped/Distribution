package typings
package googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: java.lang.String
  var value: js.UndefOr[googleDashProtobufLib.googleProtobufAnyUnderscorePbMod.AnyNs.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: googleDashProtobufLib.googleProtobufAnyUnderscorePbMod.AnyNs.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AsObject]
  }
}

