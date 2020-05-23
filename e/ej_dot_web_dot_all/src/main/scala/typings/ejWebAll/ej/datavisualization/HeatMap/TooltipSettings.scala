package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettings extends js.Object {
  /** Defines the animation for the tooltip that should be shown when the mouse hovers over rows/columns.
    */
  var animation: js.UndefOr[TooltipSettingsAnimation] = js.undefined
  /** Defines the tooltip of associate that should be shown when the mouse hovers over rows/columns.
    * @Default {mouseFollow}
    */
  var associate: js.UndefOr[Associate | String] = js.undefined
  /** Enables/ disables the balloon for the tooltip to be shown
    * @Default {true}
    */
  var isBalloon: js.UndefOr[Boolean] = js.undefined
  /** Defines various attributes of the Tooltip position
    */
  var position: js.UndefOr[TooltipSettingsPosition] = js.undefined
  /** Defines the tooltip that should be shown when the mouse hovers over rows/columns.
    * @Default {null}
    */
  var templateId: js.UndefOr[String] = js.undefined
  /** Defines the tooltip to be triggered.
    * @Default {hover}
    */
  var trigger: js.UndefOr[Trigger | String] = js.undefined
}

object TooltipSettings {
  @scala.inline
  def apply(
    animation: TooltipSettingsAnimation = null,
    associate: Associate | String = null,
    isBalloon: js.UndefOr[Boolean] = js.undefined,
    position: TooltipSettingsPosition = null,
    templateId: String = null,
    trigger: Trigger | String = null
  ): TooltipSettings = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (associate != null) __obj.updateDynamic("associate")(associate.asInstanceOf[js.Any])
    if (!js.isUndefined(isBalloon)) __obj.updateDynamic("isBalloon")(isBalloon.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipSettings]
  }
}

