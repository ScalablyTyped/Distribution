package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var methodList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProto.AsObject
  ]
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.ServiceOptions.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    methodList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProto.AsObject
    ],
    name: String = null,
    options: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.ServiceOptions.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(methodList = methodList)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AsObject]
  }
}

