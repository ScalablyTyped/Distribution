package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto")
@js.native
class MethodDescriptorProto_ () extends Message {
  def clearClientStreaming(): Unit = js.native
  def clearInputType(): Unit = js.native
  def clearName(): Unit = js.native
  def clearOptions(): Unit = js.native
  def clearOutputType(): Unit = js.native
  def clearServerStreaming(): Unit = js.native
  def getClientStreaming(): js.UndefOr[Boolean] = js.native
  def getInputType(): js.UndefOr[String] = js.native
  def getName(): js.UndefOr[String] = js.native
  def getOptions(): js.UndefOr[MethodOptions] = js.native
  def getOutputType(): js.UndefOr[String] = js.native
  def getServerStreaming(): js.UndefOr[Boolean] = js.native
  def hasClientStreaming(): Boolean = js.native
  def hasInputType(): Boolean = js.native
  def hasName(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def hasOutputType(): Boolean = js.native
  def hasServerStreaming(): Boolean = js.native
  def setClientStreaming(value: Boolean): Unit = js.native
  def setInputType(value: String): Unit = js.native
  def setName(value: String): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: MethodOptions): Unit = js.native
  def setOutputType(value: String): Unit = js.native
  def setServerStreaming(value: Boolean): Unit = js.native
}

