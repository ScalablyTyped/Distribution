package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumValueOptions.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    name: String = null,
    number: Int | Double = null,
    options: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumValueOptions.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

