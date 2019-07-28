package typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var compilerVersion: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.VersionNs.AsObject
  ] = js.undefined
  var fileToGenerateList: js.Array[String]
  var parameter: js.UndefOr[String] = js.undefined
  var protoFileList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    fileToGenerateList: js.Array[String],
    protoFileList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs.AsObject
    ],
    compilerVersion: typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.VersionNs.AsObject = null,
    parameter: String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(fileToGenerateList = fileToGenerateList, protoFileList = protoFileList)
    if (compilerVersion != null) __obj.updateDynamic("compilerVersion")(compilerVersion)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    __obj.asInstanceOf[AsObject]
  }
}

