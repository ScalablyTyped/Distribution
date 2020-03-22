package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineStyleAnonCurvenessOpacity extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonCurvenessOpacity] = js.undefined
}

object AnonLineStyleAnonCurvenessOpacity {
  @scala.inline
  def apply(lineStyle: AnonCurvenessOpacity = null): AnonLineStyleAnonCurvenessOpacity = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineStyleAnonCurvenessOpacity]
  }
}

