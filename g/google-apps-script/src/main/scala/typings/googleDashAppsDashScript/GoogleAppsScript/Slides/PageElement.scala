package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A visual element rendered on a page.
  */
@js.native
trait PageElement extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): PageElement = js.native
  def asGroup(): Group = js.native
  def asImage(): Image = js.native
  def asLine(): Line = js.native
  def asShape(): Shape = js.native
  def asSheetsChart(): SheetsChart = js.native
  def asTable(): Table = js.native
  def asVideo(): Video = js.native
  def asWordArt(): WordArt = js.native
  def bringForward(): PageElement = js.native
  def bringToFront(): PageElement = js.native
  def duplicate(): PageElement = js.native
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
  def preconcatenateTransform(transform: AffineTransform): PageElement = js.native
  def remove(): Unit = js.native
  def scaleHeight(ratio: Double): PageElement = js.native
  def scaleWidth(ratio: Double): PageElement = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): PageElement = js.native
  def sendToBack(): PageElement = js.native
  def setDescription(description: String): PageElement = js.native
  def setHeight(height: Double): PageElement = js.native
  def setLeft(left: Double): PageElement = js.native
  def setRotation(angle: Double): PageElement = js.native
  def setTitle(title: String): PageElement = js.native
  def setTop(top: Double): PageElement = js.native
  def setTransform(transform: AffineTransform): PageElement = js.native
  def setWidth(width: Double): PageElement = js.native
}

