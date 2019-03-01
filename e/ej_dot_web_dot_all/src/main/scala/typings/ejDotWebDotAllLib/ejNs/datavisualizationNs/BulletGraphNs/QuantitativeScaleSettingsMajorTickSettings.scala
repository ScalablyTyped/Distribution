package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsMajorTickSettings extends js.Object {
  /** Specifies the size of the major ticks.
    * @Default {13}
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the stroke color of the major tick lines.
    * @Default {null}
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width of the major tick lines.
    * @Default {2}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object QuantitativeScaleSettingsMajorTickSettings {
  @scala.inline
  def apply(
    size: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): QuantitativeScaleSettingsMajorTickSettings = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsMajorTickSettings]
  }
}

