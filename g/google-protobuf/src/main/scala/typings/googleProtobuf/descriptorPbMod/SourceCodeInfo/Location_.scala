package typings.googleProtobuf.descriptorPbMod.SourceCodeInfo

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.Location")
@js.native
class Location_ () extends Message {
  
  def addLeadingDetachedComments(value: String): String = js.native
  def addLeadingDetachedComments(value: String, index: Double): String = js.native
  
  def addPath(value: Double): Double = js.native
  def addPath(value: Double, index: Double): Double = js.native
  
  def addSpan(value: Double): Double = js.native
  def addSpan(value: Double, index: Double): Double = js.native
  
  def clearLeadingComments(): Location = js.native
  
  def clearLeadingDetachedCommentsList(): Location = js.native
  
  def clearPathList(): Location = js.native
  
  def clearSpanList(): Location = js.native
  
  def clearTrailingComments(): Location = js.native
  
  def getLeadingComments(): js.UndefOr[String] = js.native
  
  def getLeadingDetachedCommentsList(): js.Array[String] = js.native
  
  def getPathList(): js.Array[Double] = js.native
  
  def getSpanList(): js.Array[Double] = js.native
  
  def getTrailingComments(): js.UndefOr[String] = js.native
  
  def hasLeadingComments(): Boolean = js.native
  
  def hasTrailingComments(): Boolean = js.native
  
  def setLeadingComments(value: String): Location = js.native
  
  def setLeadingDetachedCommentsList(value: js.Array[String]): Location = js.native
  
  def setPathList(value: js.Array[Double]): Location = js.native
  
  def setSpanList(value: js.Array[Double]): Location = js.native
  
  def setTrailingComments(value: String): Location = js.native
}
