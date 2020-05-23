package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsIndicatorSymbolSize extends js.Object {
  /** Specifies the height of indicator symbol.
    * @Default {10}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Specifies the width of indicator symbol.
    * @Default {10}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CaptionSettingsIndicatorSymbolSize {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): CaptionSettingsIndicatorSymbolSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsIndicatorSymbolSize]
  }
}

