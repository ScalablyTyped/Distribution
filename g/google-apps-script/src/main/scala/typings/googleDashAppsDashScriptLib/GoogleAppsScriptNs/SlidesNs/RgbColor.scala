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
    asHexString: js.Function0[java.lang.String],
    getBlue: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getColorType: js.Function0[ColorType],
    getGreen: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getRed: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer]
  ): RgbColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asHexString")(asHexString)
    __obj.updateDynamic("getBlue")(getBlue)
    __obj.updateDynamic("getColorType")(getColorType)
    __obj.updateDynamic("getGreen")(getGreen)
    __obj.updateDynamic("getRed")(getRed)
    __obj.asInstanceOf[RgbColor]
  }
}

