package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PageElement representing a line.
  */
@js.native
trait Line extends js.Object {
  
  def alignOnPage(alignmentPosition: AlignmentPosition): Line = js.native
  
  def bringForward(): Line = js.native
  
  def bringToFront(): Line = js.native
  
  def duplicate(): PageElement = js.native
  
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  
  def getDashStyle(): DashStyle = js.native
  
  def getDescription(): String = js.native
  
  def getEnd(): Point = js.native
  
  def getEndArrow(): ArrowStyle = js.native
  
  def getEndConnection(): ConnectionSite = js.native
  
  def getHeight(): Double = js.native
  
  def getInherentHeight(): Double = js.native
  
  def getInherentWidth(): Double = js.native
  
  def getLeft(): Double = js.native
  
  def getLineCategory(): LineCategory = js.native
  
  def getLineFill(): LineFill = js.native
  
  def getLineType(): LineType = js.native
  
  def getLink(): Link = js.native
  
  def getObjectId(): String = js.native
  
  def getPageElementType(): PageElementType = js.native
  
  def getParentGroup(): Group = js.native
  
  def getParentPage(): Page = js.native
  
  def getRotation(): Double = js.native
  
  def getStart(): Point = js.native
  
  def getStartArrow(): ArrowStyle = js.native
  
  def getStartConnection(): ConnectionSite = js.native
  
  def getTitle(): String = js.native
  
  def getTop(): Double = js.native
  
  def getTransform(): AffineTransform = js.native
  
  def getWeight(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def isConnector(): Boolean = js.native
  
  def preconcatenateTransform(transform: AffineTransform): Line = js.native
  
  def remove(): Unit = js.native
  
  def removeLink(): Unit = js.native
  
  def reroute(): Line = js.native
  
  def scaleHeight(ratio: Double): Line = js.native
  
  def scaleWidth(ratio: Double): Line = js.native
  
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  
  def sendBackward(): Line = js.native
  
  def sendToBack(): Line = js.native
  
  def setDashStyle(style: DashStyle): Line = js.native
  
  def setDescription(description: String): Line = js.native
  
  def setEnd(left: Double, top: Double): Line = js.native
  def setEnd(point: Point): Line = js.native
  
  def setEndArrow(style: ArrowStyle): Line = js.native
  
  def setEndConnection(connectionSite: ConnectionSite): Line = js.native
  
  def setHeight(height: Double): Line = js.native
  
  def setLeft(left: Double): Line = js.native
  
  def setLineCategory(lineCategory: LineCategory): Line = js.native
  
  def setLinkSlide(slideIndex: Integer): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  
  def setLinkUrl(url: String): Link = js.native
  
  def setRotation(angle: Double): Line = js.native
  
  def setStart(left: Double, top: Double): Line = js.native
  def setStart(point: Point): Line = js.native
  
  def setStartArrow(style: ArrowStyle): Line = js.native
  
  def setStartConnection(connectionSite: ConnectionSite): Line = js.native
  
  def setTitle(title: String): Line = js.native
  
  def setTop(top: Double): Line = js.native
  
  def setTransform(transform: AffineTransform): Line = js.native
  
  def setWeight(points: Double): Line = js.native
  
  def setWidth(width: Double): Line = js.native
}
