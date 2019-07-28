package typings.googleDashProtobuf.googleProtobufAnyUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufAnyUnderscorePbMod.AnyNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/any_pb", "Any")
@js.native
class Any () extends Message {
  def getTypeName(): String = js.native
  def getTypeUrl(): String = js.native
  def getValue(): Uint8Array | String = js.native
  def getValue_asB64(): String = js.native
  def getValue_asU8(): Uint8Array = js.native
  def pack(serialized: Uint8Array, name: String): Unit = js.native
  def pack(serialized: Uint8Array, name: String, typeUrlPrefix: String): Unit = js.native
  def setTypeUrl(value: String): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: Uint8Array): Unit = js.native
  def unpack[T /* <: Message */](deserialize: js.Function1[/* packed */ Uint8Array, T], name: String): T | Null = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/any_pb", "Any")
@js.native
object Any extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): Any = js.native
  def deserializeBinaryFromReader(message: Any, reader: BinaryReader): Any = js.native
  def serializeBinaryToWriter(message: Any, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Any): AsObject = js.native
}

