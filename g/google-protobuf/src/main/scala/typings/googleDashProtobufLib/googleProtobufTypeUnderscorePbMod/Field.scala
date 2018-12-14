package typings
package googleDashProtobufLib.googleProtobufTypeUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Field")
@js.native
class Field ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addOptions(): scala.Unit = js.native
  def addOptions(value: Option): scala.Unit = js.native
  def addOptions(value: Option, index: scala.Double): scala.Unit = js.native
  def clearOptionsList(): scala.Unit = js.native
  def getCardinality(): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Cardinality = js.native
  def getDefaultValue(): java.lang.String = js.native
  def getJsonName(): java.lang.String = js.native
  def getKind(): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind = js.native
  def getName(): java.lang.String = js.native
  def getNumber(): scala.Double = js.native
  def getOneofIndex(): scala.Double = js.native
  def getOptionsList(): js.Array[Option] = js.native
  def getPacked(): scala.Boolean = js.native
  def getTypeUrl(): java.lang.String = js.native
  def setCardinality(value: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Cardinality): scala.Unit = js.native
  def setDefaultValue(value: java.lang.String): scala.Unit = js.native
  def setJsonName(value: java.lang.String): scala.Unit = js.native
  def setKind(value: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind): scala.Unit = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setNumber(value: scala.Double): scala.Unit = js.native
  def setOneofIndex(value: scala.Double): scala.Unit = js.native
  def setOptionsList(value: js.Array[Option]): scala.Unit = js.native
  def setPacked(value: scala.Boolean): scala.Unit = js.native
  def setTypeUrl(value: java.lang.String): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/type_pb", "Field")
@js.native
object Field extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Field = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Field,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Field = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Field,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(includeInstance: scala.Boolean, msg: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Field): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.AsObject = js.native
}

