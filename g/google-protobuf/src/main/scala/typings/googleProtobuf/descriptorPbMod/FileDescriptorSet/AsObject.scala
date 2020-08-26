package typings.googleProtobuf.descriptorPbMod.FileDescriptorSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var fileList: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(fileList: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
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
    def setFileListVarargs(value: typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject*): Self = this.set("fileList", js.Array(value :_*))
    @scala.inline
    def setFileList(value: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject]): Self = this.set("fileList", value.asInstanceOf[js.Any])
  }
  
}

