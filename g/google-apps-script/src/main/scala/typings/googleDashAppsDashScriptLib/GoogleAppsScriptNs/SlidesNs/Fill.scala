package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fill extends js.Object {
  def getSolidFill(): SolidFill = js.native
  def getType(): FillType = js.native
  def isVisible(): scala.Boolean = js.native
  def setSolidFill(color: Color): scala.Unit = js.native
  def setSolidFill(color: Color, alpha: scala.Double): scala.Unit = js.native
  def setSolidFill(color: ThemeColorType): scala.Unit = js.native
  def setSolidFill(color: ThemeColorType, alpha: scala.Double): scala.Unit = js.native
  def setSolidFill(hexString: java.lang.String): scala.Unit = js.native
  def setSolidFill(hexString: java.lang.String, alpha: scala.Double): scala.Unit = js.native
  def setSolidFill(
    red: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    green: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    blue: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def setSolidFill(
    red: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    green: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    blue: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    alpha: scala.Double
  ): scala.Unit = js.native
  def setTransparent(): scala.Unit = js.native
}

