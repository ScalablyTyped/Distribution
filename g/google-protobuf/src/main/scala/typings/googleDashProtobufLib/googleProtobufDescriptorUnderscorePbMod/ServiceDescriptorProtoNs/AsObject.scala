package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProtoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var methodList: js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProtoNs.AsObject
  ]
  var name: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceOptionsNs.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    methodList: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProtoNs.AsObject
    ],
    name: java.lang.String = null,
    options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceOptionsNs.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(methodList = methodList)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AsObject]
  }
}

