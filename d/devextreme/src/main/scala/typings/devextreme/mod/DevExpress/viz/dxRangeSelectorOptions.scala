package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.AggregateByCategory
import typings.devextreme.anon.AllowSlidersSwap
import typings.devextreme.anon.BarGroupPadding
import typings.devextreme.anon.Image
import typings.devextreme.anon.InvalidRangeColor
import typings.devextreme.anon.LeftRight
import typings.devextreme.anon.OpacityWidth
import typings.devextreme.anon.`4`
import typings.devextreme.mod.DevExpress.common.charts.VisualRangeUpdateMode
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.viz.dxRangeSelector.ValueChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxRangeSelectorOptions
  extends StObject
     with BaseWidgetOptions[dxRangeSelector] {
  
  /**
    * Specifies the properties for the range selector&apos;s background.
    */
  var background: js.UndefOr[Image] = js.undefined
  
  /**
    * Specifies the RangeSelector&apos;s behavior properties.
    */
  var behavior: js.UndefOr[AllowSlidersSwap] = js.undefined
  
  /**
    * Specifies the properties required to display a chart as the range selector&apos;s background.
    */
  var chart: js.UndefOr[BarGroupPadding] = js.undefined
  
  /**
    * Specifies the color of the parent page element.
    */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a data source for the scale values and for the chart at the background.
    */
  var dataSource: js.UndefOr[(DataSourceLike[Any, Any]) | Null] = js.undefined
  
  /**
    * Specifies the data source field that provides data for the scale.
    */
  var dataSourceField: js.UndefOr[String] = js.undefined
  
  /**
    * Range selector&apos;s indent properties.
    */
  var indent: js.UndefOr[LeftRight] = js.undefined
  
  /**
    * A function that is executed after the UI component&apos;s value is changed.
    */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ ValueChangedEvent, Unit]] = js.undefined
  
  /**
    * Specifies properties of the range selector&apos;s scale.
    */
  var scale: js.UndefOr[AggregateByCategory] = js.undefined
  
  /**
    * Specifies the color of the selected range.
    */
  var selectedRangeColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how the selected range should behave when data is updated. Applies only when the RangeSelector is bound to a data source.
    */
  var selectedRangeUpdateMode: js.UndefOr[VisualRangeUpdateMode] = js.undefined
  
  /**
    * Specifies range selector shutter properties.
    */
  var shutter: js.UndefOr[`4`] = js.undefined
  
  /**
    * Specifies the appearance of the range selector&apos;s slider handles.
    */
  var sliderHandle: js.UndefOr[OpacityWidth] = js.undefined
  
  /**
    * Defines the properties of the range selector slider markers.
    */
  var sliderMarker: js.UndefOr[InvalidRangeColor] = js.undefined
  
  /**
    * The selected range (initial or current). Equals the entire scale when not set.
    */
  var value: js.UndefOr[(js.Array[Double | String | js.Date]) | VizRange] = js.undefined
}
object dxRangeSelectorOptions {
  
  inline def apply(): dxRangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxRangeSelectorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxRangeSelectorOptions] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Image): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBehavior(value: AllowSlidersSwap): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setChart(value: BarGroupPadding): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    inline def setContainerBackgroundColor(value: String): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceField(value: String): Self = StObject.set(x, "dataSourceField", value.asInstanceOf[js.Any])
    
    inline def setDataSourceFieldUndefined: Self = StObject.set(x, "dataSourceField", js.undefined)
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setIndent(value: LeftRight): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    inline def setOnValueChanged(value: /* e */ ValueChangedEvent => Unit): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnValueChangedUndefined: Self = StObject.set(x, "onValueChanged", js.undefined)
    
    inline def setScale(value: AggregateByCategory): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSelectedRangeColor(value: String): Self = StObject.set(x, "selectedRangeColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedRangeColorUndefined: Self = StObject.set(x, "selectedRangeColor", js.undefined)
    
    inline def setSelectedRangeUpdateMode(value: VisualRangeUpdateMode): Self = StObject.set(x, "selectedRangeUpdateMode", value.asInstanceOf[js.Any])
    
    inline def setSelectedRangeUpdateModeUndefined: Self = StObject.set(x, "selectedRangeUpdateMode", js.undefined)
    
    inline def setShutter(value: `4`): Self = StObject.set(x, "shutter", value.asInstanceOf[js.Any])
    
    inline def setShutterUndefined: Self = StObject.set(x, "shutter", js.undefined)
    
    inline def setSliderHandle(value: OpacityWidth): Self = StObject.set(x, "sliderHandle", value.asInstanceOf[js.Any])
    
    inline def setSliderHandleUndefined: Self = StObject.set(x, "sliderHandle", js.undefined)
    
    inline def setSliderMarker(value: InvalidRangeColor): Self = StObject.set(x, "sliderMarker", value.asInstanceOf[js.Any])
    
    inline def setSliderMarkerUndefined: Self = StObject.set(x, "sliderMarker", js.undefined)
    
    inline def setValue(value: (js.Array[Double | String | js.Date]) | VizRange): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
