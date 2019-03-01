package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsDragSettings extends js.Object {
  /** drag/drop the series
    * @Default {false}
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the type of drag settings.
    * @Default {xy}
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CommonSeriesOptionsDragSettings {
  @scala.inline
  def apply(enable: js.UndefOr[scala.Boolean] = js.undefined, `type`: java.lang.String = null): CommonSeriesOptionsDragSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CommonSeriesOptionsDragSettings]
  }
}

