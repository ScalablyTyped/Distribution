package typings.googleDotVisualization.google.visualization

import typings.googleDotVisualization.Anon_Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCrosshair extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var focused: js.UndefOr[Anon_Color] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[ChartOrientation] = js.undefined
  var selected: js.UndefOr[Anon_Color] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
}

object ChartCrosshair {
  @scala.inline
  def apply(
    color: String = null,
    focused: Anon_Color = null,
    opacity: Int | Double = null,
    orientation: ChartOrientation = null,
    selected: Anon_Color = null,
    trigger: String = null
  ): ChartCrosshair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCrosshair]
  }
}

