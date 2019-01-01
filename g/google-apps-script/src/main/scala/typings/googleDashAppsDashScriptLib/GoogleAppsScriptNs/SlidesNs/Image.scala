package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Image = js.native
  def bringForward(): Image = js.native
  def bringToFront(): Image = js.native
  def duplicate(): PageElement = js.native
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getBorder(): Border = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getContentUrl(): java.lang.String = js.native
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
  def getRotation(): stdLib.Number = js.native
  def getSourceUrl(): java.lang.String = js.native
  def getTitle(): java.lang.String = js.native
  def getTop(): stdLib.Number = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): stdLib.Number = js.native
  def preconcatenateTransform(transform: AffineTransform): Image = js.native
  def remove(): scala.Unit = js.native
  def removeLink(): scala.Unit = js.native
  def replace(blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): Image = js.native
  def replace(blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource, crop: scala.Boolean): Image = js.native
  def replace(imageUrl: java.lang.String): Image = js.native
  def replace(imageUrl: java.lang.String, crop: scala.Boolean): Image = js.native
  def scaleHeight(ratio: stdLib.Number): Image = js.native
  def scaleWidth(ratio: stdLib.Number): Image = js.native
  def select(): scala.Unit = js.native
  def select(replace: scala.Boolean): scala.Unit = js.native
  def sendBackward(): Image = js.native
  def sendToBack(): Image = js.native
  def setDescription(description: java.lang.String): Image = js.native
  def setHeight(height: stdLib.Number): Image = js.native
  def setLeft(left: stdLib.Number): Image = js.native
  def setLinkSlide(slideIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkUrl(url: java.lang.String): Link = js.native
  def setRotation(angle: stdLib.Number): Image = js.native
  def setTitle(title: java.lang.String): Image = js.native
  def setTop(top: stdLib.Number): Image = js.native
  def setTransform(transform: AffineTransform): Image = js.native
  def setWidth(width: stdLib.Number): Image = js.native
}

