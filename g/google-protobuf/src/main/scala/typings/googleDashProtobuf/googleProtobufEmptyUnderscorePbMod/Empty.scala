package typings.googleDashProtobuf.googleProtobufEmptyUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufEmptyUnderscorePbMod.EmptyNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/empty_pb", "Empty")
@js.native
class Empty () extends Message

/* static members */
@JSImport("google-protobuf/google/protobuf/empty_pb", "Empty")
@js.native
object Empty extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): Empty = js.native
  def deserializeBinaryFromReader(message: Empty, reader: BinaryReader): Empty = js.native
  def serializeBinaryToWriter(message: Empty, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Empty): AsObject = js.native
}

