package typings.googleProtobuf.descriptorPbMod.DescriptorProto

import typings.googleProtobuf.descriptorPbMod.ExtensionRangeOptions
import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange")
@js.native
class ExtensionRange_ () extends Message {
  def clearEnd(): Unit = js.native
  def clearOptions(): Unit = js.native
  def clearStart(): Unit = js.native
  def getEnd(): js.UndefOr[Double] = js.native
  def getOptions(): js.UndefOr[ExtensionRangeOptions] = js.native
  def getStart(): js.UndefOr[Double] = js.native
  def hasEnd(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def hasStart(): Boolean = js.native
  def setEnd(value: Double): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: ExtensionRangeOptions): Unit = js.native
  def setStart(value: Double): Unit = js.native
}

