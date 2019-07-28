package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.AsObject
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePart
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption")
@js.native
class UninterpretedOption () extends Message {
  def addName(): NamePart = js.native
  def addName(value: NamePart): NamePart = js.native
  def addName(value: NamePart, index: Double): NamePart = js.native
  def clearAggregateValue(): Unit = js.native
  def clearDoubleValue(): Unit = js.native
  def clearIdentifierValue(): Unit = js.native
  def clearNameList(): Unit = js.native
  def clearNegativeIntValue(): Unit = js.native
  def clearPositiveIntValue(): Unit = js.native
  def clearStringValue(): Unit = js.native
  def getAggregateValue(): js.UndefOr[String] = js.native
  def getDoubleValue(): js.UndefOr[Double] = js.native
  def getIdentifierValue(): js.UndefOr[String] = js.native
  def getNameList(): js.Array[NamePart] = js.native
  def getNegativeIntValue(): js.UndefOr[Double] = js.native
  def getPositiveIntValue(): js.UndefOr[Double] = js.native
  def getStringValue(): Uint8Array | String = js.native
  def getStringValue_asB64(): String = js.native
  def getStringValue_asU8(): Uint8Array = js.native
  def hasAggregateValue(): Boolean = js.native
  def hasDoubleValue(): Boolean = js.native
  def hasIdentifierValue(): Boolean = js.native
  def hasNegativeIntValue(): Boolean = js.native
  def hasPositiveIntValue(): Boolean = js.native
  def hasStringValue(): Boolean = js.native
  def setAggregateValue(value: String): Unit = js.native
  def setDoubleValue(value: Double): Unit = js.native
  def setIdentifierValue(value: String): Unit = js.native
  def setNameList(value: js.Array[NamePart]): Unit = js.native
  def setNegativeIntValue(value: Double): Unit = js.native
  def setPositiveIntValue(value: Double): Unit = js.native
  def setStringValue(value: String): Unit = js.native
  def setStringValue(value: Uint8Array): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption")
@js.native
object UninterpretedOption extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): UninterpretedOption = js.native
  def deserializeBinaryFromReader(message: UninterpretedOption, reader: BinaryReader): UninterpretedOption = js.native
  def serializeBinaryToWriter(message: UninterpretedOption, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: UninterpretedOption): AsObject = js.native
}

