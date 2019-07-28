package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProtoNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto")
@js.native
class MethodDescriptorProto () extends Message {
  def clearClientStreaming(): Unit = js.native
  def clearInputType(): Unit = js.native
  def clearName(): Unit = js.native
  def clearOptions(): Unit = js.native
  def clearOutputType(): Unit = js.native
  def clearServerStreaming(): Unit = js.native
  def getClientStreaming(): js.UndefOr[Boolean] = js.native
  def getInputType(): js.UndefOr[String] = js.native
  def getName(): js.UndefOr[String] = js.native
  def getOptions(): js.UndefOr[MethodOptions] = js.native
  def getOutputType(): js.UndefOr[String] = js.native
  def getServerStreaming(): js.UndefOr[Boolean] = js.native
  def hasClientStreaming(): Boolean = js.native
  def hasInputType(): Boolean = js.native
  def hasName(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def hasOutputType(): Boolean = js.native
  def hasServerStreaming(): Boolean = js.native
  def setClientStreaming(value: Boolean): Unit = js.native
  def setInputType(value: String): Unit = js.native
  def setName(value: String): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: MethodOptions): Unit = js.native
  def setOutputType(value: String): Unit = js.native
  def setServerStreaming(value: Boolean): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto")
@js.native
object MethodDescriptorProto extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): MethodDescriptorProto = js.native
  def deserializeBinaryFromReader(message: MethodDescriptorProto, reader: BinaryReader): MethodDescriptorProto = js.native
  def serializeBinaryToWriter(message: MethodDescriptorProto, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: MethodDescriptorProto): AsObject = js.native
}

