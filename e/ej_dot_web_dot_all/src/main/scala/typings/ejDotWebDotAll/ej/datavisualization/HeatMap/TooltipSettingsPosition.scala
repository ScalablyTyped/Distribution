package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettingsPosition extends js.Object {
  /** Sets the arrow position again popup.
    */
  var stem: js.UndefOr[TooltipSettingsPositionStem] = js.undefined
  /** Sets the Tooltip position against target.
    */
  var target: js.UndefOr[TooltipSettingsPositionTarget] = js.undefined
}

object TooltipSettingsPosition {
  @scala.inline
  def apply(stem: TooltipSettingsPositionStem = null, target: TooltipSettingsPositionTarget = null): TooltipSettingsPosition = {
    val __obj = js.Dynamic.literal()
    if (stem != null) __obj.updateDynamic("stem")(stem)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[TooltipSettingsPosition]
  }
}

