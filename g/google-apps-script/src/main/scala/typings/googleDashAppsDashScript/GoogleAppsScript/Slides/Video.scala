package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Video extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Video = js.native
  def bringForward(): Video = js.native
  def bringToFront(): Video = js.native
  def duplicate(): PageElement = js.native
  def getBorder(): Border = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): String = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): Double = js.native
  def getSource(): VideoSourceType = js.native
  def getThumbnailUrl(): String = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getUrl(): String = js.native
  def getVideoId(): String = js.native
  def getWidth(): Double = js.native
  def preconcatenateTransform(transform: AffineTransform): Video = js.native
  def remove(): Unit = js.native
  def scaleHeight(ratio: Double): Video = js.native
  def scaleWidth(ratio: Double): Video = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): Video = js.native
  def sendToBack(): Video = js.native
  def setDescription(description: String): Video = js.native
  def setHeight(height: Double): Video = js.native
  def setLeft(left: Double): Video = js.native
  def setRotation(angle: Double): Video = js.native
  def setTitle(title: String): Video = js.native
  def setTop(top: Double): Video = js.native
  def setTransform(transform: AffineTransform): Video = js.native
  def setWidth(width: Double): Video = js.native
}

