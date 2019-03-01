package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicatorsBorder extends js.Object {
  /** Specifies the border Color in bar indicators
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the border Width in bar indicators
    * @Default {1.5}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ScalesIndicatorsBorder {
  @scala.inline
  def apply(color: java.lang.String = null, width: scala.Int | scala.Double = null): ScalesIndicatorsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesIndicatorsBorder]
  }
}

