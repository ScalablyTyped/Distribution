package typings.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod.Int64ValueNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "Int64Value")
@js.native
class Int64Value () extends Message {
  def getValue(): Double = js.native
  def setValue(value: Double): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/wrappers_pb", "Int64Value")
@js.native
object Int64Value extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): Int64Value = js.native
  def deserializeBinaryFromReader(message: Int64Value, reader: BinaryReader): Int64Value = js.native
  def serializeBinaryToWriter(message: Int64Value, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Int64Value): AsObject = js.native
}

