package typings.googleProtobuf.fieldMaskPbMod.FieldMask

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

@JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.googleProtobuf.fieldMaskPbMod.FieldMask = js.native
  def deserializeBinaryFromReader(message: typings.googleProtobuf.fieldMaskPbMod.FieldMask, reader: BinaryReader): typings.googleProtobuf.fieldMaskPbMod.FieldMask = js.native
  def serializeBinaryToWriter(message: typings.googleProtobuf.fieldMaskPbMod.FieldMask, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typings.googleProtobuf.fieldMaskPbMod.FieldMask): AsObject = js.native
}

