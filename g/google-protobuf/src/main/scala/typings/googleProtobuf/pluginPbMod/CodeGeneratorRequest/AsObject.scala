package typings.googleProtobuf.pluginPbMod.CodeGeneratorRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var compilerVersion: js.UndefOr[typings.googleProtobuf.pluginPbMod.Version.AsObject] = js.undefined
  var fileToGenerateList: js.Array[String]
  var parameter: js.UndefOr[String] = js.undefined
  var protoFileList: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    fileToGenerateList: js.Array[String],
    protoFileList: js.Array[typings.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject],
    compilerVersion: typings.googleProtobuf.pluginPbMod.Version.AsObject = null,
    parameter: String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(fileToGenerateList = fileToGenerateList.asInstanceOf[js.Any], protoFileList = protoFileList.asInstanceOf[js.Any])
    if (compilerVersion != null) __obj.updateDynamic("compilerVersion")(compilerVersion.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

