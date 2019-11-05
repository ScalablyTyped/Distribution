package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement representing word art.
  */
@js.native
trait WordArt extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): WordArt = js.native
  def bringForward(): WordArt = js.native
  def bringToFront(): WordArt = js.native
  def duplicate(): PageElement = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): String = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getLink(): Link = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRenderedText(): String = js.native
  def getRotation(): Double = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): Double = js.native
  def preconcatenateTransform(transform: AffineTransform): WordArt = js.native
  def remove(): Unit = js.native
  def removeLink(): Unit = js.native
  def scaleHeight(ratio: Double): WordArt = js.native
  def scaleWidth(ratio: Double): WordArt = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): WordArt = js.native
  def sendToBack(): WordArt = js.native
  def setDescription(description: String): WordArt = js.native
  def setHeight(height: Double): WordArt = js.native
  def setLeft(left: Double): WordArt = js.native
  def setLinkSlide(slideIndex: Integer): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkUrl(url: String): Link = js.native
  def setRotation(angle: Double): WordArt = js.native
  def setTitle(title: String): WordArt = js.native
  def setTop(top: Double): WordArt = js.native
  def setTransform(transform: AffineTransform): WordArt = js.native
  def setWidth(width: Double): WordArt = js.native
}

