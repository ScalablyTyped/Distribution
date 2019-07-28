package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.AsObject
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
@js.native
class EnumDescriptorProto () extends Message {
  def addReservedName(value: String): String = js.native
  def addReservedName(value: String, index: Double): String = js.native
  def addReservedRange(): EnumReservedRange = js.native
  def addReservedRange(value: EnumReservedRange): EnumReservedRange = js.native
  def addReservedRange(value: EnumReservedRange, index: Double): EnumReservedRange = js.native
  def addValue(): EnumValueDescriptorProto = js.native
  def addValue(value: EnumValueDescriptorProto): EnumValueDescriptorProto = js.native
  def addValue(value: EnumValueDescriptorProto, index: Double): EnumValueDescriptorProto = js.native
  def clearName(): Unit = js.native
  def clearOptions(): Unit = js.native
  def clearReservedNameList(): Unit = js.native
  def clearReservedRangeList(): Unit = js.native
  def clearValueList(): Unit = js.native
  def getName(): js.UndefOr[String] = js.native
  def getOptions(): js.UndefOr[EnumOptions] = js.native
  def getReservedNameList(): js.Array[String] = js.native
  def getReservedRangeList(): js.Array[EnumReservedRange] = js.native
  def getValueList(): js.Array[EnumValueDescriptorProto] = js.native
  def hasName(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def setName(value: String): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: EnumOptions): Unit = js.native
  def setReservedNameList(value: js.Array[String]): Unit = js.native
  def setReservedRangeList(value: js.Array[EnumReservedRange]): Unit = js.native
  def setValueList(value: js.Array[EnumValueDescriptorProto]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
@js.native
object EnumDescriptorProto extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): EnumDescriptorProto = js.native
  def deserializeBinaryFromReader(message: EnumDescriptorProto, reader: BinaryReader): EnumDescriptorProto = js.native
  def serializeBinaryToWriter(message: EnumDescriptorProto, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: EnumDescriptorProto): AsObject = js.native
}

