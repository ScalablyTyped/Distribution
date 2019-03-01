package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

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
  var associate: js.UndefOr[Associate | java.lang.String] = js.undefined
  /** Enables/ disables the balloon for the tooltip to be shown
    * @Default {true}
    */
  var isBalloon: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines various attributes of the Tooltip position
    */
  var position: js.UndefOr[TooltipSettingsPosition] = js.undefined
  /** Defines the tooltip that should be shown when the mouse hovers over rows/columns.
    * @Default {null}
    */
  var templateId: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the tooltip to be triggered.
    * @Default {hover}
    */
  var trigger: js.UndefOr[Trigger | java.lang.String] = js.undefined
}

object TooltipSettings {
  @scala.inline
  def apply(
    animation: TooltipSettingsAnimation = null,
    associate: Associate | java.lang.String = null,
    isBalloon: js.UndefOr[scala.Boolean] = js.undefined,
    position: TooltipSettingsPosition = null,
    templateId: java.lang.String = null,
    trigger: Trigger | java.lang.String = null
  ): TooltipSettings = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (associate != null) __obj.updateDynamic("associate")(associate.asInstanceOf[js.Any])
    if (!js.isUndefined(isBalloon)) __obj.updateDynamic("isBalloon")(isBalloon)
    if (position != null) __obj.updateDynamic("position")(position)
    if (templateId != null) __obj.updateDynamic("templateId")(templateId)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipSettings]
  }
}

