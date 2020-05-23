package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsFeaturedMeasureSettings extends js.Object {
  /** Specifies the Stroke of the featured measure in bullet graph.
    * @Default {null}
    */
  var stroke: js.UndefOr[Double] = js.undefined
  /** Specifies the width of the featured measure in bullet graph.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object QuantitativeScaleSettingsFeaturedMeasureSettings {
  @scala.inline
  def apply(stroke: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): QuantitativeScaleSettingsFeaturedMeasureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsFeaturedMeasureSettings]
  }
}

