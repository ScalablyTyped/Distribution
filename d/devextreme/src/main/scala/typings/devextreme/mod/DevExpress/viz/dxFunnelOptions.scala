package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Connector
import typings.devextreme.anon.HoverStyle
import typings.devextreme.anon.KeepLabels
import typings.devextreme.mod.DevExpress.common.SingleMultipleOrNone
import typings.devextreme.mod.DevExpress.common.charts.Palette
import typings.devextreme.mod.DevExpress.common.charts.PaletteExtensionMode
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.viz.dxFunnel.FunnelAlgorithm
import typings.devextreme.mod.DevExpress.viz.dxFunnel.FunnelLabelOverlap
import typings.devextreme.mod.DevExpress.viz.dxFunnel.HoverChangedEvent
import typings.devextreme.mod.DevExpress.viz.dxFunnel.ItemClickEvent
import typings.devextreme.mod.DevExpress.viz.dxFunnel.LegendClickEvent
import typings.devextreme.mod.DevExpress.viz.dxFunnel.SelectionChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFunnelOptions
  extends StObject
     with BaseWidgetOptions[dxFunnel] {
  
  /**
    * Specifies adaptive layout properties.
    */
  var adaptiveLayout: js.UndefOr[KeepLabels] = js.undefined
  
  /**
    * Specifies the algorithm for building the funnel.
    */
  var algorithm: js.UndefOr[FunnelAlgorithm] = js.undefined
  
  /**
    * Specifies which data source field provides arguments for funnel items. The argument identifies a funnel item and represents it on the legend.
    */
  var argumentField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which data source field provides colors for funnel items. If this field is absent, the palette provides the colors.
    */
  var colorField: js.UndefOr[String] = js.undefined
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[(DataSourceLike[Any, Any]) | Null] = js.undefined
  
  /**
    * Specifies whether funnel items change their style when a user pauses on them.
    */
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Turns the funnel upside down.
    */
  var inverted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures funnel items&apos; appearance.
    */
  var item: js.UndefOr[HoverStyle] = js.undefined
  
  /**
    * Configures funnel item labels.
    */
  var label: js.UndefOr[Connector] = js.undefined
  
  /**
    * Configures the legend.
    */
  var legend: js.UndefOr[dxFunnelLegend] = js.undefined
  
  /**
    * Specifies the ratio between the height of the neck and that of the whole funnel. Accepts values from 0 to 1. Applies only if the algorithm is &apos;dynamicHeight&apos;.
    */
  var neckHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the ratio between the width of the neck and that of the whole funnel. Accepts values from 0 to 1. Applies only if the algorithm is &apos;dynamicHeight&apos;.
    */
  var neckWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * A function that is executed after the pointer enters or leaves a funnel item.
    */
  var onHoverChanged: js.UndefOr[js.Function1[/* e */ HoverChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a funnel item is clicked or tapped.
    */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ ItemClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a legend item is clicked or tapped.
    */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ LegendClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a funnel item is selected or selection is canceled.
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ SelectionChangedEvent, Unit]] = js.undefined
  
  /**
    * Sets the palette to be used to colorize funnel items.
    */
  var palette: js.UndefOr[js.Array[String] | Palette] = js.undefined
  
  /**
    * Specifies what to do with colors in the palette when their number is less than the number of funnel items.
    */
  var paletteExtensionMode: js.UndefOr[PaletteExtensionMode] = js.undefined
  
  /**
    * Specifies how item labels should behave when they overlap.
    */
  var resolveLabelOverlapping: js.UndefOr[FunnelLabelOverlap] = js.undefined
  
  /**
    * Specifies whether a single or multiple funnel items can be in the selected state at a time. Assigning &apos;none&apos; disables the selection feature.
    */
  var selectionMode: js.UndefOr[SingleMultipleOrNone] = js.undefined
  
  /**
    * Specifies whether to sort funnel items.
    */
  var sortData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures tooltips - small pop-up rectangles that display information about a data-visualizing UI component element being pressed or hovered over with the mouse pointer.
    */
  @JSName("tooltip")
  var tooltip_dxFunnelOptions: js.UndefOr[dxFunnelTooltip] = js.undefined
  
  /**
    * Specifies which data source field provides values for funnel items. The value defines a funnel item&apos;s area.
    */
  var valueField: js.UndefOr[String] = js.undefined
}
object dxFunnelOptions {
  
  inline def apply(): dxFunnelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFunnelOptions]
  }
  
  extension [Self <: dxFunnelOptions](x: Self) {
    
    inline def setAdaptiveLayout(value: KeepLabels): Self = StObject.set(x, "adaptiveLayout", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveLayoutUndefined: Self = StObject.set(x, "adaptiveLayout", js.undefined)
    
    inline def setAlgorithm(value: FunnelAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setArgumentField(value: String): Self = StObject.set(x, "argumentField", value.asInstanceOf[js.Any])
    
    inline def setArgumentFieldUndefined: Self = StObject.set(x, "argumentField", js.undefined)
    
    inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
    
    inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setHoverEnabled(value: Boolean): Self = StObject.set(x, "hoverEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverEnabledUndefined: Self = StObject.set(x, "hoverEnabled", js.undefined)
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    inline def setItem(value: HoverStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLabel(value: Connector): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLegend(value: dxFunnelLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setNeckHeight(value: Double): Self = StObject.set(x, "neckHeight", value.asInstanceOf[js.Any])
    
    inline def setNeckHeightUndefined: Self = StObject.set(x, "neckHeight", js.undefined)
    
    inline def setNeckWidth(value: Double): Self = StObject.set(x, "neckWidth", value.asInstanceOf[js.Any])
    
    inline def setNeckWidthUndefined: Self = StObject.set(x, "neckWidth", js.undefined)
    
    inline def setOnHoverChanged(value: /* e */ HoverChangedEvent => Unit): Self = StObject.set(x, "onHoverChanged", js.Any.fromFunction1(value))
    
    inline def setOnHoverChangedUndefined: Self = StObject.set(x, "onHoverChanged", js.undefined)
    
    inline def setOnItemClick(value: (js.Function1[/* e */ ItemClickEvent, Unit]) | String): Self = StObject.set(x, "onItemClick", value.asInstanceOf[js.Any])
    
    inline def setOnItemClickFunction1(value: /* e */ ItemClickEvent => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnLegendClick(value: (js.Function1[/* e */ LegendClickEvent, Unit]) | String): Self = StObject.set(x, "onLegendClick", value.asInstanceOf[js.Any])
    
    inline def setOnLegendClickFunction1(value: /* e */ LegendClickEvent => Unit): Self = StObject.set(x, "onLegendClick", js.Any.fromFunction1(value))
    
    inline def setOnLegendClickUndefined: Self = StObject.set(x, "onLegendClick", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ SelectionChangedEvent => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setPalette(value: js.Array[String] | Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionMode(value: PaletteExtensionMode): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setResolveLabelOverlapping(value: FunnelLabelOverlap): Self = StObject.set(x, "resolveLabelOverlapping", value.asInstanceOf[js.Any])
    
    inline def setResolveLabelOverlappingUndefined: Self = StObject.set(x, "resolveLabelOverlapping", js.undefined)
    
    inline def setSelectionMode(value: SingleMultipleOrNone): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSortData(value: Boolean): Self = StObject.set(x, "sortData", value.asInstanceOf[js.Any])
    
    inline def setSortDataUndefined: Self = StObject.set(x, "sortData", js.undefined)
    
    inline def setTooltip(value: dxFunnelTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
  }
}
