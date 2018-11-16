package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageBackground extends js.Object {
  def getPictureFill(): PictureFill = js.native
  def getSolidFill(): SolidFill = js.native
  def getType(): PageBackgroundType = js.native
  def isVisible(): scala.Boolean = js.native
  def setPictureFill(blobSource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): scala.Unit = js.native
  def setPictureFill(imageUrl: java.lang.String): scala.Unit = js.native
  def setSolidFill(color: Color): scala.Unit = js.native
  def setSolidFill(color: Color, alpha: stdLib.Number): scala.Unit = js.native
  def setSolidFill(color: ThemeColorType): scala.Unit = js.native
  def setSolidFill(color: ThemeColorType, alpha: stdLib.Number): scala.Unit = js.native
  def setSolidFill(hexString: java.lang.String): scala.Unit = js.native
  def setSolidFill(hexString: java.lang.String, alpha: stdLib.Number): scala.Unit = js.native
  def setSolidFill(
    red: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    green: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    blue: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def setSolidFill(
    red: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    green: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    blue: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    alpha: stdLib.Number
  ): scala.Unit = js.native
  def setTransparent(): scala.Unit = js.native
}

