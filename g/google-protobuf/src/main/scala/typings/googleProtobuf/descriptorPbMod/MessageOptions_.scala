package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions")
@js.native
class MessageOptions_ () extends Message {
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: js.UndefOr[scala.Nothing], index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  def clearDeprecated(): Unit = js.native
  def clearMapEntry(): Unit = js.native
  def clearMessageSetWireFormat(): Unit = js.native
  def clearNoStandardDescriptorAccessor(): Unit = js.native
  def clearUninterpretedOptionList(): Unit = js.native
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  def getMapEntry(): js.UndefOr[Boolean] = js.native
  def getMessageSetWireFormat(): js.UndefOr[Boolean] = js.native
  def getNoStandardDescriptorAccessor(): js.UndefOr[Boolean] = js.native
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  def hasDeprecated(): Boolean = js.native
  def hasMapEntry(): Boolean = js.native
  def hasMessageSetWireFormat(): Boolean = js.native
  def hasNoStandardDescriptorAccessor(): Boolean = js.native
  def setDeprecated(value: Boolean): Unit = js.native
  def setMapEntry(value: Boolean): Unit = js.native
  def setMessageSetWireFormat(value: Boolean): Unit = js.native
  def setNoStandardDescriptorAccessor(value: Boolean): Unit = js.native
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): Unit = js.native
}

