package typings.googleCloudPubsub.iamMod.google.protobuf

import typings.googleCloudPubsub.iamMod.google.protobuf.DescriptorProto.IExtensionRange
import typings.googleCloudPubsub.iamMod.google.protobuf.DescriptorProto.IReservedRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DescriptorProto. */
trait IDescriptorProto extends js.Object {
  /** DescriptorProto enumType */
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto] | Null] = js.undefined
  /** DescriptorProto extension */
  var extension: js.UndefOr[js.Array[IFieldDescriptorProto] | Null] = js.undefined
  /** DescriptorProto extensionRange */
  var extensionRange: js.UndefOr[js.Array[IExtensionRange] | Null] = js.undefined
  /** DescriptorProto field */
  var field: js.UndefOr[js.Array[IFieldDescriptorProto] | Null] = js.undefined
  /** DescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** DescriptorProto nestedType */
  var nestedType: js.UndefOr[js.Array[IDescriptorProto] | Null] = js.undefined
  /** DescriptorProto oneofDecl */
  var oneofDecl: js.UndefOr[js.Array[IOneofDescriptorProto] | Null] = js.undefined
  /** DescriptorProto options */
  var options: js.UndefOr[IMessageOptions | Null] = js.undefined
  /** DescriptorProto reservedName */
  var reservedName: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** DescriptorProto reservedRange */
  var reservedRange: js.UndefOr[js.Array[IReservedRange] | Null] = js.undefined
}

object IDescriptorProto {
  @scala.inline
  def apply(
    enumType: js.UndefOr[Null | js.Array[IEnumDescriptorProto]] = js.undefined,
    extension: js.UndefOr[Null | js.Array[IFieldDescriptorProto]] = js.undefined,
    extensionRange: js.UndefOr[Null | js.Array[IExtensionRange]] = js.undefined,
    field: js.UndefOr[Null | js.Array[IFieldDescriptorProto]] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    nestedType: js.UndefOr[Null | js.Array[IDescriptorProto]] = js.undefined,
    oneofDecl: js.UndefOr[Null | js.Array[IOneofDescriptorProto]] = js.undefined,
    options: js.UndefOr[Null | IMessageOptions] = js.undefined,
    reservedName: js.UndefOr[Null | js.Array[String]] = js.undefined,
    reservedRange: js.UndefOr[Null | js.Array[IReservedRange]] = js.undefined
  ): IDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enumType)) __obj.updateDynamic("enumType")(enumType.asInstanceOf[js.Any])
    if (!js.isUndefined(extension)) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (!js.isUndefined(extensionRange)) __obj.updateDynamic("extensionRange")(extensionRange.asInstanceOf[js.Any])
    if (!js.isUndefined(field)) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nestedType)) __obj.updateDynamic("nestedType")(nestedType.asInstanceOf[js.Any])
    if (!js.isUndefined(oneofDecl)) __obj.updateDynamic("oneofDecl")(oneofDecl.asInstanceOf[js.Any])
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(reservedName)) __obj.updateDynamic("reservedName")(reservedName.asInstanceOf[js.Any])
    if (!js.isUndefined(reservedRange)) __obj.updateDynamic("reservedRange")(reservedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDescriptorProto]
  }
}

