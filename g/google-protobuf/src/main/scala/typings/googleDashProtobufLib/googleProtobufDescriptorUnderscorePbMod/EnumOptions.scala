package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions")
@js.native
class EnumOptions ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addUninterpretedOption(): scala.Unit = js.native
  def addUninterpretedOption(value: UninterpretedOption): scala.Unit = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: scala.Double): scala.Unit = js.native
  def clearAllowAlias(): scala.Unit = js.native
  def clearDeprecated(): scala.Unit = js.native
  def clearUninterpretedOptionList(): scala.Unit = js.native
  def getAllowAlias(): scala.Boolean = js.native
  def getDeprecated(): scala.Boolean = js.native
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  def hasAllowAlias(): scala.Boolean = js.native
  def hasDeprecated(): scala.Boolean = js.native
  def setAllowAlias(value: scala.Boolean): scala.Unit = js.native
  def setDeprecated(value: scala.Boolean): scala.Unit = js.native
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions")
@js.native
object EnumOptions extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumOptions = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumOptions,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumOptions = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumOptions,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumOptions
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumOptionsNs.AsObject = js.native
}

