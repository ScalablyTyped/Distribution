package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbColor extends js.Object {
  def asHexString(): java.lang.String
  def getBlue(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getColorType(): ColorType
  def getGreen(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getRed(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
}

object RgbColor {
  @scala.inline
  def apply(
    asHexString: () => java.lang.String,
    getBlue: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getColorType: () => ColorType,
    getGreen: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getRed: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): RgbColor = {
    val __obj = js.Dynamic.literal(asHexString = js.Any.fromFunction0(asHexString), getBlue = js.Any.fromFunction0(getBlue), getColorType = js.Any.fromFunction0(getColorType), getGreen = js.Any.fromFunction0(getGreen), getRed = js.Any.fromFunction0(getRed))
  
    __obj.asInstanceOf[RgbColor]
  }
}

