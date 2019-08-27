package typings.echarts.echartsNs.EChartOptionNs.LegendNs

import typings.echarts.echartsNs.EChartOptionNs.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendDataObject extends js.Object {
  /**
    * Icon of the legend items.
    * Icon types provided by ECharts includes 'circle', 'rect', 'roundRect', 'triangle', 'diamond', 'pin', 'arrow', 'none'
    * It can be set to an image with 'image://url' , in which URL is the link to an image, or dataURI of an image.
    * Icons can be set to arbitrary vector path via 'path://' in ECharts.
    * As compared with raster image, vector paths prevent from jagging and blurring when scaled,
    * and have a better control over changing colors. Size of vectoer icon will be adapted automatically.
    * Refer to SVG PathData for more information about format of path. You may export vector paths from tools like Adobe Illustrator.
    *
    * @see https://echarts.apache.org/en/option.html#legend.data.icon
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Name of legend, which should be the name value of a certain series.
    * If it is a pie chart, legend name can also be the name of a single data item.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Text style of legend.
    */
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}

object LegendDataObject {
  @scala.inline
  def apply(icon: String = null, name: String = null, textStyle: TextStyle = null): LegendDataObject = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (name != null) __obj.updateDynamic("name")(name)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[LegendDataObject]
  }
}

