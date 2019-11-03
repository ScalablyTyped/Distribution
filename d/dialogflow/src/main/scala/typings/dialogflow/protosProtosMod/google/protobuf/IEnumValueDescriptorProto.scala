package typings.dialogflow.protosProtosMod.google.protobuf

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
  def apply(name: String = null, number: Int | Double = null, options: IEnumValueOptions = null): IEnumValueDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[IEnumValueDescriptorProto]
  }
}

