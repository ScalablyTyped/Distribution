package typings.echarts.echarts.EChartOption.SeriesLines

import typings.echarts.anon.FontStyle
import typings.echarts.anon.LineStyleShadowColor
import typings.echarts.anon.ShadowColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * An array includes two ore more than two coordinates.
    * Each coordinate could be `[x, y]` in
    * [rectangular coordinate](https://echarts.apache.org/en/option.html#grid)
    * and `[lng, lat]` in
    * [geographic coordinate](https://echarts.apache.org/en/option.html#geo)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.data.coords
    */
  var coords: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis
    */
  var emphasis: js.UndefOr[LineStyleShadowColor] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.label
    */
  var label: js.UndefOr[FontStyle] = js.undefined
  /**
    * The line style of this data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.data.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowColor] = js.undefined
  /**
    * the name of data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.data.name
    */
  var name: js.UndefOr[String] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    coords: js.Array[_] = null,
    emphasis: LineStyleShadowColor = null,
    label: FontStyle = null,
    lineStyle: ShadowColor = null,
    name: String = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

