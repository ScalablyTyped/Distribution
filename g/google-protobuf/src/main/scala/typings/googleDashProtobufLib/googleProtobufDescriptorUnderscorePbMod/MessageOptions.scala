package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions")
@js.native
class MessageOptions ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addUninterpretedOption(): scala.Unit = js.native
  def addUninterpretedOption(value: UninterpretedOption): scala.Unit = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: scala.Double): scala.Unit = js.native
  def clearDeprecated(): scala.Unit = js.native
  def clearMapEntry(): scala.Unit = js.native
  def clearMessageSetWireFormat(): scala.Unit = js.native
  def clearNoStandardDescriptorAccessor(): scala.Unit = js.native
  def clearUninterpretedOptionList(): scala.Unit = js.native
  def getDeprecated(): scala.Boolean = js.native
  def getMapEntry(): scala.Boolean = js.native
  def getMessageSetWireFormat(): scala.Boolean = js.native
  def getNoStandardDescriptorAccessor(): scala.Boolean = js.native
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  def hasDeprecated(): scala.Boolean = js.native
  def hasMapEntry(): scala.Boolean = js.native
  def hasMessageSetWireFormat(): scala.Boolean = js.native
  def hasNoStandardDescriptorAccessor(): scala.Boolean = js.native
  def setDeprecated(value: scala.Boolean): scala.Unit = js.native
  def setMapEntry(value: scala.Boolean): scala.Unit = js.native
  def setMessageSetWireFormat(value: scala.Boolean): scala.Unit = js.native
  def setNoStandardDescriptorAccessor(value: scala.Boolean): scala.Unit = js.native
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions")
@js.native
object MessageOptions extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MessageOptions = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MessageOptions,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MessageOptions = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MessageOptions,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MessageOptions
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MessageOptionsNs.AsObject = js.native
}

