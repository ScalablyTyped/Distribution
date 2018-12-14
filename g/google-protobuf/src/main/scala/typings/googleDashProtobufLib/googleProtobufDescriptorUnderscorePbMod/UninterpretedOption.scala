package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption")
@js.native
class UninterpretedOption ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addName(): scala.Unit = js.native
  def addName(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePart
  ): scala.Unit = js.native
  def addName(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePart,
    index: scala.Double
  ): scala.Unit = js.native
  def clearAggregateValue(): scala.Unit = js.native
  def clearDoubleValue(): scala.Unit = js.native
  def clearIdentifierValue(): scala.Unit = js.native
  def clearNameList(): scala.Unit = js.native
  def clearNegativeIntValue(): scala.Unit = js.native
  def clearPositiveIntValue(): scala.Unit = js.native
  def clearStringValue(): scala.Unit = js.native
  def getAggregateValue(): java.lang.String = js.native
  def getDoubleValue(): scala.Double = js.native
  def getIdentifierValue(): java.lang.String = js.native
  def getNameList(): js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePart
  ] = js.native
  def getNegativeIntValue(): scala.Double = js.native
  def getPositiveIntValue(): scala.Double = js.native
  def getStringValue(): stdLib.Uint8Array | java.lang.String = js.native
  def getStringValue_asB64(): java.lang.String = js.native
  def getStringValue_asU8(): stdLib.Uint8Array = js.native
  def hasAggregateValue(): scala.Boolean = js.native
  def hasDoubleValue(): scala.Boolean = js.native
  def hasIdentifierValue(): scala.Boolean = js.native
  def hasNegativeIntValue(): scala.Boolean = js.native
  def hasPositiveIntValue(): scala.Boolean = js.native
  def hasStringValue(): scala.Boolean = js.native
  def setAggregateValue(value: java.lang.String): scala.Unit = js.native
  def setDoubleValue(value: scala.Double): scala.Unit = js.native
  def setIdentifierValue(value: java.lang.String): scala.Unit = js.native
  def setNameList(
    value: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.NamePart
    ]
  ): scala.Unit = js.native
  def setNegativeIntValue(value: scala.Double): scala.Unit = js.native
  def setPositiveIntValue(value: scala.Double): scala.Unit = js.native
  def setStringValue(value: java.lang.String): scala.Unit = js.native
  def setStringValue(value: stdLib.Uint8Array): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption")
@js.native
object UninterpretedOption extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.AsObject = js.native
}

