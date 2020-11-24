package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ArgumentFormat
import typings.devextreme.anon.ColorDashStyle
import typings.devextreme.anon.GroupName
import typings.devextreme.anon.Hatching
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.onlyPoint
import typings.devextreme.devextremeStrings.string_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPieChartSeriesTypesCommonPieChartSeries extends js.Object {
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.argumentField]
    */
  var argumentField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.argumentType]
    */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.border]
    */
  var border: js.UndefOr[ColorDashStyle] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.color]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.hoverMode]
    */
  var hoverMode: js.UndefOr[none | onlyPoint] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.hoverStyle]
    */
  var hoverStyle: js.UndefOr[Hatching] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.label]
    */
  var label: js.UndefOr[ArgumentFormat] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.maxLabelCount]
    */
  var maxLabelCount: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.minSegmentSize]
    */
  var minSegmentSize: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.selectionMode]
    */
  var selectionMode: js.UndefOr[none | onlyPoint] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.selectionStyle]
    */
  var selectionStyle: js.UndefOr[Hatching] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.smallValuesGrouping]
    */
  var smallValuesGrouping: js.UndefOr[GroupName] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.tagField]
    */
  var tagField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxPieChartSeriesTypes.CommonPieChartSeries.valueField]
    */
  var valueField: js.UndefOr[String] = js.native
}
object dxPieChartSeriesTypesCommonPieChartSeries {
  
  @scala.inline
  def apply(): dxPieChartSeriesTypesCommonPieChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartSeriesTypesCommonPieChartSeries]
  }
  
  @scala.inline
  implicit class dxPieChartSeriesTypesCommonPieChartSeriesOps[Self <: dxPieChartSeriesTypesCommonPieChartSeries] (val x: Self) extends AnyVal {
    
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
    def setArgumentField(value: String): Self = this.set("argumentField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgumentField: Self = this.set("argumentField", js.undefined)
    
    @scala.inline
    def setArgumentType(value: datetime | numeric | string_): Self = this.set("argumentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgumentType: Self = this.set("argumentType", js.undefined)
    
    @scala.inline
    def setBorder(value: ColorDashStyle): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHoverMode(value: none | onlyPoint): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: Hatching): Self = this.set("hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverStyle: Self = this.set("hoverStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: ArgumentFormat): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMaxLabelCount(value: Double): Self = this.set("maxLabelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLabelCount: Self = this.set("maxLabelCount", js.undefined)
    
    @scala.inline
    def setMinSegmentSize(value: Double): Self = this.set("minSegmentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSegmentSize: Self = this.set("minSegmentSize", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: none | onlyPoint): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: Hatching): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
    
    @scala.inline
    def setSmallValuesGrouping(value: GroupName): Self = this.set("smallValuesGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallValuesGrouping: Self = this.set("smallValuesGrouping", js.undefined)
    
    @scala.inline
    def setTagField(value: String): Self = this.set("tagField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagField: Self = this.set("tagField", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
  }
}
