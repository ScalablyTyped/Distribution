package typings.googleProtobuf.fieldMaskPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/field_mask_pb", "FieldMask")
@js.native
class FieldMask_ () extends Message {
  
  def addPaths(value: String): String = js.native
  def addPaths(value: String, index: Double): String = js.native
  
  def clearPathsList(): FieldMask = js.native
  
  def getPathsList(): js.Array[String] = js.native
  
  def setPathsList(value: js.Array[String]): FieldMask = js.native
}
