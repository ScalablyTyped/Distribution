package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProtoNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto")
@js.native
class EnumValueDescriptorProto () extends Message {
  def clearName(): Unit = js.native
  def clearNumber(): Unit = js.native
  def clearOptions(): Unit = js.native
  def getName(): js.UndefOr[String] = js.native
  def getNumber(): js.UndefOr[Double] = js.native
  def getOptions(): js.UndefOr[EnumValueOptions] = js.native
  def hasName(): Boolean = js.native
  def hasNumber(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def setName(value: String): Unit = js.native
  def setNumber(value: Double): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: EnumValueOptions): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto")
@js.native
object EnumValueDescriptorProto extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): EnumValueDescriptorProto = js.native
  def deserializeBinaryFromReader(message: EnumValueDescriptorProto, reader: BinaryReader): EnumValueDescriptorProto = js.native
  def serializeBinaryToWriter(message: EnumValueDescriptorProto, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: EnumValueDescriptorProto): AsObject = js.native
}

