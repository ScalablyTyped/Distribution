package typings.googleProtobuf.descriptorPbMod.ServiceDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var methodList: js.Array[typings.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject]
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.ServiceOptions.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    methodList: js.Array[typings.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject],
    name: String = null,
    options: typings.googleProtobuf.descriptorPbMod.ServiceOptions.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(methodList = methodList.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

