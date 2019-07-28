package typings.googleDotVisualization.googleNs.visualizationNs

import typings.googleDotVisualization.Anon_Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCrosshair extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var focused: js.UndefOr[Anon_Color] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Anon_Color] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
}

object ChartCrosshair {
  @scala.inline
  def apply(
    color: String = null,
    focused: Anon_Color = null,
    opacity: Int | Double = null,
    orientation: String = null,
    selected: Anon_Color = null,
    trigger: String = null
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

