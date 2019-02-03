package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions")
@js.native
class FileOptions ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addUninterpretedOption(): scala.Unit = js.native
  def addUninterpretedOption(value: UninterpretedOption): scala.Unit = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: scala.Double): scala.Unit = js.native
  def clearCcEnableArenas(): scala.Unit = js.native
  def clearCcGenericServices(): scala.Unit = js.native
  def clearCsharpNamespace(): scala.Unit = js.native
  def clearDeprecated(): scala.Unit = js.native
  def clearGoPackage(): scala.Unit = js.native
  def clearJavaGenerateEqualsAndHash(): scala.Unit = js.native
  def clearJavaGenericServices(): scala.Unit = js.native
  def clearJavaMultipleFiles(): scala.Unit = js.native
  def clearJavaOuterClassname(): scala.Unit = js.native
  def clearJavaPackage(): scala.Unit = js.native
  def clearJavaStringCheckUtf8(): scala.Unit = js.native
  def clearObjcClassPrefix(): scala.Unit = js.native
  def clearOptimizeFor(): scala.Unit = js.native
  def clearPyGenericServices(): scala.Unit = js.native
  def clearSwiftPrefix(): scala.Unit = js.native
  def clearUninterpretedOptionList(): scala.Unit = js.native
  def getCcEnableArenas(): scala.Boolean = js.native
  def getCcGenericServices(): scala.Boolean = js.native
  def getCsharpNamespace(): java.lang.String = js.native
  def getDeprecated(): scala.Boolean = js.native
  def getGoPackage(): java.lang.String = js.native
  def getJavaGenerateEqualsAndHash(): scala.Boolean = js.native
  def getJavaGenericServices(): scala.Boolean = js.native
  def getJavaMultipleFiles(): scala.Boolean = js.native
  def getJavaOuterClassname(): java.lang.String = js.native
  def getJavaPackage(): java.lang.String = js.native
  def getJavaStringCheckUtf8(): scala.Boolean = js.native
  def getObjcClassPrefix(): java.lang.String = js.native
  def getOptimizeFor(): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.OptimizeMode = js.native
  def getPyGenericServices(): scala.Boolean = js.native
  def getSwiftPrefix(): java.lang.String = js.native
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  def hasCcEnableArenas(): scala.Boolean = js.native
  def hasCcGenericServices(): scala.Boolean = js.native
  def hasCsharpNamespace(): scala.Boolean = js.native
  def hasDeprecated(): scala.Boolean = js.native
  def hasGoPackage(): scala.Boolean = js.native
  def hasJavaGenerateEqualsAndHash(): scala.Boolean = js.native
  def hasJavaGenericServices(): scala.Boolean = js.native
  def hasJavaMultipleFiles(): scala.Boolean = js.native
  def hasJavaOuterClassname(): scala.Boolean = js.native
  def hasJavaPackage(): scala.Boolean = js.native
  def hasJavaStringCheckUtf8(): scala.Boolean = js.native
  def hasObjcClassPrefix(): scala.Boolean = js.native
  def hasOptimizeFor(): scala.Boolean = js.native
  def hasPyGenericServices(): scala.Boolean = js.native
  def hasSwiftPrefix(): scala.Boolean = js.native
  def setCcEnableArenas(value: scala.Boolean): scala.Unit = js.native
  def setCcGenericServices(value: scala.Boolean): scala.Unit = js.native
  def setCsharpNamespace(value: java.lang.String): scala.Unit = js.native
  def setDeprecated(value: scala.Boolean): scala.Unit = js.native
  def setGoPackage(value: java.lang.String): scala.Unit = js.native
  def setJavaGenerateEqualsAndHash(value: scala.Boolean): scala.Unit = js.native
  def setJavaGenericServices(value: scala.Boolean): scala.Unit = js.native
  def setJavaMultipleFiles(value: scala.Boolean): scala.Unit = js.native
  def setJavaOuterClassname(value: java.lang.String): scala.Unit = js.native
  def setJavaPackage(value: java.lang.String): scala.Unit = js.native
  def setJavaStringCheckUtf8(value: scala.Boolean): scala.Unit = js.native
  def setObjcClassPrefix(value: java.lang.String): scala.Unit = js.native
  def setOptimizeFor(value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.OptimizeMode): scala.Unit = js.native
  def setPyGenericServices(value: scala.Boolean): scala.Unit = js.native
  def setSwiftPrefix(value: java.lang.String): scala.Unit = js.native
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions")
@js.native
object FileOptions extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptions = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptions,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptions = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptions,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptions
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.AsObject = js.native
}

