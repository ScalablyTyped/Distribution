package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumOptionsNs.AsObject
  var valueList: js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProtoNs.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumOptionsNs.AsObject,
    valueList: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProtoNs.AsObject
    ],
    name: java.lang.String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(options = options, valueList = valueList)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AsObject]
  }
}

