package typings.echarts.echarts.EChartOption.Legend

import typings.echarts.echarts.EChartOption.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var icon: js.UndefOr[String] = js.native
  /**
    * Name of legend, which should be the name value of a certain series.
    * If it is a pie chart, legend name can also be the name of a single data item.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Text style of legend.
    */
  var textStyle: js.UndefOr[TextStyle] = js.native
}

object LegendDataObject {
  @scala.inline
  def apply(): LegendDataObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendDataObject]
  }
  @scala.inline
  implicit class LegendDataObjectOps[Self <: LegendDataObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

