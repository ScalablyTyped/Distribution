package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

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
  def apply(size: Int | Double = null, stroke: String = null, width: Int | Double = null): QuantitativeScaleSettingsMinorTickSettings = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsMinorTickSettings]
  }
}

