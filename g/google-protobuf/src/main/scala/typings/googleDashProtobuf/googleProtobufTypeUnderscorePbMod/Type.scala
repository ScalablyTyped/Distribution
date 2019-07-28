package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext
import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.TypeNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Type")
@js.native
class Type () extends Message {
  def addFields(): Field = js.native
  def addFields(value: Field): Field = js.native
  def addFields(value: Field, index: Double): Field = js.native
  def addOneofs(value: String): String = js.native
  def addOneofs(value: String, index: Double): String = js.native
  def addOptions(): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  def clearFieldsList(): Unit = js.native
  def clearOneofsList(): Unit = js.native
  def clearOptionsList(): Unit = js.native
  def clearSourceContext(): Unit = js.native
  def getFieldsList(): js.Array[Field] = js.native
  def getName(): String = js.native
  def getOneofsList(): js.Array[String] = js.native
  def getOptionsList(): js.Array[Option] = js.native
  def getSourceContext(): js.UndefOr[SourceContext] = js.native
  def getSyntax(): Syntax = js.native
  def hasSourceContext(): Boolean = js.native
  def setFieldsList(value: js.Array[Field]): Unit = js.native
  def setName(value: String): Unit = js.native
  def setOneofsList(value: js.Array[String]): Unit = js.native
  def setOptionsList(value: js.Array[Option]): Unit = js.native
  def setSourceContext(): Unit = js.native
  def setSourceContext(value: SourceContext): Unit = js.native
  def setSyntax(value: Syntax): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/type_pb", "Type")
@js.native
object Type extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): Type = js.native
  def deserializeBinaryFromReader(message: Type, reader: BinaryReader): Type = js.native
  def serializeBinaryToWriter(message: Type, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Type): AsObject = js.native
}

