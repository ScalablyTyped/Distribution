package typings.echarts.echarts.EChartOption.SeriesCustom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The first parameter of `renderItem`, including:
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments)
  *
  * Difference between `dataIndex` and `dataIndexInside`:
  *
  * + `dataIndex` is the index of a `dataItem` in the original
  * data.
  * + `dataIndexInside` is the index of a `dataItem` in the
  * current data window (see
  * [dataZoom](https://echarts.apache.org/en/option.html#dataZoom)
  * .
  *
  * [renderItem.arguments.api](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api)
  * uses `dataIndexInside` as the input parameter but not
  * `dataIndex`, because conversion from `dataIndex` to `dataIndexInside`
  * is time-consuming.
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.params
  */
@js.native
trait RenderItemParams extends js.Object {
  
  /**
    * The type of action that trigger this render.
    */
  var actionType: js.UndefOr[String] = js.native
  
  /**
    * An object that developers can store something temporarily here. Life cycle: current round of rendering.
    */
  var context: js.UndefOr[String] = js.native
  
  /**
    * coordSys is variable by different types of coordinate systems.
    */
  var coordSys: js.UndefOr[CoordSys] = js.native
  
  /**
    * The index of this data item.
    */
  var dataIndex: js.UndefOr[Double] = js.native
  
  /**
    * The index of this data item in the current data window (see dataZoom).
    */
  var dataIndexInside: js.UndefOr[Double] = js.native
  
  /**
    * The count of data in the current data window (see dataZoom).
    */
  var dataInsideLength: js.UndefOr[Double] = js.native
  
  /**
    * The id of this series.
    */
  var seriesId: js.UndefOr[String] = js.native
  
  /**
    * The index of this series.
    */
  var seriesIndex: js.UndefOr[Double] = js.native
  
  /**
    * The name of this series.
    */
  var seriesName: js.UndefOr[String] = js.native
}
object RenderItemParams {
  
  @scala.inline
  def apply(): RenderItemParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderItemParams]
  }
  
  @scala.inline
  implicit class RenderItemParamsOps[Self <: RenderItemParams] (val x: Self) extends AnyVal {
    
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
    def setActionType(value: String): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setCoordSys(value: CoordSys): Self = this.set("coordSys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordSys: Self = this.set("coordSys", js.undefined)
    
    @scala.inline
    def setDataIndex(value: Double): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataIndex: Self = this.set("dataIndex", js.undefined)
    
    @scala.inline
    def setDataIndexInside(value: Double): Self = this.set("dataIndexInside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataIndexInside: Self = this.set("dataIndexInside", js.undefined)
    
    @scala.inline
    def setDataInsideLength(value: Double): Self = this.set("dataInsideLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataInsideLength: Self = this.set("dataInsideLength", js.undefined)
    
    @scala.inline
    def setSeriesId(value: String): Self = this.set("seriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesId: Self = this.set("seriesId", js.undefined)
    
    @scala.inline
    def setSeriesIndex(value: Double): Self = this.set("seriesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesIndex: Self = this.set("seriesIndex", js.undefined)
    
    @scala.inline
    def setSeriesName(value: String): Self = this.set("seriesName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesName: Self = this.set("seriesName", js.undefined)
  }
}
