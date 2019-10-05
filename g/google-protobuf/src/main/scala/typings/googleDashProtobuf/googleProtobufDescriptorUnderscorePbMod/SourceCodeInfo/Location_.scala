package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.Location")
@js.native
class Location_ () extends Message {
  def addLeadingDetachedComments(value: String): String = js.native
  def addLeadingDetachedComments(value: String, index: Double): String = js.native
  def addPath(value: Double): Double = js.native
  def addPath(value: Double, index: Double): Double = js.native
  def addSpan(value: Double): Double = js.native
  def addSpan(value: Double, index: Double): Double = js.native
  def clearLeadingComments(): Unit = js.native
  def clearLeadingDetachedCommentsList(): Unit = js.native
  def clearPathList(): Unit = js.native
  def clearSpanList(): Unit = js.native
  def clearTrailingComments(): Unit = js.native
  def getLeadingComments(): js.UndefOr[String] = js.native
  def getLeadingDetachedCommentsList(): js.Array[String] = js.native
  def getPathList(): js.Array[Double] = js.native
  def getSpanList(): js.Array[Double] = js.native
  def getTrailingComments(): js.UndefOr[String] = js.native
  def hasLeadingComments(): Boolean = js.native
  def hasTrailingComments(): Boolean = js.native
  def setLeadingComments(value: String): Unit = js.native
  def setLeadingDetachedCommentsList(value: js.Array[String]): Unit = js.native
  def setPathList(value: js.Array[Double]): Unit = js.native
  def setSpanList(value: js.Array[Double]): Unit = js.native
  def setTrailingComments(value: String): Unit = js.native
}

