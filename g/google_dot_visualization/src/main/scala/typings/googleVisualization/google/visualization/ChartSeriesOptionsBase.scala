package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesOptionsBase extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object ChartSeriesOptionsBase {
  @scala.inline
  def apply(color: String = null): ChartSeriesOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesOptionsBase]
  }
}

