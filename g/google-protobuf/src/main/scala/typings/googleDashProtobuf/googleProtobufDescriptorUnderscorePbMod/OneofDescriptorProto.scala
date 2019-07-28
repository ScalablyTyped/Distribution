package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.OneofDescriptorProtoNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "OneofDescriptorProto")
@js.native
class OneofDescriptorProto () extends Message {
  def clearName(): Unit = js.native
  def clearOptions(): Unit = js.native
  def getName(): js.UndefOr[String] = js.native
  def getOptions(): js.UndefOr[OneofOptions] = js.native
  def hasName(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def setName(value: String): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: OneofOptions): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "OneofDescriptorProto")
@js.native
object OneofDescriptorProto extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): OneofDescriptorProto = js.native
  def deserializeBinaryFromReader(message: OneofDescriptorProto, reader: BinaryReader): OneofDescriptorProto = js.native
  def serializeBinaryToWriter(message: OneofDescriptorProto, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: OneofDescriptorProto): AsObject = js.native
}

