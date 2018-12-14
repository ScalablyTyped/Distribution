package typings
package googleDashProtobufLib.googleProtobufTypeUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Type")
@js.native
class Type ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addFields(): scala.Unit = js.native
  def addFields(value: Field): scala.Unit = js.native
  def addFields(value: Field, index: scala.Double): scala.Unit = js.native
  def addOneofs(value: java.lang.String): scala.Unit = js.native
  def addOneofs(value: java.lang.String, index: scala.Double): scala.Unit = js.native
  def addOptions(): scala.Unit = js.native
  def addOptions(value: Option): scala.Unit = js.native
  def addOptions(value: Option, index: scala.Double): scala.Unit = js.native
  def clearFieldsList(): scala.Unit = js.native
  def clearOneofsList(): scala.Unit = js.native
  def clearOptionsList(): scala.Unit = js.native
  def clearSourceContext(): scala.Unit = js.native
  def getFieldsList(): js.Array[Field] = js.native
  def getName(): java.lang.String = js.native
  def getOneofsList(): js.Array[java.lang.String] = js.native
  def getOptionsList(): js.Array[Option] = js.native
  def getSourceContext(): js.UndefOr[
    googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext
  ] = js.native
  def getSyntax(): Syntax = js.native
  def hasSourceContext(): scala.Boolean = js.native
  def setFieldsList(value: js.Array[Field]): scala.Unit = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setOneofsList(value: js.Array[java.lang.String]): scala.Unit = js.native
  def setOptionsList(value: js.Array[Option]): scala.Unit = js.native
  def setSourceContext(): scala.Unit = js.native
  def setSourceContext(value: googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext): scala.Unit = js.native
  def setSyntax(value: Syntax): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/type_pb", "Type")
@js.native
object Type extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Type = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Type,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Type = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Type,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(includeInstance: scala.Boolean, msg: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Type): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.TypeNs.AsObject = js.native
}

