package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location
import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo")
@js.native
class SourceCodeInfo_ () extends Message {
  
  def addLocation(): Location = js.native
  def addLocation(value: js.UndefOr[scala.Nothing], index: Double): Location = js.native
  def addLocation(value: Location): Location = js.native
  def addLocation(value: Location, index: Double): Location = js.native
  
  def clearLocationList(): SourceCodeInfo = js.native
  
  def getLocationList(): js.Array[Location] = js.native
  
  def setLocationList(value: js.Array[Location]): SourceCodeInfo = js.native
}
