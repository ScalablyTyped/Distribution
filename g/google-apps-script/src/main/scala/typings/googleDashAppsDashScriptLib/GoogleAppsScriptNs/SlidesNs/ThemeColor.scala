package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColor extends js.Object {
  def getColorType(): ColorType
  def getThemeColorType(): ThemeColorType
}

object ThemeColor {
  @scala.inline
  def apply(getColorType: js.Function0[ColorType], getThemeColorType: js.Function0[ThemeColorType]): ThemeColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColorType")(getColorType)
    __obj.updateDynamic("getThemeColorType")(getThemeColorType)
    __obj.asInstanceOf[ThemeColor]
  }
}

