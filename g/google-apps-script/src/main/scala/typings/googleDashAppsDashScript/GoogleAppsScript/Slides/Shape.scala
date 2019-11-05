package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.BlobSource
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.EmbeddedChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement representing a generic shape that does not have a more specific
  * classification. Includes text boxes, rectangles, and other predefined shapes.
  */
@js.native
trait Shape extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Shape = js.native
  def bringForward(): Shape = js.native
  def bringToFront(): Shape = js.native
  def duplicate(): PageElement = js.native
  def getBorder(): Border = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getContentAlignment(): ContentAlignment = js.native
  def getDescription(): String = js.native
  def getFill(): Fill = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getLink(): Link = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getParentPlaceholder(): PageElement = js.native
  def getPlaceholderIndex(): Integer = js.native
  def getPlaceholderType(): PlaceholderType = js.native
  def getRotation(): Double = js.native
  def getShapeType(): ShapeType = js.native
  def getText(): TextRange = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): Double = js.native
  def preconcatenateTransform(transform: AffineTransform): Shape = js.native
  def remove(): Unit = js.native
  def removeLink(): Unit = js.native
  def replaceWithImage(blobSource: BlobSource): Image = js.native
  def replaceWithImage(blobSource: BlobSource, crop: Boolean): Image = js.native
  def replaceWithImage(imageUrl: String): Image = js.native
  def replaceWithImage(imageUrl: String, crop: Boolean): Image = js.native
  def replaceWithSheetsChart(sourceChart: EmbeddedChart): SheetsChart = js.native
  def replaceWithSheetsChartAsImage(sourceChart: EmbeddedChart): Image = js.native
  def scaleHeight(ratio: Double): Shape = js.native
  def scaleWidth(ratio: Double): Shape = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): Shape = js.native
  def sendToBack(): Shape = js.native
  def setContentAlignment(contentAlignment: ContentAlignment): Shape = js.native
  def setDescription(description: String): Shape = js.native
  def setHeight(height: Double): Shape = js.native
  def setLeft(left: Double): Shape = js.native
  def setLinkSlide(slideIndex: Integer): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkUrl(url: String): Link = js.native
  def setRotation(angle: Double): Shape = js.native
  def setTitle(title: String): Shape = js.native
  def setTop(top: Double): Shape = js.native
  def setTransform(transform: AffineTransform): Shape = js.native
  def setWidth(width: Double): Shape = js.native
}

