package typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.EnumOptions.AsObject] = js.undefined
  var reservedNameList: js.Array[String]
  var reservedRangeList: js.Array[
    typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
  ]
  var valueList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    reservedNameList: js.Array[String],
    reservedRangeList: js.Array[
      typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange.AsObject
    ],
    valueList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumValueDescriptorProto.AsObject],
    name: String = null,
    options: typings.googleProtobuf.descriptorPbMod.EnumOptions.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(reservedNameList = reservedNameList.asInstanceOf[js.Any], reservedRangeList = reservedRangeList.asInstanceOf[js.Any], valueList = valueList.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

