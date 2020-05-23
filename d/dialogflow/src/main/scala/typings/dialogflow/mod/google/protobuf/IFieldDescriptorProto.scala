package typings.dialogflow.mod.google.protobuf

import typings.dialogflow.mod.google.protobuf.FieldDescriptorProto.Label
import typings.dialogflow.mod.google.protobuf.FieldDescriptorProto.Type
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
  var label: js.UndefOr[
    Label | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldDescriptorProto.Label * / any */ String) | Null
  ] = js.undefined
  /** FieldDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** FieldDescriptorProto number */
  var number: js.UndefOr[Double | Null] = js.undefined
  /** FieldDescriptorProto oneofIndex */
  var oneofIndex: js.UndefOr[Double | Null] = js.undefined
  /** FieldDescriptorProto options */
  var options: js.UndefOr[IFieldOptions | Null] = js.undefined
  /** FieldDescriptorProto type */
  var `type`: js.UndefOr[
    Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldDescriptorProto.Type * / any */ String) | Null
  ] = js.undefined
  /** FieldDescriptorProto typeName */
  var typeName: js.UndefOr[String | Null] = js.undefined
}

object IFieldDescriptorProto {
  @scala.inline
  def apply(
    defaultValue: js.UndefOr[Null | String] = js.undefined,
    extendee: js.UndefOr[Null | String] = js.undefined,
    jsonName: js.UndefOr[Null | String] = js.undefined,
    label: js.UndefOr[
      Null | Label | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldDescriptorProto.Label * / any */ String)
    ] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    number: js.UndefOr[Null | Double] = js.undefined,
    oneofIndex: js.UndefOr[Null | Double] = js.undefined,
    options: js.UndefOr[Null | IFieldOptions] = js.undefined,
    `type`: js.UndefOr[
      Null | Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldDescriptorProto.Type * / any */ String)
    ] = js.undefined,
    typeName: js.UndefOr[Null | String] = js.undefined
  ): IFieldDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(extendee)) __obj.updateDynamic("extendee")(extendee.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonName)) __obj.updateDynamic("jsonName")(jsonName.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (!js.isUndefined(oneofIndex)) __obj.updateDynamic("oneofIndex")(oneofIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(typeName)) __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldDescriptorProto]
  }
}

