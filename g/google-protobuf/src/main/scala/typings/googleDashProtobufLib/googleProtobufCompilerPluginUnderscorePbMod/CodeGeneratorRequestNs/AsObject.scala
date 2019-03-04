package typings
package googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var compilerVersion: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.VersionNs.AsObject
  var fileToGenerateList: js.Array[java.lang.String]
  var parameter: js.UndefOr[java.lang.String] = js.undefined
  var protoFileList: js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    compilerVersion: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.VersionNs.AsObject,
    fileToGenerateList: js.Array[java.lang.String],
    protoFileList: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs.AsObject
    ],
    parameter: java.lang.String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(compilerVersion = compilerVersion, fileToGenerateList = fileToGenerateList, protoFileList = protoFileList)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    __obj.asInstanceOf[AsObject]
  }
}

