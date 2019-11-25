package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulerSettings extends js.Object {
  /** Defines the appearance of horizontal ruler
    */
  var horizontalRuler: js.UndefOr[RulerSettingsHorizontalRuler] = js.undefined
  /** Enables or disables both the horizontal and vertical ruler.
    * @Default {false}
    */
  var showRulers: js.UndefOr[Boolean] = js.undefined
  /** Defines the appearance of vertical ruler
    */
  var verticalRuler: js.UndefOr[RulerSettingsVerticalRuler] = js.undefined
}

object RulerSettings {
  @scala.inline
  def apply(
    horizontalRuler: RulerSettingsHorizontalRuler = null,
    showRulers: js.UndefOr[Boolean] = js.undefined,
    verticalRuler: RulerSettingsVerticalRuler = null
  ): RulerSettings = {
    val __obj = js.Dynamic.literal()
    if (horizontalRuler != null) __obj.updateDynamic("horizontalRuler")(horizontalRuler.asInstanceOf[js.Any])
    if (!js.isUndefined(showRulers)) __obj.updateDynamic("showRulers")(showRulers.asInstanceOf[js.Any])
    if (verticalRuler != null) __obj.updateDynamic("verticalRuler")(verticalRuler.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerSettings]
  }
}

