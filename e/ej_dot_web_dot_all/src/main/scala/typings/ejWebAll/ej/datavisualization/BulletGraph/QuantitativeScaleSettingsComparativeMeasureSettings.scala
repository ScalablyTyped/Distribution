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
  def apply(stroke: Int | Double = null, width: Int | Double = null): QuantitativeScaleSettingsComparativeMeasureSettings = {
    val __obj = js.Dynamic.literal()
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsComparativeMeasureSettings]
  }
}

