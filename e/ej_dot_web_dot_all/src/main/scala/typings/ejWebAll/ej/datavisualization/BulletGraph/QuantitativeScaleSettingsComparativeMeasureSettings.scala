package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsComparativeMeasureSettings extends js.Object {
  /** Specifies the stroke of the comparative measure.
    * @Default {null}
    */
  var stroke: js.UndefOr[Double] = js.undefined
  /** Specifies the width of the comparative measure.
    * @Default {5}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object QuantitativeScaleSettingsComparativeMeasureSettings {
  @scala.inline
  def apply(stroke: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): QuantitativeScaleSettingsComparativeMeasureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsComparativeMeasureSettings]
  }
}

