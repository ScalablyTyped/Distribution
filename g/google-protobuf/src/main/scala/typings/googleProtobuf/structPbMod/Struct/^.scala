package typings.googleProtobuf.structPbMod.Struct

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.structPbMod.JavaScriptValue
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "Struct")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.googleProtobuf.structPbMod.Struct = js.native
  def deserializeBinaryFromReader(message: typings.googleProtobuf.structPbMod.Struct, reader: BinaryReader): typings.googleProtobuf.structPbMod.Struct = js.native
  def fromJavaScript(value: StringDictionary[JavaScriptValue]): typings.googleProtobuf.structPbMod.Struct = js.native
  def serializeBinaryToWriter(message: typings.googleProtobuf.structPbMod.Struct, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typings.googleProtobuf.structPbMod.Struct): AsObject = js.native
}

