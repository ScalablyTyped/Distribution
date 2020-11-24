package typings.googleProtobuf.timestampPbMod.Timestamp

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: Uint8Array): typings.googleProtobuf.timestampPbMod.Timestamp = js.native
  
  def deserializeBinaryFromReader(message: typings.googleProtobuf.timestampPbMod.Timestamp, reader: BinaryReader): typings.googleProtobuf.timestampPbMod.Timestamp = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(message: typings.googleProtobuf.timestampPbMod.Timestamp, writer: BinaryWriter): Unit = js.native
  
  def toObject(includeInstance: Boolean, msg: typings.googleProtobuf.timestampPbMod.Timestamp): AsObject = js.native
}
