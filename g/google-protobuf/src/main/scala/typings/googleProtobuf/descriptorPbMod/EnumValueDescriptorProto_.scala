package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto")
@js.native
class EnumValueDescriptorProto_ () extends Message {
  def clearName(): Unit = js.native
  def clearNumber(): Unit = js.native
  def clearOptions(): Unit = js.native
  def getName(): js.UndefOr[String] = js.native
  def getNumber(): js.UndefOr[Double] = js.native
  def getOptions(): js.UndefOr[EnumValueOptions] = js.native
  def hasName(): Boolean = js.native
  def hasNumber(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def setName(value: String): Unit = js.native
  def setNumber(value: Double): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: EnumValueOptions): Unit = js.native
}

