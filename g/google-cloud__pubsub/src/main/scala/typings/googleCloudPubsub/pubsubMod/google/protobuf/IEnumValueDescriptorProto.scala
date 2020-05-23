package typings.googleCloudPubsub.pubsubMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EnumValueDescriptorProto. */
trait IEnumValueDescriptorProto extends js.Object {
  /** EnumValueDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** EnumValueDescriptorProto number */
  var number: js.UndefOr[Double | Null] = js.undefined
  /** EnumValueDescriptorProto options */
  var options: js.UndefOr[IEnumValueOptions | Null] = js.undefined
}

object IEnumValueDescriptorProto {
  @scala.inline
  def apply(
    name: js.UndefOr[Null | String] = js.undefined,
    number: js.UndefOr[Null | Double] = js.undefined,
    options: js.UndefOr[Null | IEnumValueOptions] = js.undefined
  ): IEnumValueDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnumValueDescriptorProto]
  }
}

