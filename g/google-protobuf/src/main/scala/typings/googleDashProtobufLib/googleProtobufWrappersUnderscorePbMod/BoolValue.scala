package typings
package googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BoolValue")
@js.native
class BoolValue ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def getValue(): scala.Boolean = js.native
  def setValue(value: scala.Boolean): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BoolValue")
@js.native
object BoolValue extends js.Object {
  var extensions: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BoolValue = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BoolValue,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BoolValue = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BoolValue,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BoolValue
  ): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BoolValueNs.AsObject = js.native
}

