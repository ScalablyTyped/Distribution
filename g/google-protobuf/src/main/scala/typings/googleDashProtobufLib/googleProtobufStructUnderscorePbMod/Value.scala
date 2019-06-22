package typings
package googleDashProtobufLib.googleProtobufStructUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "Value")
@js.native
class Value ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def clearBoolValue(): scala.Unit = js.native
  def clearListValue(): scala.Unit = js.native
  def clearNullValue(): scala.Unit = js.native
  def clearNumberValue(): scala.Unit = js.native
  def clearStringValue(): scala.Unit = js.native
  def clearStructValue(): scala.Unit = js.native
  def getBoolValue(): scala.Boolean = js.native
  def getKindCase(): googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ValueNs.KindCase = js.native
  def getListValue(): js.UndefOr[ListValue] = js.native
  def getNullValue(): NullValue = js.native
  def getNumberValue(): scala.Double = js.native
  def getStringValue(): java.lang.String = js.native
  def getStructValue(): js.UndefOr[Struct] = js.native
  def hasBoolValue(): scala.Boolean = js.native
  def hasListValue(): scala.Boolean = js.native
  def hasNullValue(): scala.Boolean = js.native
  def hasNumberValue(): scala.Boolean = js.native
  def hasStringValue(): scala.Boolean = js.native
  def hasStructValue(): scala.Boolean = js.native
  def setBoolValue(value: scala.Boolean): scala.Unit = js.native
  def setListValue(): scala.Unit = js.native
  def setListValue(value: ListValue): scala.Unit = js.native
  def setNullValue(value: NullValue): scala.Unit = js.native
  def setNumberValue(value: scala.Double): scala.Unit = js.native
  def setStringValue(value: java.lang.String): scala.Unit = js.native
  def setStructValue(): scala.Unit = js.native
  def setStructValue(value: Struct): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/struct_pb", "Value")
@js.native
object Value extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufStructUnderscorePbMod.Value = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufStructUnderscorePbMod.Value,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufStructUnderscorePbMod.Value = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufStructUnderscorePbMod.Value,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufStructUnderscorePbMod.Value
  ): googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ValueNs.AsObject = js.native
}

