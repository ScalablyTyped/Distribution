package typings.echarts.echarts.EChartOption

import typings.echarts.echarts.EChartOption.Dataset.DimensionObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dataset component is published since ECharts 4.
  * Dataset brings convenience in data management separated with styles and enables data reuse by different series.
  * More importantly, is enables data encoding from data to visual, which brings convenience in some scenarios.
  *
  * @see https://echarts.apache.org/en/option.html#dataset
  */
@js.native
trait Dataset_ extends js.Object {
  
  /**
    * dimensions can be used to define dimension info for series.data or dataset.source.
    * Notice: if dataset is used, we can provide dimension names in the first column/row of dataset.source,
    * and not need to specify dimensions here. But if dimensions is specified here,
    * echarts will not retrieve dimension names from the first row/column of dataset.source any more.
    *
    * @see https://echarts.apache.org/en/option.html#dataset.dimensions
    */
  var dimensions: js.UndefOr[js.Array[DimensionObject | String]] = js.native
  
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Source data. Generally speaking, a source data describe a table, where these format below can be applied:
    * 2d array, where dimension names can be provided in the first row/column, or do not provide, only data.
    *
    * @see https://echarts.apache.org/en/option.html#dataset.source
    */
  var source: js.UndefOr[js.Array[_] | js.Object] = js.native
}
object Dataset_ {
  
  @scala.inline
  def apply(): Dataset_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset_]
  }
  
  @scala.inline
  implicit class Dataset_Ops[Self <: Dataset_] (val x: Self) extends AnyVal {
    
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
    def setDimensionsVarargs(value: (DimensionObject | String)*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[DimensionObject | String]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: js.Any*): Self = this.set("source", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Array[_] | js.Object): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
