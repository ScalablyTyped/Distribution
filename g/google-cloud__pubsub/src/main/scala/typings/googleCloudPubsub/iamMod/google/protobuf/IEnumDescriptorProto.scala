package typings.googleCloudPubsub.iamMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EnumDescriptorProto. */
trait IEnumDescriptorProto extends js.Object {
  /** EnumDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** EnumDescriptorProto options */
  var options: js.UndefOr[IEnumOptions | Null] = js.undefined
  /** EnumDescriptorProto value */
  var value: js.UndefOr[js.Array[IEnumValueDescriptorProto] | Null] = js.undefined
}

object IEnumDescriptorProto {
  @scala.inline
  def apply(
    name: js.UndefOr[Null | String] = js.undefined,
    options: js.UndefOr[Null | IEnumOptions] = js.undefined,
    value: js.UndefOr[Null | js.Array[IEnumValueDescriptorProto]] = js.undefined
  ): IEnumDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnumDescriptorProto]
  }
}

