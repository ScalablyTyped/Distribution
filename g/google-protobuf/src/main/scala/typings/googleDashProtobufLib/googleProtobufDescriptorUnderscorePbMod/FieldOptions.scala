package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions")
@js.native
class FieldOptions ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: scala.Double): UninterpretedOption = js.native
  def clearCtype(): scala.Unit = js.native
  def clearDeprecated(): scala.Unit = js.native
  def clearJstype(): scala.Unit = js.native
  def clearLazy(): scala.Unit = js.native
  def clearPacked(): scala.Unit = js.native
  def clearUninterpretedOptionList(): scala.Unit = js.native
  def clearWeak(): scala.Unit = js.native
  def getCtype(): js.UndefOr[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.CType
  ] = js.native
  def getDeprecated(): js.UndefOr[scala.Boolean] = js.native
  def getJstype(): js.UndefOr[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.JSType
  ] = js.native
  def getLazy(): js.UndefOr[scala.Boolean] = js.native
  def getPacked(): js.UndefOr[scala.Boolean] = js.native
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  def getWeak(): js.UndefOr[scala.Boolean] = js.native
  def hasCtype(): scala.Boolean = js.native
  def hasDeprecated(): scala.Boolean = js.native
  def hasJstype(): scala.Boolean = js.native
  def hasLazy(): scala.Boolean = js.native
  def hasPacked(): scala.Boolean = js.native
  def hasWeak(): scala.Boolean = js.native
  def setCtype(value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.CType): scala.Unit = js.native
  def setDeprecated(value: scala.Boolean): scala.Unit = js.native
  def setJstype(value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.JSType): scala.Unit = js.native
  def setLazy(value: scala.Boolean): scala.Unit = js.native
  def setPacked(value: scala.Boolean): scala.Unit = js.native
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): scala.Unit = js.native
  def setWeak(value: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions")
@js.native
object FieldOptions extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptions = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptions,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptions = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptions,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptions
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.AsObject = js.native
}

