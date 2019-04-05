package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightedFontFamily extends js.Object {
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object WeightedFontFamily {
  @scala.inline
  def apply(fontFamily: java.lang.String = null, weight: scala.Int | scala.Double = null): WeightedFontFamily = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedFontFamily]
  }
}

