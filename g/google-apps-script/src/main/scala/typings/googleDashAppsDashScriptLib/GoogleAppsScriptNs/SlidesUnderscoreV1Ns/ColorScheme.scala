package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorScheme extends js.Object {
  // The ThemeColorType and corresponding concrete color pairs.
  var colors: js.Array[ThemeColorPair]
}

object ColorScheme {
  @scala.inline
  def apply(colors: js.Array[ThemeColorPair]): ColorScheme = {
    val __obj = js.Dynamic.literal(colors = colors)
  
    __obj.asInstanceOf[ColorScheme]
  }
}

