package typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.MixinNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/api_pb", "Mixin")
@js.native
class Mixin () extends Message {
  def getName(): String = js.native
  def getRoot(): String = js.native
  def setName(value: String): Unit = js.native
  def setRoot(value: String): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/api_pb", "Mixin")
@js.native
object Mixin extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): Mixin = js.native
  def deserializeBinaryFromReader(message: Mixin, reader: BinaryReader): Mixin = js.native
  def serializeBinaryToWriter(message: Mixin, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Mixin): AsObject = js.native
}

