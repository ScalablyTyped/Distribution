package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorLevel
import typings.devextreme.anon.EdgeLength
import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.CommonSeries]
  */
@js.native
trait dxChartSeriesTypesCommonSeries extends js.Object {
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.aggregation]
    */
  var aggregation: js.UndefOr[dxChartSeriesTypesCommonSeriesAggregation] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.argumentField]
    */
  var argumentField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.axis]
    */
  var axis: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.barOverlapGroup]
    */
  var barOverlapGroup: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.barPadding]
    */
  var barPadding: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.barWidth]
    */
  var barWidth: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.border]
    */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesBorder] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.closeValueField]
    */
  var closeValueField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.color]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.cornerRadius]
    */
  var cornerRadius: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.dashStyle]
    */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.highValueField]
    */
  var highValueField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.hoverMode]
    */
  var hoverMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint
  ] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.hoverStyle]
    */
  var hoverStyle: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyle] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.ignoreEmptyPoints]
    */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.innerColor]
    */
  var innerColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label]
    */
  var label: js.UndefOr[dxChartSeriesTypesCommonSeriesLabel] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.lowValueField]
    */
  var lowValueField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.maxLabelCount]
    */
  var maxLabelCount: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.minBarSize]
    */
  var minBarSize: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.opacity]
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.openValueField]
    */
  var openValueField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.pane]
    */
  var pane: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.point]
    */
  var point: js.UndefOr[dxChartSeriesTypesCommonSeriesPoint] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.rangeValue1Field]
    */
  var rangeValue1Field: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.rangeValue2Field]
    */
  var rangeValue2Field: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.reduction]
    */
  var reduction: js.UndefOr[ColorLevel] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.selectionMode]
    */
  var selectionMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint
  ] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.selectionStyle]
    */
  var selectionStyle: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyle] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.showInLegend]
    */
  var showInLegend: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.sizeField]
    */
  var sizeField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.stack]
    */
  var stack: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.tagField]
    */
  var tagField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.valueErrorBar]
    */
  var valueErrorBar: js.UndefOr[EdgeLength] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.valueField]
    */
  var valueField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.visible]
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.width]
    */
  var width: js.UndefOr[Double] = js.native
}
object dxChartSeriesTypesCommonSeries {
  
  @scala.inline
  def apply(): dxChartSeriesTypesCommonSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeries]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesCommonSeriesOps[Self <: dxChartSeriesTypesCommonSeries] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: dxChartSeriesTypesCommonSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    
    @scala.inline
    def setArgumentField(value: String): Self = this.set("argumentField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgumentField: Self = this.set("argumentField", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setBarOverlapGroup(value: String): Self = this.set("barOverlapGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarOverlapGroup: Self = this.set("barOverlapGroup", js.undefined)
    
    @scala.inline
    def setBarPadding(value: Double): Self = this.set("barPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarPadding: Self = this.set("barPadding", js.undefined)
    
    @scala.inline
    def setBarWidth(value: Double): Self = this.set("barWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarWidth: Self = this.set("barWidth", js.undefined)
    
    @scala.inline
    def setBorder(value: dxChartSeriesTypesCommonSeriesBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setCloseValueField(value: String): Self = this.set("closeValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseValueField: Self = this.set("closeValueField", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setDashStyle(value: dash | dot | longDash | solid): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    
    @scala.inline
    def setHighValueField(value: String): Self = this.set("highValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighValueField: Self = this.set("highValueField", js.undefined)
    
    @scala.inline
    def setHoverMode(
      value: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint
    ): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: dxChartSeriesTypesCommonSeriesHoverStyle): Self = this.set("hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverStyle: Self = this.set("hoverStyle", js.undefined)
    
    @scala.inline
    def setIgnoreEmptyPoints(value: Boolean): Self = this.set("ignoreEmptyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEmptyPoints: Self = this.set("ignoreEmptyPoints", js.undefined)
    
    @scala.inline
    def setInnerColor(value: String): Self = this.set("innerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerColor: Self = this.set("innerColor", js.undefined)
    
    @scala.inline
    def setLabel(value: dxChartSeriesTypesCommonSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLowValueField(value: String): Self = this.set("lowValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowValueField: Self = this.set("lowValueField", js.undefined)
    
    @scala.inline
    def setMaxLabelCount(value: Double): Self = this.set("maxLabelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLabelCount: Self = this.set("maxLabelCount", js.undefined)
    
    @scala.inline
    def setMinBarSize(value: Double): Self = this.set("minBarSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinBarSize: Self = this.set("minBarSize", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOpenValueField(value: String): Self = this.set("openValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenValueField: Self = this.set("openValueField", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    
    @scala.inline
    def setPoint(value: dxChartSeriesTypesCommonSeriesPoint): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    
    @scala.inline
    def setRangeValue1Field(value: String): Self = this.set("rangeValue1Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeValue1Field: Self = this.set("rangeValue1Field", js.undefined)
    
    @scala.inline
    def setRangeValue2Field(value: String): Self = this.set("rangeValue2Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeValue2Field: Self = this.set("rangeValue2Field", js.undefined)
    
    @scala.inline
    def setReduction(value: ColorLevel): Self = this.set("reduction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReduction: Self = this.set("reduction", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: dxChartSeriesTypesCommonSeriesSelectionStyle): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
    
    @scala.inline
    def setShowInLegend(value: Boolean): Self = this.set("showInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInLegend: Self = this.set("showInLegend", js.undefined)
    
    @scala.inline
    def setSizeField(value: String): Self = this.set("sizeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeField: Self = this.set("sizeField", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setTagField(value: String): Self = this.set("tagField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagField: Self = this.set("tagField", js.undefined)
    
    @scala.inline
    def setValueErrorBar(value: EdgeLength): Self = this.set("valueErrorBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueErrorBar: Self = this.set("valueErrorBar", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
