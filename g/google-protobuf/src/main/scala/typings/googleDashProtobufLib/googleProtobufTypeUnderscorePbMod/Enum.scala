package typings
package googleDashProtobufLib.googleProtobufTypeUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Enum")
@js.native
class Enum ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addEnumvalue(): EnumValue = js.native
  def addEnumvalue(value: EnumValue): EnumValue = js.native
  def addEnumvalue(value: EnumValue, index: scala.Double): EnumValue = js.native
  def addOptions(): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: scala.Double): Option = js.native
  def clearEnumvalueList(): scala.Unit = js.native
  def clearOptionsList(): scala.Unit = js.native
  def clearSourceContext(): scala.Unit = js.native
  def getEnumvalueList(): js.Array[EnumValue] = js.native
  def getName(): java.lang.String = js.native
  def getOptionsList(): js.Array[Option] = js.native
  def getSourceContext(): js.UndefOr[
    googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext
  ] = js.native
  def getSyntax(): Syntax = js.native
  def hasSourceContext(): scala.Boolean = js.native
  def setEnumvalueList(value: js.Array[EnumValue]): scala.Unit = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setOptionsList(value: js.Array[Option]): scala.Unit = js.native
  def setSourceContext(): scala.Unit = js.native
  def setSourceContext(value: googleDashProtobufLib.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext): scala.Unit = js.native
  def setSyntax(value: Syntax): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/type_pb", "Enum")
@js.native
object Enum extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Enum = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Enum,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Enum = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Enum,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(includeInstance: scala.Boolean, msg: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Enum): googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.EnumNs.AsObject = js.native
}

