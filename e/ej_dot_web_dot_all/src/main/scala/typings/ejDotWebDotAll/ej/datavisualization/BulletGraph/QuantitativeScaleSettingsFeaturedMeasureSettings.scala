package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

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
  def apply(stroke: Int | Double = null, width: Int | Double = null): QuantitativeScaleSettingsFeaturedMeasureSettings = {
    val __obj = js.Dynamic.literal()
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsFeaturedMeasureSettings]
  }
}

