package typings
package googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "UInt32Value")
@js.native
class UInt32Value ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def getValue(): scala.Double = js.native
  def setValue(value: scala.Double): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "UInt32Value")
@js.native
object UInt32Value extends js.Object {
  var extensions: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.UInt32Value = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.UInt32Value,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.UInt32Value = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.UInt32Value,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.UInt32Value
  ): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.UInt32ValueNs.AsObject = js.native
}

