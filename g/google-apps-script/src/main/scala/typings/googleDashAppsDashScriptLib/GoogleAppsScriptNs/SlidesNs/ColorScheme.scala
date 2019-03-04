package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorScheme extends js.Object {
  def getConcreteColor(theme: ThemeColorType): Color
  def getThemeColors(): js.Array[ThemeColorType]
}

object ColorScheme {
  @scala.inline
  def apply(
    getConcreteColor: js.Function1[ThemeColorType, Color],
    getThemeColors: js.Function0[js.Array[ThemeColorType]]
  ): ColorScheme = {
    val __obj = js.Dynamic.literal(getConcreteColor = getConcreteColor, getThemeColors = getThemeColors)
  
    __obj.asInstanceOf[ColorScheme]
  }
}

