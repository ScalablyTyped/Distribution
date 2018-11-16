package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Shape = js.native
  def duplicate(): PageElement = js.native
  def getBorder(): Border = js.native
  def getContentAlignment(): ContentAlignment = js.native
  def getDescription(): java.lang.String = js.native
  def getFill(): Fill = js.native
  def getHeight(): stdLib.Number = js.native
  def getInherentHeight(): stdLib.Number = js.native
  def getInherentWidth(): stdLib.Number = js.native
  def getLeft(): stdLib.Number = js.native
  def getLink(): Link = js.native
  def getObjectId(): java.lang.String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getParentPlaceholder(): PageElement = js.native
  def getPlaceholderIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getPlaceholderType(): PlaceholderType = js.native
  def getRotation(): stdLib.Number = js.native
  def getShapeType(): ShapeType = js.native
  def getText(): TextRange = js.native
  def getTitle(): java.lang.String = js.native
  def getTop(): stdLib.Number = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): stdLib.Number = js.native
  def preconcatenateTransform(transform: AffineTransform): Shape = js.native
  def remove(): scala.Unit = js.native
  def removeLink(): scala.Unit = js.native
  def replaceWithImage(blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): Image = js.native
  def replaceWithImage(blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource, crop: scala.Boolean): Image = js.native
  def replaceWithImage(imageUrl: java.lang.String): Image = js.native
  def replaceWithImage(imageUrl: java.lang.String, crop: scala.Boolean): Image = js.native
  def replaceWithSheetsChart(sourceChart: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.EmbeddedChart): SheetsChart = js.native
  def replaceWithSheetsChartAsImage(sourceChart: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.EmbeddedChart): Image = js.native
  def scaleHeight(ratio: stdLib.Number): Shape = js.native
  def scaleWidth(ratio: stdLib.Number): Shape = js.native
  def select(): scala.Unit = js.native
  def select(replace: scala.Boolean): scala.Unit = js.native
  def setContentAlignment(contentAlignment: ContentAlignment): Shape = js.native
  def setHeight(height: stdLib.Number): Shape = js.native
  def setLeft(left: stdLib.Number): Shape = js.native
  def setLinkSlide(slideIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkUrl(url: java.lang.String): Link = js.native
  def setRotation(angle: stdLib.Number): Shape = js.native
  def setTop(top: stdLib.Number): Shape = js.native
  def setTransform(transform: AffineTransform): Shape = js.native
  def setWidth(width: stdLib.Number): Shape = js.native
}

