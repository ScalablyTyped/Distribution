package typings.echarts.echarts.EChartOption

import typings.echarts.echarts.EChartOption.Dataset.DimensionObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dataset component is published since ECharts 4.
  * Dataset brings convenience in data management separated with styles and enables data reuse by different series.
  * More importantly, is enables data encoding from data to visual, which brings convenience in some scenarios.
  *
  * @see https://echarts.apache.org/en/option.html#dataset
  */
@JSName("Dataset")
trait Dataset_ extends js.Object {
  /**
    * dimensions can be used to define dimension info for series.data or dataset.source.
    * Notice: if dataset is used, we can provide dimension names in the first column/row of dataset.source,
    * and not need to specify dimensions here. But if dimensions is specified here,
    * echarts will not retrieve dimension names from the first row/column of dataset.source any more.
    *
    * @see https://echarts.apache.org/en/option.html#dataset.dimensions
    */
  var dimensions: js.UndefOr[js.Array[DimensionObject | String]] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Source data. Generally speaking, a source data describe a table, where these format below can be applied:
    * 2d array, where dimension names can be provided in the first row/column, or do not provide, only data.
    *
    * @see https://echarts.apache.org/en/option.html#dataset.source
    */
  var source: js.UndefOr[js.Array[_] | js.Object] = js.undefined
}

object Dataset_ {
  @scala.inline
  def apply(
    dimensions: js.Array[DimensionObject | String] = null,
    id: String = null,
    source: js.Array[_] | js.Object = null
  ): Dataset_ = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset_]
  }
}

