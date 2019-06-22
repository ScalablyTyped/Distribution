package typings
package googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var compilerVersion: js.UndefOr[
    googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.VersionNs.AsObject
  ] = js.undefined
  var fileToGenerateList: js.Array[java.lang.String]
  var parameter: js.UndefOr[java.lang.String] = js.undefined
  var protoFileList: js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    fileToGenerateList: js.Array[java.lang.String],
    protoFileList: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs.AsObject
    ],
    compilerVersion: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.VersionNs.AsObject = null,
    parameter: java.lang.String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(fileToGenerateList = fileToGenerateList, protoFileList = protoFileList)
    if (compilerVersion != null) __obj.updateDynamic("compilerVersion")(compilerVersion)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    __obj.asInstanceOf[AsObject]
  }
}

