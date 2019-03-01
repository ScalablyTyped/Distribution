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
  var options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceOptionsNs.AsObject
}

object AsObject {
  @scala.inline
  def apply(
    methodList: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProtoNs.AsObject
    ],
    options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceOptionsNs.AsObject,
    name: java.lang.String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("methodList")(methodList)
    __obj.updateDynamic("options")(options)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AsObject]
  }
}

