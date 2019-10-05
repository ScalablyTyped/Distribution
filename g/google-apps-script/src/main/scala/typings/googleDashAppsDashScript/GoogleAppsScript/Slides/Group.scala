package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Group = js.native
  def bringForward(): Group = js.native
  def bringToFront(): Group = js.native
  def duplicate(): PageElement = js.native
  def getChildren(): js.Array[PageElement] = js.native
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
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): Double = js.native
  def preconcatenateTransform(transform: AffineTransform): Group = js.native
  def remove(): Unit = js.native
  def scaleHeight(ratio: Double): Group = js.native
  def scaleWidth(ratio: Double): Group = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): Group = js.native
  def sendToBack(): Group = js.native
  def setDescription(description: String): Group = js.native
  def setHeight(height: Double): Group = js.native
  def setLeft(left: Double): Group = js.native
  def setRotation(angle: Double): Group = js.native
  def setTitle(title: String): Group = js.native
  def setTop(top: Double): Group = js.native
  def setTransform(transform: AffineTransform): Group = js.native
  def setWidth(width: Double): Group = js.native
  def ungroup(): Unit = js.native
}

