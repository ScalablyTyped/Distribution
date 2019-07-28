package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: String
  var value: js.UndefOr[typings.googleDashProtobuf.googleProtobufAnyUnderscorePbMod.AnyNs.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    name: String,
    value: typings.googleDashProtobuf.googleProtobufAnyUnderscorePbMod.AnyNs.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(name = name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AsObject]
  }
}

