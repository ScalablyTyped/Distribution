package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordArt extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): WordArt = js.native
  def duplicate(): PageElement = js.native
  def getDescription(): java.lang.String = js.native
  def getHeight(): stdLib.Number = js.native
  def getInherentHeight(): stdLib.Number = js.native
  def getInherentWidth(): stdLib.Number = js.native
  def getLeft(): stdLib.Number = js.native
  def getLink(): Link = js.native
  def getObjectId(): java.lang.String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRenderedText(): java.lang.String = js.native
  def getRotation(): stdLib.Number = js.native
  def getTitle(): java.lang.String = js.native
  def getTop(): stdLib.Number = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): stdLib.Number = js.native
  def preconcatenateTransform(transform: AffineTransform): WordArt = js.native
  def remove(): scala.Unit = js.native
  def removeLink(): scala.Unit = js.native
  def scaleHeight(ratio: stdLib.Number): WordArt = js.native
  def scaleWidth(ratio: stdLib.Number): WordArt = js.native
  def select(): scala.Unit = js.native
  def select(replace: scala.Boolean): scala.Unit = js.native
  def setHeight(height: stdLib.Number): WordArt = js.native
  def setLeft(left: stdLib.Number): WordArt = js.native
  def setLinkSlide(slideIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkUrl(url: java.lang.String): Link = js.native
  def setRotation(angle: stdLib.Number): WordArt = js.native
  def setTop(top: stdLib.Number): WordArt = js.native
  def setTransform(transform: AffineTransform): WordArt = js.native
  def setWidth(width: stdLib.Number): WordArt = js.native
}

