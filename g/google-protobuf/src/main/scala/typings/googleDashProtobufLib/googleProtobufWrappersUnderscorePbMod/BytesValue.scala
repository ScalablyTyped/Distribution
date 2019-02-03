package typings
package googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue")
@js.native
class BytesValue ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def getValue(): stdLib.Uint8Array | java.lang.String = js.native
  def getValue_asB64(): java.lang.String = js.native
  def getValue_asU8(): stdLib.Uint8Array = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
  def setValue(value: stdLib.Uint8Array): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue")
@js.native
object BytesValue extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BytesValue = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BytesValue,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BytesValue = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BytesValue,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BytesValue
  ): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.BytesValueNs.AsObject = js.native
}

