package typings.googleDashProtobuf.googleProtobufFieldUnderscoreMaskUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufFieldUnderscoreMaskUnderscorePbMod.FieldMaskNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask")
@js.native
class FieldMask () extends Message {
  def addPaths(value: String): String = js.native
  def addPaths(value: String, index: Double): String = js.native
  def clearPathsList(): Unit = js.native
  def getPathsList(): js.Array[String] = js.native
  def setPathsList(value: js.Array[String]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask")
@js.native
object FieldMask extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): FieldMask = js.native
  def deserializeBinaryFromReader(message: FieldMask, reader: BinaryReader): FieldMask = js.native
  def serializeBinaryToWriter(message: FieldMask, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: FieldMask): AsObject = js.native
}

