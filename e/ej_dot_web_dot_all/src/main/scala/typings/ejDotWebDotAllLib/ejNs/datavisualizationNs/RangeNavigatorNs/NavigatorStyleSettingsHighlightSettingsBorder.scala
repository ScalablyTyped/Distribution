package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStyleSettingsHighlightSettingsBorder extends js.Object {
  /** To set the border color to the highlight.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** To set the border width to the highlight.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object NavigatorStyleSettingsHighlightSettingsBorder {
  @scala.inline
  def apply(color: java.lang.String = null, width: scala.Int | scala.Double = null): NavigatorStyleSettingsHighlightSettingsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStyleSettingsHighlightSettingsBorder]
  }
}

