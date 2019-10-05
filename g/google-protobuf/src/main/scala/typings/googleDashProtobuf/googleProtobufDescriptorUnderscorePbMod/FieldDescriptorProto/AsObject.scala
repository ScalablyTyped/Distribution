package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var extendee: js.UndefOr[String] = js.undefined
  var jsonName: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[Label] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var oneofIndex: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptions.AsObject
  ] = js.undefined
  var `type`: js.UndefOr[Type] = js.undefined
  var typeName: js.UndefOr[String] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    defaultValue: String = null,
    extendee: String = null,
    jsonName: String = null,
    label: Label = null,
    name: String = null,
    number: Int | Double = null,
    oneofIndex: Int | Double = null,
    options: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptions.AsObject = null,
    `type`: Type = null,
    typeName: String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (extendee != null) __obj.updateDynamic("extendee")(extendee)
    if (jsonName != null) __obj.updateDynamic("jsonName")(jsonName)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (oneofIndex != null) __obj.updateDynamic("oneofIndex")(oneofIndex.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeName != null) __obj.updateDynamic("typeName")(typeName)
    __obj.asInstanceOf[AsObject]
  }
}

