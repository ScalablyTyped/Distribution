package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProtoNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorProto")
@js.native
class FileDescriptorProto () extends Message {
  def addDependency(value: String): String = js.native
  def addDependency(value: String, index: Double): String = js.native
  def addEnumType(): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto, index: Double): EnumDescriptorProto = js.native
  def addExtension(): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto, index: Double): FieldDescriptorProto = js.native
  def addMessageType(): DescriptorProto = js.native
  def addMessageType(value: DescriptorProto): DescriptorProto = js.native
  def addMessageType(value: DescriptorProto, index: Double): DescriptorProto = js.native
  def addPublicDependency(value: Double): Double = js.native
  def addPublicDependency(value: Double, index: Double): Double = js.native
  def addService(): ServiceDescriptorProto = js.native
  def addService(value: ServiceDescriptorProto): ServiceDescriptorProto = js.native
  def addService(value: ServiceDescriptorProto, index: Double): ServiceDescriptorProto = js.native
  def addWeakDependency(value: Double): Double = js.native
  def addWeakDependency(value: Double, index: Double): Double = js.native
  def clearDependencyList(): Unit = js.native
  def clearEnumTypeList(): Unit = js.native
  def clearExtensionList(): Unit = js.native
  def clearMessageTypeList(): Unit = js.native
  def clearName(): Unit = js.native
  def clearOptions(): Unit = js.native
  def clearPackage(): Unit = js.native
  def clearPublicDependencyList(): Unit = js.native
  def clearServiceList(): Unit = js.native
  def clearSourceCodeInfo(): Unit = js.native
  def clearSyntax(): Unit = js.native
  def clearWeakDependencyList(): Unit = js.native
  def getDependencyList(): js.Array[String] = js.native
  def getEnumTypeList(): js.Array[EnumDescriptorProto] = js.native
  def getExtensionList(): js.Array[FieldDescriptorProto] = js.native
  def getMessageTypeList(): js.Array[DescriptorProto] = js.native
  def getName(): js.UndefOr[String] = js.native
  def getOptions(): js.UndefOr[FileOptions] = js.native
  def getPackage(): js.UndefOr[String] = js.native
  def getPublicDependencyList(): js.Array[Double] = js.native
  def getServiceList(): js.Array[ServiceDescriptorProto] = js.native
  def getSourceCodeInfo(): js.UndefOr[SourceCodeInfo] = js.native
  def getSyntax(): js.UndefOr[String] = js.native
  def getWeakDependencyList(): js.Array[Double] = js.native
  def hasName(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def hasPackage(): Boolean = js.native
  def hasSourceCodeInfo(): Boolean = js.native
  def hasSyntax(): Boolean = js.native
  def setDependencyList(value: js.Array[String]): Unit = js.native
  def setEnumTypeList(value: js.Array[EnumDescriptorProto]): Unit = js.native
  def setExtensionList(value: js.Array[FieldDescriptorProto]): Unit = js.native
  def setMessageTypeList(value: js.Array[DescriptorProto]): Unit = js.native
  def setName(value: String): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: FileOptions): Unit = js.native
  def setPackage(value: String): Unit = js.native
  def setPublicDependencyList(value: js.Array[Double]): Unit = js.native
  def setServiceList(value: js.Array[ServiceDescriptorProto]): Unit = js.native
  def setSourceCodeInfo(): Unit = js.native
  def setSourceCodeInfo(value: SourceCodeInfo): Unit = js.native
  def setSyntax(value: String): Unit = js.native
  def setWeakDependencyList(value: js.Array[Double]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorProto")
@js.native
object FileDescriptorProto extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): FileDescriptorProto = js.native
  def deserializeBinaryFromReader(message: FileDescriptorProto, reader: BinaryReader): FileDescriptorProto = js.native
  def serializeBinaryToWriter(message: FileDescriptorProto, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: FileDescriptorProto): AsObject = js.native
}

