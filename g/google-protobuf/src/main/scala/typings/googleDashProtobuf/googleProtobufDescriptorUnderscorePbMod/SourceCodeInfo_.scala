package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo")
@js.native
class SourceCodeInfo_ () extends Message {
  def addLocation(): Location = js.native
  def addLocation(value: Location): Location = js.native
  def addLocation(value: Location, index: Double): Location = js.native
  def clearLocationList(): Unit = js.native
  def getLocationList(): js.Array[Location] = js.native
  def setLocationList(value: js.Array[Location]): Unit = js.native
}

