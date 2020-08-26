package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "ServiceDescriptorProto")
@js.native
class ServiceDescriptorProto_ () extends Message {
  def addMethod(): MethodDescriptorProto = js.native
  def addMethod(value: js.UndefOr[scala.Nothing], index: Double): MethodDescriptorProto = js.native
  def addMethod(value: MethodDescriptorProto): MethodDescriptorProto = js.native
  def addMethod(value: MethodDescriptorProto, index: Double): MethodDescriptorProto = js.native
  def clearMethodList(): Unit = js.native
  def clearName(): Unit = js.native
  def clearOptions(): Unit = js.native
  def getMethodList(): js.Array[MethodDescriptorProto] = js.native
  def getName(): js.UndefOr[String] = js.native
  def getOptions(): js.UndefOr[ServiceOptions] = js.native
  def hasName(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def setMethodList(value: js.Array[MethodDescriptorProto]): Unit = js.native
  def setName(value: String): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: ServiceOptions): Unit = js.native
}

