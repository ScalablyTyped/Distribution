package typings.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod.BytesValueNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue")
@js.native
class BytesValue () extends Message {
  def getValue(): Uint8Array | String = js.native
  def getValue_asB64(): String = js.native
  def getValue_asU8(): Uint8Array = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: Uint8Array): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue")
@js.native
object BytesValue extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): BytesValue = js.native
  def deserializeBinaryFromReader(message: BytesValue, reader: BinaryReader): BytesValue = js.native
  def serializeBinaryToWriter(message: BytesValue, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: BytesValue): AsObject = js.native
}

