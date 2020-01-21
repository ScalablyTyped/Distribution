package typings.googleProtobuf.descriptorPbMod.DescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var enumTypeList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject]
  var extensionList: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]
  var extensionRangeList: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject]
  var fieldList: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]
  var name: js.UndefOr[String] = js.undefined
  var nestedTypeList: js.Array[AsObject]
  var oneofDeclList: js.Array[typings.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject]
  var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.MessageOptions.AsObject] = js.undefined
  var reservedNameList: js.Array[String]
  var reservedRangeList: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    enumTypeList: js.Array[typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject],
    extensionList: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject],
    extensionRangeList: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject],
    fieldList: js.Array[typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject],
    nestedTypeList: js.Array[AsObject],
    oneofDeclList: js.Array[typings.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject],
    reservedNameList: js.Array[String],
    reservedRangeList: js.Array[typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject],
    name: String = null,
    options: typings.googleProtobuf.descriptorPbMod.MessageOptions.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(enumTypeList = enumTypeList.asInstanceOf[js.Any], extensionList = extensionList.asInstanceOf[js.Any], extensionRangeList = extensionRangeList.asInstanceOf[js.Any], fieldList = fieldList.asInstanceOf[js.Any], nestedTypeList = nestedTypeList.asInstanceOf[js.Any], oneofDeclList = oneofDeclList.asInstanceOf[js.Any], reservedNameList = reservedNameList.asInstanceOf[js.Any], reservedRangeList = reservedRangeList.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

