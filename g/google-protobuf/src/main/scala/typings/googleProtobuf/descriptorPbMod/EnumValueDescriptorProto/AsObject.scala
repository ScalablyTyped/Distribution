package typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.EnumValueOptions.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    name: String = null,
    number: js.UndefOr[Double] = js.undefined,
    options: typings.googleProtobuf.descriptorPbMod.EnumValueOptions.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

