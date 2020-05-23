package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsMinorTickSettings extends js.Object {
  /** Specifies the size of minor ticks.
    * @Default {7}
    */
  var size: js.UndefOr[Double] = js.undefined
  /** Specifies the stroke color of minor ticks in bullet graph.
    * @Default {null}
    */
  var stroke: js.UndefOr[String] = js.undefined
  /** Specifies the width of the minor ticks in bullet graph.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object QuantitativeScaleSettingsMinorTickSettings {
  @scala.inline
  def apply(
    size: js.UndefOr[Double] = js.undefined,
    stroke: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): QuantitativeScaleSettingsMinorTickSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsMinorTickSettings]
  }
}

