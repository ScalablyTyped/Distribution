package typings.dialogflow.protosProtosMod.google.protobuf

import typings.dialogflow.protosProtosMod.google.protobuf.FieldDescriptorProto.Label
import typings.dialogflow.protosProtosMod.google.protobuf.FieldDescriptorProto.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FieldDescriptorProto. */
trait IFieldDescriptorProto extends js.Object {
  /** FieldDescriptorProto defaultValue */
  var defaultValue: js.UndefOr[String | Null] = js.undefined
  /** FieldDescriptorProto extendee */
  var extendee: js.UndefOr[String | Null] = js.undefined
  /** FieldDescriptorProto jsonName */
  var jsonName: js.UndefOr[String | Null] = js.undefined
  /** FieldDescriptorProto label */
  var label: js.UndefOr[Label | Null] = js.undefined
  /** FieldDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** FieldDescriptorProto number */
  var number: js.UndefOr[Double | Null] = js.undefined
  /** FieldDescriptorProto oneofIndex */
  var oneofIndex: js.UndefOr[Double | Null] = js.undefined
  /** FieldDescriptorProto options */
  var options: js.UndefOr[IFieldOptions | Null] = js.undefined
  /** FieldDescriptorProto type */
  var `type`: js.UndefOr[Type | Null] = js.undefined
  /** FieldDescriptorProto typeName */
  var typeName: js.UndefOr[String | Null] = js.undefined
}

object IFieldDescriptorProto {
  @scala.inline
  def apply(
    defaultValue: String = null,
    extendee: String = null,
    jsonName: String = null,
    label: Label = null,
    name: String = null,
    number: Int | Double = null,
    oneofIndex: Int | Double = null,
    options: IFieldOptions = null,
    `type`: Type = null,
    typeName: String = null
  ): IFieldDescriptorProto = {
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
    __obj.asInstanceOf[IFieldDescriptorProto]
  }
}

