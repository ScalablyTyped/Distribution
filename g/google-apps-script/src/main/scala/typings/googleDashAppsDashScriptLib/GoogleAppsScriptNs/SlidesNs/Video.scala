package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Video extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Video = js.native
  def bringForward(): Video = js.native
  def bringToFront(): Video = js.native
  def duplicate(): PageElement = js.native
  def getBorder(): Border = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): java.lang.String = js.native
  def getHeight(): stdLib.Number = js.native
  def getInherentHeight(): stdLib.Number = js.native
  def getInherentWidth(): stdLib.Number = js.native
  def getLeft(): stdLib.Number = js.native
  def getObjectId(): java.lang.String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): stdLib.Number = js.native
  def getSource(): VideoSourceType = js.native
  def getThumbnailUrl(): java.lang.String = js.native
  def getTitle(): java.lang.String = js.native
  def getTop(): stdLib.Number = js.native
  def getTransform(): AffineTransform = js.native
  def getUrl(): java.lang.String = js.native
  def getVideoId(): java.lang.String = js.native
  def getWidth(): stdLib.Number = js.native
  def preconcatenateTransform(transform: AffineTransform): Video = js.native
  def remove(): scala.Unit = js.native
  def scaleHeight(ratio: stdLib.Number): Video = js.native
  def scaleWidth(ratio: stdLib.Number): Video = js.native
  def select(): scala.Unit = js.native
  def select(replace: scala.Boolean): scala.Unit = js.native
  def sendBackward(): Video = js.native
  def sendToBack(): Video = js.native
  def setDescription(description: java.lang.String): Video = js.native
  def setHeight(height: stdLib.Number): Video = js.native
  def setLeft(left: stdLib.Number): Video = js.native
  def setRotation(angle: stdLib.Number): Video = js.native
  def setTitle(title: java.lang.String): Video = js.native
  def setTop(top: stdLib.Number): Video = js.native
  def setTransform(transform: AffineTransform): Video = js.native
  def setWidth(width: stdLib.Number): Video = js.native
}

