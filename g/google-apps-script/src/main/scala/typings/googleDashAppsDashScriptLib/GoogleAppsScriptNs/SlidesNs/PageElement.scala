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
  def duplicate(): PageElement = js.native
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
  def getTitle(): java.lang.String = js.native
  def getTop(): stdLib.Number = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): stdLib.Number = js.native
  def preconcatenateTransform(transform: AffineTransform): PageElement = js.native
  def remove(): scala.Unit = js.native
  def scaleHeight(ratio: stdLib.Number): PageElement = js.native
  def scaleWidth(ratio: stdLib.Number): PageElement = js.native
  def select(): scala.Unit = js.native
  def select(replace: scala.Boolean): scala.Unit = js.native
  def setHeight(height: stdLib.Number): PageElement = js.native
  def setLeft(left: stdLib.Number): PageElement = js.native
  def setRotation(angle: stdLib.Number): PageElement = js.native
  def setTop(top: stdLib.Number): PageElement = js.native
  def setTransform(transform: AffineTransform): PageElement = js.native
  def setWidth(width: stdLib.Number): PageElement = js.native
}

