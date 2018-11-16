package typings
package googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "FloatValue")
@js.native
class FloatValue ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def getValue(): scala.Double = js.native
  def setValue(value: scala.Double): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "FloatValue")
@js.native
object FloatValue extends js.Object {
  var extensions: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.FloatValue = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.FloatValue,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.FloatValue = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.FloatValue,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.FloatValue
  ): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.FloatValueNs.AsObject = js.native
}

