package typings
package googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "StringValue")
@js.native
class StringValue ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def getValue(): java.lang.String = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/wrappers_pb", "StringValue")
@js.native
object StringValue extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.StringValue = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.StringValue,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.StringValue = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.StringValue,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.StringValue
  ): googleDashProtobufLib.googleProtobufWrappersUnderscorePbMod.StringValueNs.AsObject = js.native
}

