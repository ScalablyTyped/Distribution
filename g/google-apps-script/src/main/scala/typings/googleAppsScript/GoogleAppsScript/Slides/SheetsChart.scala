package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PageElement representing a linked chart embedded from Google Sheets.
  */
@js.native
trait SheetsChart extends js.Object {
  
  def alignOnPage(alignmentPosition: AlignmentPosition): SheetsChart = js.native
  
  def asImage(): Image = js.native
  
  def bringForward(): SheetsChart = js.native
  
  def bringToFront(): SheetsChart = js.native
  
  def duplicate(): PageElement = js.native
  
  def getChartId(): Integer = js.native
  
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  
  def getDescription(): String = js.native
  
  def getEmbedType(): SheetsChartEmbedType = js.native
  
  def getHeight(): Double = js.native
  
  def getInherentHeight(): Double = js.native
  
  def getInherentWidth(): Double = js.native
  
  def getLeft(): Double = js.native
  
  def getLink(): Link = js.native
  
  def getObjectId(): String = js.native
  
  def getPageElementType(): PageElementType = js.native
  
  def getParentGroup(): Group = js.native
  
  def getParentPage(): Page = js.native
  
  def getRotation(): Double = js.native
  
  def getSpreadsheetId(): String = js.native
  
  def getTitle(): String = js.native
  
  def getTop(): Double = js.native
  
  def getTransform(): AffineTransform = js.native
  
  def getWidth(): Double = js.native
  
  def preconcatenateTransform(transform: AffineTransform): SheetsChart = js.native
  
  def refresh(): Unit = js.native
  
  def remove(): Unit = js.native
  
  def removeLink(): Unit = js.native
  
  def scaleHeight(ratio: Double): SheetsChart = js.native
  
  def scaleWidth(ratio: Double): SheetsChart = js.native
  
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  
  def sendBackward(): SheetsChart = js.native
  
  def sendToBack(): SheetsChart = js.native
  
  def setDescription(description: String): SheetsChart = js.native
  
  def setHeight(height: Double): SheetsChart = js.native
  
  def setLeft(left: Double): SheetsChart = js.native
  
  def setLinkSlide(slideIndex: Integer): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  
  def setLinkUrl(url: String): Link = js.native
  
  def setRotation(angle: Double): SheetsChart = js.native
  
  def setTitle(title: String): SheetsChart = js.native
  
  def setTop(top: Double): SheetsChart = js.native
  
  def setTransform(transform: AffineTransform): SheetsChart = js.native
  
  def setWidth(width: Double): SheetsChart = js.native
}
