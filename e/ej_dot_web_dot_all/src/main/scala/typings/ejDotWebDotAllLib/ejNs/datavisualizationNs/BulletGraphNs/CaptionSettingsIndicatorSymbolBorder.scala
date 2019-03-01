package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsIndicatorSymbolBorder extends js.Object {
  /** Specifies the border color of indicator symbol.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the border width of indicator symbol.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CaptionSettingsIndicatorSymbolBorder {
  @scala.inline
  def apply(color: java.lang.String = null, width: scala.Int | scala.Double = null): CaptionSettingsIndicatorSymbolBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsIndicatorSymbolBorder]
  }
}

