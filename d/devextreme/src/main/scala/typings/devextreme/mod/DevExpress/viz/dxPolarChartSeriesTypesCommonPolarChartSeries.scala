package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorDashStyle
import typings.devextreme.anon.DashStyleHatching
import typings.devextreme.anon.EdgeLength
import typings.devextreme.mod.DevExpress.common.charts.DashStyle
import typings.devextreme.mod.DevExpress.common.charts.SeriesHoverMode
import typings.devextreme.mod.DevExpress.common.charts.SeriesSelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartSeriesTypesCommonPolarChartSeries extends StObject {
  
  /**
    * Specifies the data source field that provides arguments for series points.
    */
  var argumentField: js.UndefOr[String] = js.undefined
  
  /**
    * Controls the padding and consequently the angular width of all bars in a series using relative units. Ignored if the barWidth property is set.
    */
  var barPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a fixed angular width for all bars in a series, measured in degrees. Takes precedence over the barPadding property.
    */
  var barWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * An object defining the series border configuration properties.
    */
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  
  /**
    * Specifies whether or not to close the chart by joining the end point with the first point.
    */
  var closed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a series color.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the dash style of the series&apos; line.
    */
  var dashStyle: js.UndefOr[DashStyle] = js.undefined
  
  /**
    * Specifies the series elements to highlight when a series is hovered over.
    */
  var hoverMode: js.UndefOr[SeriesHoverMode] = js.undefined
  
  /**
    * An object defining configuration properties for a hovered series.
    */
  var hoverStyle: js.UndefOr[DashStyleHatching] = js.undefined
  
  /**
    * Specifies whether the series should ignore null data points.
    */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object defining the label configuration properties.
    */
  var label: js.UndefOr[dxPolarChartSeriesTypesCommonPolarChartSeriesLabel] = js.undefined
  
  /**
    * Specifies how many points are acceptable to be in a series to display all labels for these points. Otherwise, the labels will not be displayed.
    */
  var maxLabelCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the minimal length of a displayed bar in pixels.
    */
  var minBarSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies opacity for a series.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * An object defining configuration properties for points in line and area series.
    */
  var point: js.UndefOr[dxPolarChartSeriesTypesCommonPolarChartSeriesPoint] = js.undefined
  
  /**
    * Specifies the series elements to highlight when the series is selected.
    */
  var selectionMode: js.UndefOr[SeriesSelectionMode] = js.undefined
  
  /**
    * An object defining configuration properties for a selected series.
    */
  var selectionStyle: js.UndefOr[DashStyleHatching] = js.undefined
  
  /**
    * Specifies whether or not to show the series in the chart&apos;s legend.
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of the stack where the values of the &apos;stackedBar&apos; series must be located.
    */
  var stack: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the data source field that provides data about a point.
    */
  var tagField: js.UndefOr[String] = js.undefined
  
  /**
    * Configures error bars.
    */
  var valueErrorBar: js.UndefOr[EdgeLength] = js.undefined
  
  /**
    * Specifies the data source field that provides values for series points.
    */
  var valueField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the visibility of a series.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a line width.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object dxPolarChartSeriesTypesCommonPolarChartSeries {
  
  inline def apply(): dxPolarChartSeriesTypesCommonPolarChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesCommonPolarChartSeries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPolarChartSeriesTypesCommonPolarChartSeries] (val x: Self) extends AnyVal {
    
    inline def setArgumentField(value: String): Self = StObject.set(x, "argumentField", value.asInstanceOf[js.Any])
    
    inline def setArgumentFieldUndefined: Self = StObject.set(x, "argumentField", js.undefined)
    
    inline def setBarPadding(value: Double): Self = StObject.set(x, "barPadding", value.asInstanceOf[js.Any])
    
    inline def setBarPaddingUndefined: Self = StObject.set(x, "barPadding", js.undefined)
    
    inline def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
    
    inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
    
    inline def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: DashStyle): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setHoverMode(value: SeriesHoverMode): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setHoverStyle(value: DashStyleHatching): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setIgnoreEmptyPoints(value: Boolean): Self = StObject.set(x, "ignoreEmptyPoints", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyPointsUndefined: Self = StObject.set(x, "ignoreEmptyPoints", js.undefined)
    
    inline def setLabel(value: dxPolarChartSeriesTypesCommonPolarChartSeriesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxLabelCount(value: Double): Self = StObject.set(x, "maxLabelCount", value.asInstanceOf[js.Any])
    
    inline def setMaxLabelCountUndefined: Self = StObject.set(x, "maxLabelCount", js.undefined)
    
    inline def setMinBarSize(value: Double): Self = StObject.set(x, "minBarSize", value.asInstanceOf[js.Any])
    
    inline def setMinBarSizeUndefined: Self = StObject.set(x, "minBarSize", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPoint(value: dxPolarChartSeriesTypesCommonPolarChartSeriesPoint): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setSelectionMode(value: SeriesSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionStyle(value: DashStyleHatching): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
    
    inline def setShowInLegend(value: Boolean): Self = StObject.set(x, "showInLegend", value.asInstanceOf[js.Any])
    
    inline def setShowInLegendUndefined: Self = StObject.set(x, "showInLegend", js.undefined)
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setTagField(value: String): Self = StObject.set(x, "tagField", value.asInstanceOf[js.Any])
    
    inline def setTagFieldUndefined: Self = StObject.set(x, "tagField", js.undefined)
    
    inline def setValueErrorBar(value: EdgeLength): Self = StObject.set(x, "valueErrorBar", value.asInstanceOf[js.Any])
    
    inline def setValueErrorBarUndefined: Self = StObject.set(x, "valueErrorBar", js.undefined)
    
    inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
