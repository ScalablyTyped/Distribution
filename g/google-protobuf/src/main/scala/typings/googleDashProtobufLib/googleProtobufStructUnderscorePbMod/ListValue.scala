package typings
package googleDashProtobufLib.googleProtobufStructUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue")
@js.native
class ListValue ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addValues(): Value = js.native
  def addValues(value: Value): Value = js.native
  def addValues(value: Value, index: scala.Double): Value = js.native
  def clearValuesList(): scala.Unit = js.native
  def getValuesList(): js.Array[Value] = js.native
  def setValuesList(value: js.Array[Value]): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue")
@js.native
object ListValue extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ListValue = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ListValue,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ListValue = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ListValue,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ListValue
  ): googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ListValueNs.AsObject = js.native
}

