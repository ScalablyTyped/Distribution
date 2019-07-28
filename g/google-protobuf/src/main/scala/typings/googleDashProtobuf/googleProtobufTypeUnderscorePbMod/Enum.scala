package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext
import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.EnumNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Enum")
@js.native
class Enum () extends Message {
  def addEnumvalue(): EnumValue = js.native
  def addEnumvalue(value: EnumValue): EnumValue = js.native
  def addEnumvalue(value: EnumValue, index: Double): EnumValue = js.native
  def addOptions(): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  def clearEnumvalueList(): Unit = js.native
  def clearOptionsList(): Unit = js.native
  def clearSourceContext(): Unit = js.native
  def getEnumvalueList(): js.Array[EnumValue] = js.native
  def getName(): String = js.native
  def getOptionsList(): js.Array[Option] = js.native
  def getSourceContext(): js.UndefOr[SourceContext] = js.native
  def getSyntax(): Syntax = js.native
  def hasSourceContext(): Boolean = js.native
  def setEnumvalueList(value: js.Array[EnumValue]): Unit = js.native
  def setName(value: String): Unit = js.native
  def setOptionsList(value: js.Array[Option]): Unit = js.native
  def setSourceContext(): Unit = js.native
  def setSourceContext(value: SourceContext): Unit = js.native
  def setSyntax(value: Syntax): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/type_pb", "Enum")
@js.native
object Enum extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): Enum = js.native
  def deserializeBinaryFromReader(message: Enum, reader: BinaryReader): Enum = js.native
  def serializeBinaryToWriter(message: Enum, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Enum): AsObject = js.native
}

