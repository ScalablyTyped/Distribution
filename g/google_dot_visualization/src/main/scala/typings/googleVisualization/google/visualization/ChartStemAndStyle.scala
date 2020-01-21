package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartStemAndStyle extends js.Object {
  var stem: js.UndefOr[ChartStem] = js.undefined
  var style: js.UndefOr[String] = js.undefined
}

object ChartStemAndStyle {
  @scala.inline
  def apply(stem: ChartStem = null, style: String = null): ChartStemAndStyle = {
    val __obj = js.Dynamic.literal()
    if (stem != null) __obj.updateDynamic("stem")(stem.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartStemAndStyle]
  }
}

