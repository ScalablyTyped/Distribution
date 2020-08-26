package typings.googleProtobuf.descriptorPbMod.ServiceDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var methodList: js.Array[typings.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject] = js.native
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[typings.googleProtobuf.descriptorPbMod.ServiceOptions.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(methodList: js.Array[typings.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(methodList = methodList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMethodListVarargs(value: typings.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject*): Self = this.set("methodList", js.Array(value :_*))
    @scala.inline
    def setMethodList(value: js.Array[typings.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject]): Self = this.set("methodList", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptions(value: typings.googleProtobuf.descriptorPbMod.ServiceOptions.AsObject): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

