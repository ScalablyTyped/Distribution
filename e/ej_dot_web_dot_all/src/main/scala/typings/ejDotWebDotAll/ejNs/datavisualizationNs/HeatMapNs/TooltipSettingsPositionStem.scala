package typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettingsPositionStem extends js.Object {
  /** Sets the arrow position again popup based on horizontal(x) value
    * @Default {center}
    */
  var horizontal: js.UndefOr[Horizontal | String] = js.undefined
  /** Sets the arrow position again popup based on vertical(y) value
    * @Default {bottom}
    */
  var vertical: js.UndefOr[Vertical | String] = js.undefined
}

object TooltipSettingsPositionStem {
  @scala.inline
  def apply(horizontal: Horizontal | String = null, vertical: Vertical | String = null): TooltipSettingsPositionStem = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipSettingsPositionStem]
  }
}

