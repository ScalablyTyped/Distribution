package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.AsObject
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Label
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto")
@js.native
class FieldDescriptorProto () extends Message {
  def clearDefaultValue(): Unit = js.native
  def clearExtendee(): Unit = js.native
  def clearJsonName(): Unit = js.native
  def clearLabel(): Unit = js.native
  def clearName(): Unit = js.native
  def clearNumber(): Unit = js.native
  def clearOneofIndex(): Unit = js.native
  def clearOptions(): Unit = js.native
  def clearType(): Unit = js.native
  def clearTypeName(): Unit = js.native
  def getDefaultValue(): js.UndefOr[String] = js.native
  def getExtendee(): js.UndefOr[String] = js.native
  def getJsonName(): js.UndefOr[String] = js.native
  def getLabel(): js.UndefOr[Label] = js.native
  def getName(): js.UndefOr[String] = js.native
  def getNumber(): js.UndefOr[Double] = js.native
  def getOneofIndex(): js.UndefOr[Double] = js.native
  def getOptions(): js.UndefOr[FieldOptions] = js.native
  def getType(): js.UndefOr[Type] = js.native
  def getTypeName(): js.UndefOr[String] = js.native
  def hasDefaultValue(): Boolean = js.native
  def hasExtendee(): Boolean = js.native
  def hasJsonName(): Boolean = js.native
  def hasLabel(): Boolean = js.native
  def hasName(): Boolean = js.native
  def hasNumber(): Boolean = js.native
  def hasOneofIndex(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def hasType(): Boolean = js.native
  def hasTypeName(): Boolean = js.native
  def setDefaultValue(value: String): Unit = js.native
  def setExtendee(value: String): Unit = js.native
  def setJsonName(value: String): Unit = js.native
  def setLabel(value: Label): Unit = js.native
  def setName(value: String): Unit = js.native
  def setNumber(value: Double): Unit = js.native
  def setOneofIndex(value: Double): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: FieldOptions): Unit = js.native
  def setType(value: Type): Unit = js.native
  def setTypeName(value: String): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto")
@js.native
object FieldDescriptorProto extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): FieldDescriptorProto = js.native
  def deserializeBinaryFromReader(message: FieldDescriptorProto, reader: BinaryReader): FieldDescriptorProto = js.native
  def serializeBinaryToWriter(message: FieldDescriptorProto, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: FieldDescriptorProto): AsObject = js.native
}

