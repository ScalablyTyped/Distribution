package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.EnumValueNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue")
@js.native
class EnumValue () extends Message {
  def addOptions(): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  def clearOptionsList(): Unit = js.native
  def getName(): String = js.native
  def getNumber(): Double = js.native
  def getOptionsList(): js.Array[Option] = js.native
  def setName(value: String): Unit = js.native
  def setNumber(value: Double): Unit = js.native
  def setOptionsList(value: js.Array[Option]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue")
@js.native
object EnumValue extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): EnumValue = js.native
  def deserializeBinaryFromReader(message: EnumValue, reader: BinaryReader): EnumValue = js.native
  def serializeBinaryToWriter(message: EnumValue, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: EnumValue): AsObject = js.native
}

