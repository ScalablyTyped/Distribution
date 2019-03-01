package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCrosshair extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var focused: js.UndefOr[googleDotVisualizationLib.Anon_Color] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[googleDotVisualizationLib.Anon_Color] = js.undefined
  var trigger: js.UndefOr[java.lang.String] = js.undefined
}

object ChartCrosshair {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    focused: googleDotVisualizationLib.Anon_Color = null,
    opacity: scala.Int | scala.Double = null,
    orientation: java.lang.String = null,
    selected: googleDotVisualizationLib.Anon_Color = null,
    trigger: java.lang.String = null
  ): ChartCrosshair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[ChartCrosshair]
  }
}

