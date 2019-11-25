package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Option

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: String
  var value: js.UndefOr[typings.googleDashProtobuf.googleProtobufAnyUnderscorePbMod.Any.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    name: String,
    value: typings.googleDashProtobuf.googleProtobufAnyUnderscorePbMod.Any.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

