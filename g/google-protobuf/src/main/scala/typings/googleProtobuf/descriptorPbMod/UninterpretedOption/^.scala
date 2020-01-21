package typings.googleProtobuf.descriptorPbMod.UninterpretedOption

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.googleProtobuf.descriptorPbMod.UninterpretedOption = js.native
  def deserializeBinaryFromReader(message: typings.googleProtobuf.descriptorPbMod.UninterpretedOption, reader: BinaryReader): typings.googleProtobuf.descriptorPbMod.UninterpretedOption = js.native
  def serializeBinaryToWriter(message: typings.googleProtobuf.descriptorPbMod.UninterpretedOption, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typings.googleProtobuf.descriptorPbMod.UninterpretedOption): AsObject = js.native
}

