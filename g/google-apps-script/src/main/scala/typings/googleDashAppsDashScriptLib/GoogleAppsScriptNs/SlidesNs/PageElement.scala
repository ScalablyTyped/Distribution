package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageElement extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): PageElement = js.native
  def asGroup(): Group = js.native
  def asImage(): Image = js.native
  def asLine(): Line = js.native
  def asShape(): Shape = js.native
  def asSheetsChart(): SheetsChart = js.native
  def asTable(): Table = js.native
  def asVideo(): Video = js.native
  def asWordArt(): WordArt = js.native
  def bringForward(): PageElement = js.native
  def bringToFront(): PageElement = js.native
  def duplicate(): PageElement = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): java.lang.String = js.native
  def getHeight(): scala.Double = js.native
  def getInherentHeight(): scala.Double = js.native
  def getInherentWidth(): scala.Double = js.native
  def getLeft(): scala.Double = js.native
  def getObjectId(): java.lang.String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): scala.Double = js.native
  def getTitle(): java.lang.String = js.native
  def getTop(): scala.Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): scala.Double = js.native
  def preconcatenateTransform(transform: AffineTransform): PageElement = js.native
  def remove(): scala.Unit = js.native
  def scaleHeight(ratio: scala.Double): PageElement = js.native
  def scaleWidth(ratio: scala.Double): PageElement = js.native
  def select(): scala.Unit = js.native
  def select(replace: scala.Boolean): scala.Unit = js.native
  def sendBackward(): PageElement = js.native
  def sendToBack(): PageElement = js.native
  def setDescription(description: java.lang.String): PageElement = js.native
  def setHeight(height: scala.Double): PageElement = js.native
  def setLeft(left: scala.Double): PageElement = js.native
  def setRotation(angle: scala.Double): PageElement = js.native
  def setTitle(title: java.lang.String): PageElement = js.native
  def setTop(top: scala.Double): PageElement = js.native
  def setTransform(transform: AffineTransform): PageElement = js.native
  def setWidth(width: scala.Double): PageElement = js.native
}

