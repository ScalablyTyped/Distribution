package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsMajorTickSettings extends js.Object {
  /** Specifies the size of the major ticks.
    * @Default {13}
    */
  var size: js.UndefOr[Double] = js.undefined
  /** Specifies the stroke color of the major tick lines.
    * @Default {null}
    */
  var stroke: js.UndefOr[String] = js.undefined
  /** Specifies the width of the major tick lines.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object QuantitativeScaleSettingsMajorTickSettings {
  @scala.inline
  def apply(size: Int | Double = null, stroke: String = null, width: Int | Double = null): QuantitativeScaleSettingsMajorTickSettings = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsMajorTickSettings]
  }
}

