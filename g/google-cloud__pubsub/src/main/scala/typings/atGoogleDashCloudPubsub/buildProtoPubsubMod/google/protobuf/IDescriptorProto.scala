package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf

import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.DescriptorProto.IExtensionRange
import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.DescriptorProto.IReservedRange
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
    enumType: js.Array[IEnumDescriptorProto] = null,
    extension: js.Array[IFieldDescriptorProto] = null,
    extensionRange: js.Array[IExtensionRange] = null,
    field: js.Array[IFieldDescriptorProto] = null,
    name: String = null,
    nestedType: js.Array[IDescriptorProto] = null,
    oneofDecl: js.Array[IOneofDescriptorProto] = null,
    options: IMessageOptions = null,
    reservedName: js.Array[String] = null,
    reservedRange: js.Array[IReservedRange] = null
  ): IDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (enumType != null) __obj.updateDynamic("enumType")(enumType.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (extensionRange != null) __obj.updateDynamic("extensionRange")(extensionRange.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nestedType != null) __obj.updateDynamic("nestedType")(nestedType.asInstanceOf[js.Any])
    if (oneofDecl != null) __obj.updateDynamic("oneofDecl")(oneofDecl.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (reservedName != null) __obj.updateDynamic("reservedName")(reservedName.asInstanceOf[js.Any])
    if (reservedRange != null) __obj.updateDynamic("reservedRange")(reservedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDescriptorProto]
  }
}

