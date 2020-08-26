package typings.googleProtobuf.pluginPbMod.CodeGeneratorRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var compilerVersion: js.UndefOr[typings.googleProtobuf.pluginPbMod.Version.AsObject] = js.native
  var fileToGenerateList: js.Array[String] = js.native
  var parameter: js.UndefOr[String] = js.native
  var protoFileList: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    fileToGenerateList: js.Array[String],
    protoFileList: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(fileToGenerateList = fileToGenerateList.asInstanceOf[js.Any], protoFileList = protoFileList.asInstanceOf[js.Any])
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
    def setFileToGenerateListVarargs(value: String*): Self = this.set("fileToGenerateList", js.Array(value :_*))
    @scala.inline
    def setFileToGenerateList(value: js.Array[String]): Self = this.set("fileToGenerateList", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtoFileListVarargs(value: typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject*): Self = this.set("protoFileList", js.Array(value :_*))
    @scala.inline
    def setProtoFileList(value: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject]): Self = this.set("protoFileList", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompilerVersion(value: typings.googleProtobuf.pluginPbMod.Version.AsObject): Self = this.set("compilerVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompilerVersion: Self = this.set("compilerVersion", js.undefined)
    @scala.inline
    def setParameter(value: String): Self = this.set("parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
  }
  
}

