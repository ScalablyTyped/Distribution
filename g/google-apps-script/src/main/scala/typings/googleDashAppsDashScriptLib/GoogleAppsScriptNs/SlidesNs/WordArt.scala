package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordArt extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): WordArt = js.native
  def bringForward(): WordArt = js.native
  def bringToFront(): WordArt = js.native
  def duplicate(): PageElement = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): java.lang.String = js.native
  def getHeight(): scala.Double = js.native
  def getInherentHeight(): scala.Double = js.native
  def getInherentWidth(): scala.Double = js.native
  def getLeft(): scala.Double = js.native
  def getLink(): Link = js.native
  def getObjectId(): java.lang.String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRenderedText(): java.lang.String = js.native
  def getRotation(): scala.Double = js.native
  def getTitle(): java.lang.String = js.native
  def getTop(): scala.Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): scala.Double = js.native
  def preconcatenateTransform(transform: AffineTransform): WordArt = js.native
  def remove(): scala.Unit = js.native
  def removeLink(): scala.Unit = js.native
  def scaleHeight(ratio: scala.Double): WordArt = js.native
  def scaleWidth(ratio: scala.Double): WordArt = js.native
  def select(): scala.Unit = js.native
  def select(replace: scala.Boolean): scala.Unit = js.native
  def sendBackward(): WordArt = js.native
  def sendToBack(): WordArt = js.native
  def setDescription(description: java.lang.String): WordArt = js.native
  def setHeight(height: scala.Double): WordArt = js.native
  def setLeft(left: scala.Double): WordArt = js.native
  def setLinkSlide(slideIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkUrl(url: java.lang.String): Link = js.native
  def setRotation(angle: scala.Double): WordArt = js.native
  def setTitle(title: java.lang.String): WordArt = js.native
  def setTop(top: scala.Double): WordArt = js.native
  def setTransform(transform: AffineTransform): WordArt = js.native
  def setWidth(width: scala.Double): WordArt = js.native
}

