package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyleCurvenessOpacity extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[CurvenessOpacity] = js.undefined
}

object LineStyleCurvenessOpacity {
  @scala.inline
  def apply(lineStyle: CurvenessOpacity = null): LineStyleCurvenessOpacity = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyleCurvenessOpacity]
  }
}

