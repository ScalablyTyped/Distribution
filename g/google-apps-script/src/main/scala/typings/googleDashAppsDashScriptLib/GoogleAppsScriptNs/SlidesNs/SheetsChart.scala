package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsChart extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): SheetsChart = js.native
  def asImage(): Image = js.native
  def bringForward(): SheetsChart = js.native
  def bringToFront(): SheetsChart = js.native
  def duplicate(): PageElement = js.native
  def getChartId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): java.lang.String = js.native
  def getEmbedType(): SheetsChartEmbedType = js.native
  def getHeight(): scala.Double = js.native
  def getInherentHeight(): scala.Double = js.native
  def getInherentWidth(): scala.Double = js.native
  def getLeft(): scala.Double = js.native
  def getLink(): Link = js.native
  def getObjectId(): java.lang.String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): scala.Double = js.native
  def getSpreadsheetId(): java.lang.String = js.native
  def getTitle(): java.lang.String = js.native
  def getTop(): scala.Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): scala.Double = js.native
  def preconcatenateTransform(transform: AffineTransform): SheetsChart = js.native
  def refresh(): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def removeLink(): scala.Unit = js.native
  def scaleHeight(ratio: scala.Double): SheetsChart = js.native
  def scaleWidth(ratio: scala.Double): SheetsChart = js.native
  def select(): scala.Unit = js.native
  def select(replace: scala.Boolean): scala.Unit = js.native
  def sendBackward(): SheetsChart = js.native
  def sendToBack(): SheetsChart = js.native
  def setDescription(description: java.lang.String): SheetsChart = js.native
  def setHeight(height: scala.Double): SheetsChart = js.native
  def setLeft(left: scala.Double): SheetsChart = js.native
  def setLinkSlide(slideIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkUrl(url: java.lang.String): Link = js.native
  def setRotation(angle: scala.Double): SheetsChart = js.native
  def setTitle(title: java.lang.String): SheetsChart = js.native
  def setTop(top: scala.Double): SheetsChart = js.native
  def setTransform(transform: AffineTransform): SheetsChart = js.native
  def setWidth(width: scala.Double): SheetsChart = js.native
}

