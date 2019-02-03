package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorProto")
@js.native
class FileDescriptorProto ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addDependency(value: java.lang.String): scala.Unit = js.native
  def addDependency(value: java.lang.String, index: scala.Double): scala.Unit = js.native
  def addEnumType(): scala.Unit = js.native
  def addEnumType(value: EnumDescriptorProto): scala.Unit = js.native
  def addEnumType(value: EnumDescriptorProto, index: scala.Double): scala.Unit = js.native
  def addExtension(): scala.Unit = js.native
  def addExtension(value: FieldDescriptorProto): scala.Unit = js.native
  def addExtension(value: FieldDescriptorProto, index: scala.Double): scala.Unit = js.native
  def addMessageType(): scala.Unit = js.native
  def addMessageType(value: DescriptorProto): scala.Unit = js.native
  def addMessageType(value: DescriptorProto, index: scala.Double): scala.Unit = js.native
  def addPublicDependency(value: scala.Double): scala.Unit = js.native
  def addPublicDependency(value: scala.Double, index: scala.Double): scala.Unit = js.native
  def addService(): scala.Unit = js.native
  def addService(value: ServiceDescriptorProto): scala.Unit = js.native
  def addService(value: ServiceDescriptorProto, index: scala.Double): scala.Unit = js.native
  def addWeakDependency(value: scala.Double): scala.Unit = js.native
  def addWeakDependency(value: scala.Double, index: scala.Double): scala.Unit = js.native
  def clearDependencyList(): scala.Unit = js.native
  def clearEnumTypeList(): scala.Unit = js.native
  def clearExtensionList(): scala.Unit = js.native
  def clearMessageTypeList(): scala.Unit = js.native
  def clearName(): scala.Unit = js.native
  def clearOptions(): scala.Unit = js.native
  def clearPackage(): scala.Unit = js.native
  def clearPublicDependencyList(): scala.Unit = js.native
  def clearServiceList(): scala.Unit = js.native
  def clearSourceCodeInfo(): scala.Unit = js.native
  def clearSyntax(): scala.Unit = js.native
  def clearWeakDependencyList(): scala.Unit = js.native
  def getDependencyList(): js.Array[java.lang.String] = js.native
  def getEnumTypeList(): js.Array[EnumDescriptorProto] = js.native
  def getExtensionList(): js.Array[FieldDescriptorProto] = js.native
  def getMessageTypeList(): js.Array[DescriptorProto] = js.native
  def getName(): java.lang.String = js.native
  def getOptions(): FileOptions = js.native
  def getPackage(): java.lang.String = js.native
  def getPublicDependencyList(): js.Array[scala.Double] = js.native
  def getServiceList(): js.Array[ServiceDescriptorProto] = js.native
  def getSourceCodeInfo(): SourceCodeInfo = js.native
  def getSyntax(): java.lang.String = js.native
  def getWeakDependencyList(): js.Array[scala.Double] = js.native
  def hasName(): scala.Boolean = js.native
  def hasOptions(): scala.Boolean = js.native
  def hasPackage(): scala.Boolean = js.native
  def hasSourceCodeInfo(): scala.Boolean = js.native
  def hasSyntax(): scala.Boolean = js.native
  def setDependencyList(value: js.Array[java.lang.String]): scala.Unit = js.native
  def setEnumTypeList(value: js.Array[EnumDescriptorProto]): scala.Unit = js.native
  def setExtensionList(value: js.Array[FieldDescriptorProto]): scala.Unit = js.native
  def setMessageTypeList(value: js.Array[DescriptorProto]): scala.Unit = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setOptions(): scala.Unit = js.native
  def setOptions(value: FileOptions): scala.Unit = js.native
  def setPackage(value: java.lang.String): scala.Unit = js.native
  def setPublicDependencyList(value: js.Array[scala.Double]): scala.Unit = js.native
  def setServiceList(value: js.Array[ServiceDescriptorProto]): scala.Unit = js.native
  def setSourceCodeInfo(): scala.Unit = js.native
  def setSourceCodeInfo(value: SourceCodeInfo): scala.Unit = js.native
  def setSyntax(value: java.lang.String): scala.Unit = js.native
  def setWeakDependencyList(value: js.Array[scala.Double]): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorProto")
@js.native
object FileDescriptorProto extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs.AsObject = js.native
}

