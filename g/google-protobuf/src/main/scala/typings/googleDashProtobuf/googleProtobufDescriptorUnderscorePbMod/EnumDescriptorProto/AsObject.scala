package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumOptions.AsObject
  ] = js.undefined
  var reservedNameList: js.Array[String]
  var reservedRangeList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto.EnumReservedRange.AsObject
  ]
  var valueList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProto.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    reservedNameList: js.Array[String],
    reservedRangeList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto.EnumReservedRange.AsObject
    ],
    valueList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProto.AsObject
    ],
    name: String = null,
    options: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumOptions.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(reservedNameList = reservedNameList, reservedRangeList = reservedRangeList, valueList = valueList)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AsObject]
  }
}

