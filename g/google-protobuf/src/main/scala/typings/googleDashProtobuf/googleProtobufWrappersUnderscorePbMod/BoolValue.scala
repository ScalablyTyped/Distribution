package typings.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod.BoolValueNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BoolValue")
@js.native
class BoolValue () extends Message {
  def getValue(): Boolean = js.native
  def setValue(value: Boolean): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BoolValue")
@js.native
object BoolValue extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): BoolValue = js.native
  def deserializeBinaryFromReader(message: BoolValue, reader: BinaryReader): BoolValue = js.native
  def serializeBinaryToWriter(message: BoolValue, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: BoolValue): AsObject = js.native
}

