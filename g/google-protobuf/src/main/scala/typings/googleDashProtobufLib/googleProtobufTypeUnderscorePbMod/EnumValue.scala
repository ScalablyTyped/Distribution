package typings
package googleDashProtobufLib.googleProtobufTypeUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue")
@js.native
class EnumValue ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addOptions(): scala.Unit = js.native
  def addOptions(value: Option): scala.Unit = js.native
  def addOptions(value: Option, index: scala.Double): scala.Unit = js.native
  def clearOptionsList(): scala.Unit = js.native
  def getName(): java.lang.String = js.native
  def getNumber(): scala.Double = js.native
  def getOptionsList(): js.Array[Option] = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setNumber(value: scala.Double): scala.Unit = js.native
  def setOptionsList(value: js.Array[Option]): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue")
@js.native
object EnumValue extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.EnumValue = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.EnumValue,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.EnumValue = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.EnumValue,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.EnumValue
  ): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.EnumValueNs.AsObject = js.native
}

