package typings
package googleDashProtobufLib.googleProtobufAnyUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/any_pb", "Any")
@js.native
class Any ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def getTypeName(): java.lang.String = js.native
  def getTypeUrl(): java.lang.String = js.native
  def getValue(): stdLib.Uint8Array | java.lang.String = js.native
  def getValue_asB64(): java.lang.String = js.native
  def getValue_asU8(): stdLib.Uint8Array = js.native
  def pack(serialized: stdLib.Uint8Array, name: java.lang.String): scala.Unit = js.native
  def pack(serialized: stdLib.Uint8Array, name: java.lang.String, typeUrlPrefix: java.lang.String): scala.Unit = js.native
  def setTypeUrl(value: java.lang.String): scala.Unit = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
  def setValue(value: stdLib.Uint8Array): scala.Unit = js.native
  def unpack[T /* <: googleDashProtobufLib.googleDashProtobufMod.Message */](deserialize: js.Function1[/* packed */ stdLib.Uint8Array, T], name: java.lang.String): T | scala.Null = js.native
}

@JSImport("google-protobuf/google/protobuf/any_pb", "Any")
@js.native
object Any extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufAnyUnderscorePbMod.Any = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufAnyUnderscorePbMod.Any,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufAnyUnderscorePbMod.Any = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufAnyUnderscorePbMod.Any,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(includeInstance: scala.Boolean, msg: googleDashProtobufLib.googleProtobufAnyUnderscorePbMod.Any): googleDashProtobufLib.googleProtobufAnyUnderscorePbMod.AnyNs.AsObject = js.native
}

