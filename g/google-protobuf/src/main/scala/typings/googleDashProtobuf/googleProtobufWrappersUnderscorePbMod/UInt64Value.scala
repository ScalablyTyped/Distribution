package typings.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod.UInt64ValueNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "UInt64Value")
@js.native
class UInt64Value () extends Message {
  def getValue(): Double = js.native
  def setValue(value: Double): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/wrappers_pb", "UInt64Value")
@js.native
object UInt64Value extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): UInt64Value = js.native
  def deserializeBinaryFromReader(message: UInt64Value, reader: BinaryReader): UInt64Value = js.native
  def serializeBinaryToWriter(message: UInt64Value, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: UInt64Value): AsObject = js.native
}

