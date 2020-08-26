package typings.echarts.echarts.EChartOption.Tooltip

import typings.echarts.echartsStrings.series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  // Value of axis
  var axisValue: js.UndefOr[Double | String] = js.native
  // Label of axis value
  var axisValueLabel: js.UndefOr[String] = js.native
  // Color of data
  var color: js.UndefOr[String] = js.native
  var componentType: js.UndefOr[series] = js.native
  // Original data as input
  var data: js.UndefOr[js.Any] = js.native
  // Data index in input data array
  var dataIndex: js.UndefOr[Double] = js.native
  // data dimension index, for example 0 or 1 or 2 ...
  // Only work in `radar` series.
  var dimensionIndex: js.UndefOr[Double] = js.native
  // dimension names list
  var dimensionNames: js.UndefOr[js.Array[String]] = js.native
  // encoding info of coordinate system
  // Key: coord, like ('x' 'y' 'radius' 'angle')
  // value: Must be an array, not null/undefined. Contain dimension indices, like:
  // {
  //     x: [2] // values on dimension index 2 are mapped to x axis.
  //     y: [0] // values on dimension index 0 are mapped to y axis.
  // }
  var encode: js.UndefOr[js.Object] = js.native
  // item marker, string of HTMLElement
  var marker: js.UndefOr[String] = js.native
  // Data name, or category name
  var name: js.UndefOr[String] = js.native
  // the percentage of pie chart
  var percent: js.UndefOr[Double] = js.native
  // Series index in option.series
  var seriesIndex: js.UndefOr[Double] = js.native
  // Series name
  var seriesName: js.UndefOr[String] = js.native
  // Series type
  var seriesType: js.UndefOr[String] = js.native
  // Value of data
  var value: js.UndefOr[Double | js.Array[_]] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
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
    def setAxisValue(value: Double | String): Self = this.set("axisValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisValue: Self = this.set("axisValue", js.undefined)
    @scala.inline
    def setAxisValueLabel(value: String): Self = this.set("axisValueLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisValueLabel: Self = this.set("axisValueLabel", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setComponentType(value: series): Self = this.set("componentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentType: Self = this.set("componentType", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataIndex(value: Double): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataIndex: Self = this.set("dataIndex", js.undefined)
    @scala.inline
    def setDimensionIndex(value: Double): Self = this.set("dimensionIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionIndex: Self = this.set("dimensionIndex", js.undefined)
    @scala.inline
    def setDimensionNamesVarargs(value: String*): Self = this.set("dimensionNames", js.Array(value :_*))
    @scala.inline
    def setDimensionNames(value: js.Array[String]): Self = this.set("dimensionNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionNames: Self = this.set("dimensionNames", js.undefined)
    @scala.inline
    def setEncode(value: js.Object): Self = this.set("encode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setSeriesIndex(value: Double): Self = this.set("seriesIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesIndex: Self = this.set("seriesIndex", js.undefined)
    @scala.inline
    def setSeriesName(value: String): Self = this.set("seriesName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesName: Self = this.set("seriesName", js.undefined)
    @scala.inline
    def setSeriesType(value: String): Self = this.set("seriesType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesType: Self = this.set("seriesType", js.undefined)
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: Double | js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

