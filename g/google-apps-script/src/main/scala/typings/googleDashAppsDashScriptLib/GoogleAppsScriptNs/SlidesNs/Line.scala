package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Line = js.native
  def bringForward(): Line = js.native
  def bringToFront(): Line = js.native
  def duplicate(): PageElement = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDashStyle(): DashStyle = js.native
  def getDescription(): java.lang.String = js.native
  def getEnd(): Point = js.native
  def getEndArrow(): ArrowStyle = js.native
  def getEndConnection(): ConnectionSite = js.native
  def getHeight(): scala.Double = js.native
  def getInherentHeight(): scala.Double = js.native
  def getInherentWidth(): scala.Double = js.native
  def getLeft(): scala.Double = js.native
  def getLineCategory(): LineCategory = js.native
  def getLineFill(): LineFill = js.native
  def getLineType(): LineType = js.native
  def getLink(): Link = js.native
  def getObjectId(): java.lang.String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): scala.Double = js.native
  def getStart(): Point = js.native
  def getStartArrow(): ArrowStyle = js.native
  def getStartConnection(): ConnectionSite = js.native
  def getTitle(): java.lang.String = js.native
  def getTop(): scala.Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWeight(): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def isConnector(): scala.Boolean = js.native
  def preconcatenateTransform(transform: AffineTransform): Line = js.native
  def remove(): scala.Unit = js.native
  def removeLink(): scala.Unit = js.native
  def reroute(): Line = js.native
  def scaleHeight(ratio: scala.Double): Line = js.native
  def scaleWidth(ratio: scala.Double): Line = js.native
  def select(): scala.Unit = js.native
  def select(replace: scala.Boolean): scala.Unit = js.native
  def sendBackward(): Line = js.native
  def sendToBack(): Line = js.native
  def setDashStyle(style: DashStyle): Line = js.native
  def setDescription(description: java.lang.String): Line = js.native
  def setEnd(left: scala.Double, top: scala.Double): Line = js.native
  def setEnd(point: Point): Line = js.native
  def setEndArrow(style: ArrowStyle): Line = js.native
  def setEndConnection(connectionSite: ConnectionSite): Line = js.native
  def setHeight(height: scala.Double): Line = js.native
  def setLeft(left: scala.Double): Line = js.native
  def setLineCategory(lineCategory: LineCategory): Line = js.native
  def setLinkSlide(slideIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkUrl(url: java.lang.String): Link = js.native
  def setRotation(angle: scala.Double): Line = js.native
  def setStart(left: scala.Double, top: scala.Double): Line = js.native
  def setStart(point: Point): Line = js.native
  def setStartArrow(style: ArrowStyle): Line = js.native
  def setStartConnection(connectionSite: ConnectionSite): Line = js.native
  def setTitle(title: java.lang.String): Line = js.native
  def setTop(top: scala.Double): Line = js.native
  def setTransform(transform: AffineTransform): Line = js.native
  def setWeight(points: scala.Double): Line = js.native
  def setWidth(width: scala.Double): Line = js.native
}

