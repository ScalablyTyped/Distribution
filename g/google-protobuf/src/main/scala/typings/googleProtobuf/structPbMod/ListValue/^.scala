package typings.googleProtobuf.structPbMod.ListValue

import org.scalablytyped.runtime.NumberDictionary
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

@JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.googleProtobuf.structPbMod.ListValue = js.native
  def deserializeBinaryFromReader(message: typings.googleProtobuf.structPbMod.ListValue, reader: BinaryReader): typings.googleProtobuf.structPbMod.ListValue = js.native
  def fromJavaScript(value: js.Array[JavaScriptValue]): typings.googleProtobuf.structPbMod.ListValue = js.native
  def serializeBinaryToWriter(message: typings.googleProtobuf.structPbMod.ListValue, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typings.googleProtobuf.structPbMod.ListValue): AsObject = js.native
}

