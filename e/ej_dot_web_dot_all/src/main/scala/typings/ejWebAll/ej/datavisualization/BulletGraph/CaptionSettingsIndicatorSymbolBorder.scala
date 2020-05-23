package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsIndicatorSymbolBorder extends js.Object {
  /** Specifies the border color of indicator symbol.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the border width of indicator symbol.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CaptionSettingsIndicatorSymbolBorder {
  @scala.inline
  def apply(color: String = null, width: js.UndefOr[Double] = js.undefined): CaptionSettingsIndicatorSymbolBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsIndicatorSymbolBorder]
  }
}

