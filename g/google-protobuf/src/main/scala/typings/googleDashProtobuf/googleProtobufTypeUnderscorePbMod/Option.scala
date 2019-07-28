package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufAnyUnderscorePbMod.Any
import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Option")
@js.native
class Option () extends Message {
  def clearValue(): Unit = js.native
  def getName(): String = js.native
  def getValue(): js.UndefOr[Any] = js.native
  def hasValue(): Boolean = js.native
  def setName(value: String): Unit = js.native
  def setValue(): Unit = js.native
  def setValue(value: Any): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/type_pb", "Option")
@js.native
object Option extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): Option = js.native
  def deserializeBinaryFromReader(message: Option, reader: BinaryReader): Option = js.native
  def serializeBinaryToWriter(message: Option, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Option): AsObject = js.native
}

