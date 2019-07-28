package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProtoNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "ServiceDescriptorProto")
@js.native
class ServiceDescriptorProto () extends Message {
  def addMethod(): MethodDescriptorProto = js.native
  def addMethod(value: MethodDescriptorProto): MethodDescriptorProto = js.native
  def addMethod(value: MethodDescriptorProto, index: Double): MethodDescriptorProto = js.native
  def clearMethodList(): Unit = js.native
  def clearName(): Unit = js.native
  def clearOptions(): Unit = js.native
  def getMethodList(): js.Array[MethodDescriptorProto] = js.native
  def getName(): js.UndefOr[String] = js.native
  def getOptions(): js.UndefOr[ServiceOptions] = js.native
  def hasName(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def setMethodList(value: js.Array[MethodDescriptorProto]): Unit = js.native
  def setName(value: String): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: ServiceOptions): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "ServiceDescriptorProto")
@js.native
object ServiceDescriptorProto extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): ServiceDescriptorProto = js.native
  def deserializeBinaryFromReader(message: ServiceDescriptorProto, reader: BinaryReader): ServiceDescriptorProto = js.native
  def serializeBinaryToWriter(message: ServiceDescriptorProto, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: ServiceDescriptorProto): AsObject = js.native
}

