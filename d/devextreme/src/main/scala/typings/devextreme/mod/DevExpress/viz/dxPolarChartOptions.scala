package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Argument
import typings.devextreme.anon.ConvertToAxisDataType
import typings.devextreme.anon.CustomizeSeriesNameField
import typings.devextreme.mod.DevExpress.common.SingleOrMultiple
import typings.devextreme.mod.DevExpress.common.charts.LabelOverlap
import typings.devextreme.mod.DevExpress.viz.dxPolarChart.LegendClickEvent
import typings.devextreme.mod.DevExpress.viz.dxPolarChart.SeriesClickEvent
import typings.devextreme.mod.DevExpress.viz.dxPolarChart.SeriesHoverChangedEvent
import typings.devextreme.mod.DevExpress.viz.dxPolarChart.SeriesSelectionChangedEvent
import typings.devextreme.mod.DevExpress.viz.dxPolarChart.ZoomEndEvent
import typings.devextreme.mod.DevExpress.viz.dxPolarChart.ZoomStartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartOptions
  extends StObject
     with BaseChartOptions[dxPolarChart] {
  
  /**
    * Specifies adaptive layout properties.
    */
  @JSName("adaptiveLayout")
  var adaptiveLayout_dxPolarChartOptions: js.UndefOr[dxPolarChartAdaptiveLayout] = js.undefined
  
  /**
    * Specifies the annotation collection.
    */
  var annotations: js.UndefOr[js.Array[dxPolarChartAnnotationConfig | Any]] = js.undefined
  
  /**
    * Specifies argument axis properties for the PolarChart UI component.
    */
  var argumentAxis: js.UndefOr[dxPolarChartArgumentAxis] = js.undefined
  
  /**
    * Controls the padding and consequently the angular width of a group of bars with the same argument using relative units. Ignored if the barGroupWidth property is set.
    */
  var barGroupPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a fixed angular width for groups of bars with the same argument, measured in degrees. Takes precedence over the barGroupPadding property.
    */
  var barGroupWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies settings common for all annotations in the PolarChart.
    */
  var commonAnnotationSettings: js.UndefOr[dxPolarChartCommonAnnotationConfig] = js.undefined
  
  /**
    * An object defining the configuration properties that are common for all axes of the PolarChart UI component.
    */
  var commonAxisSettings: js.UndefOr[dxPolarChartCommonAxisSettings] = js.undefined
  
  /**
    * An object defining the configuration properties that are common for all series of the PolarChart UI component.
    */
  var commonSeriesSettings: js.UndefOr[dxPolarChartCommonSeriesSettings] = js.undefined
  
  /**
    * Specifies the color of the parent page element.
    */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Customizes an individual annotation.
    */
  var customizeAnnotation: js.UndefOr[
    js.Function1[/* annotation */ dxPolarChartAnnotationConfig | Any, dxPolarChartAnnotationConfig]
  ] = js.undefined
  
  /**
    * An object providing properties for managing data from a data source.
    */
  var dataPrepareSettings: js.UndefOr[ConvertToAxisDataType] = js.undefined
  
  /**
    * Specifies the properties of a chart&apos;s legend.
    */
  @JSName("legend")
  var legend_dxPolarChartOptions: js.UndefOr[dxPolarChartLegend] = js.undefined
  
  /**
    * Forces the UI component to treat negative values as zeroes. Applies to stacked-like series only.
    */
  var negativesAsZeroes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that is executed when a label on the argument axis is clicked or tapped.
    */
  var onArgumentAxisClick: js.UndefOr[(js.Function1[/* e */ Argument, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a legend item is clicked or tapped.
    */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ LegendClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a series is clicked or tapped.
    */
  var onSeriesClick: js.UndefOr[(js.Function1[/* e */ SeriesClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed after the pointer enters or leaves a series.
    */
  var onSeriesHoverChanged: js.UndefOr[js.Function1[/* e */ SeriesHoverChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a series is selected or selection is canceled.
    */
  var onSeriesSelectionChanged: js.UndefOr[js.Function1[/* e */ SeriesSelectionChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when zooming or panning ends.
    */
  var onZoomEnd: js.UndefOr[js.Function1[/* e */ ZoomEndEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when zooming or panning begins.
    */
  var onZoomStart: js.UndefOr[js.Function1[/* e */ ZoomStartEvent, Unit]] = js.undefined
  
  /**
    * Specifies how the chart must behave when series point labels overlap.
    */
  var resolveLabelOverlapping: js.UndefOr[LabelOverlap] = js.undefined
  
  /**
    * Specifies whether a single series or multiple series can be selected in the chart.
    */
  var seriesSelectionMode: js.UndefOr[SingleOrMultiple] = js.undefined
  
  /**
    * Defines properties for the series template.
    */
  var seriesTemplate: js.UndefOr[CustomizeSeriesNameField] = js.undefined
  
  /**
    * Specifies properties for PolarChart UI component series.
    */
  @JSName("series")
  var series_dxPolarChartOptions: js.UndefOr[PolarChartSeries | js.Array[PolarChartSeries]] = js.undefined
  
  /**
    * Configures tooltips.
    */
  @JSName("tooltip")
  var tooltip_dxPolarChartOptions: js.UndefOr[dxPolarChartTooltip] = js.undefined
  
  /**
    * Indicates whether or not to display a &apos;spider web&apos;.
    */
  var useSpiderWeb: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies value axis properties for the PolarChart UI component.
    */
  var valueAxis: js.UndefOr[dxPolarChartValueAxis] = js.undefined
}
object dxPolarChartOptions {
  
  inline def apply(): dxPolarChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPolarChartOptions] (val x: Self) extends AnyVal {
    
    inline def setAdaptiveLayout(value: dxPolarChartAdaptiveLayout): Self = StObject.set(x, "adaptiveLayout", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveLayoutUndefined: Self = StObject.set(x, "adaptiveLayout", js.undefined)
    
    inline def setAnnotations(value: js.Array[dxPolarChartAnnotationConfig | Any]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: (dxPolarChartAnnotationConfig | Any)*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setArgumentAxis(value: dxPolarChartArgumentAxis): Self = StObject.set(x, "argumentAxis", value.asInstanceOf[js.Any])
    
    inline def setArgumentAxisUndefined: Self = StObject.set(x, "argumentAxis", js.undefined)
    
    inline def setBarGroupPadding(value: Double): Self = StObject.set(x, "barGroupPadding", value.asInstanceOf[js.Any])
    
    inline def setBarGroupPaddingUndefined: Self = StObject.set(x, "barGroupPadding", js.undefined)
    
    inline def setBarGroupWidth(value: Double): Self = StObject.set(x, "barGroupWidth", value.asInstanceOf[js.Any])
    
    inline def setBarGroupWidthUndefined: Self = StObject.set(x, "barGroupWidth", js.undefined)
    
    inline def setCommonAnnotationSettings(value: dxPolarChartCommonAnnotationConfig): Self = StObject.set(x, "commonAnnotationSettings", value.asInstanceOf[js.Any])
    
    inline def setCommonAnnotationSettingsUndefined: Self = StObject.set(x, "commonAnnotationSettings", js.undefined)
    
    inline def setCommonAxisSettings(value: dxPolarChartCommonAxisSettings): Self = StObject.set(x, "commonAxisSettings", value.asInstanceOf[js.Any])
    
    inline def setCommonAxisSettingsUndefined: Self = StObject.set(x, "commonAxisSettings", js.undefined)
    
    inline def setCommonSeriesSettings(value: dxPolarChartCommonSeriesSettings): Self = StObject.set(x, "commonSeriesSettings", value.asInstanceOf[js.Any])
    
    inline def setCommonSeriesSettingsUndefined: Self = StObject.set(x, "commonSeriesSettings", js.undefined)
    
    inline def setContainerBackgroundColor(value: String): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    inline def setCustomizeAnnotation(value: /* annotation */ dxPolarChartAnnotationConfig | Any => dxPolarChartAnnotationConfig): Self = StObject.set(x, "customizeAnnotation", js.Any.fromFunction1(value))
    
    inline def setCustomizeAnnotationUndefined: Self = StObject.set(x, "customizeAnnotation", js.undefined)
    
    inline def setDataPrepareSettings(value: ConvertToAxisDataType): Self = StObject.set(x, "dataPrepareSettings", value.asInstanceOf[js.Any])
    
    inline def setDataPrepareSettingsUndefined: Self = StObject.set(x, "dataPrepareSettings", js.undefined)
    
    inline def setLegend(value: dxPolarChartLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setNegativesAsZeroes(value: Boolean): Self = StObject.set(x, "negativesAsZeroes", value.asInstanceOf[js.Any])
    
    inline def setNegativesAsZeroesUndefined: Self = StObject.set(x, "negativesAsZeroes", js.undefined)
    
    inline def setOnArgumentAxisClick(value: (js.Function1[/* e */ Argument, Unit]) | String): Self = StObject.set(x, "onArgumentAxisClick", value.asInstanceOf[js.Any])
    
    inline def setOnArgumentAxisClickFunction1(value: /* e */ Argument => Unit): Self = StObject.set(x, "onArgumentAxisClick", js.Any.fromFunction1(value))
    
    inline def setOnArgumentAxisClickUndefined: Self = StObject.set(x, "onArgumentAxisClick", js.undefined)
    
    inline def setOnLegendClick(value: (js.Function1[/* e */ LegendClickEvent, Unit]) | String): Self = StObject.set(x, "onLegendClick", value.asInstanceOf[js.Any])
    
    inline def setOnLegendClickFunction1(value: /* e */ LegendClickEvent => Unit): Self = StObject.set(x, "onLegendClick", js.Any.fromFunction1(value))
    
    inline def setOnLegendClickUndefined: Self = StObject.set(x, "onLegendClick", js.undefined)
    
    inline def setOnSeriesClick(value: (js.Function1[/* e */ SeriesClickEvent, Unit]) | String): Self = StObject.set(x, "onSeriesClick", value.asInstanceOf[js.Any])
    
    inline def setOnSeriesClickFunction1(value: /* e */ SeriesClickEvent => Unit): Self = StObject.set(x, "onSeriesClick", js.Any.fromFunction1(value))
    
    inline def setOnSeriesClickUndefined: Self = StObject.set(x, "onSeriesClick", js.undefined)
    
    inline def setOnSeriesHoverChanged(value: /* e */ SeriesHoverChangedEvent => Unit): Self = StObject.set(x, "onSeriesHoverChanged", js.Any.fromFunction1(value))
    
    inline def setOnSeriesHoverChangedUndefined: Self = StObject.set(x, "onSeriesHoverChanged", js.undefined)
    
    inline def setOnSeriesSelectionChanged(value: /* e */ SeriesSelectionChangedEvent => Unit): Self = StObject.set(x, "onSeriesSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSeriesSelectionChangedUndefined: Self = StObject.set(x, "onSeriesSelectionChanged", js.undefined)
    
    inline def setOnZoomEnd(value: /* e */ ZoomEndEvent => Unit): Self = StObject.set(x, "onZoomEnd", js.Any.fromFunction1(value))
    
    inline def setOnZoomEndUndefined: Self = StObject.set(x, "onZoomEnd", js.undefined)
    
    inline def setOnZoomStart(value: /* e */ ZoomStartEvent => Unit): Self = StObject.set(x, "onZoomStart", js.Any.fromFunction1(value))
    
    inline def setOnZoomStartUndefined: Self = StObject.set(x, "onZoomStart", js.undefined)
    
    inline def setResolveLabelOverlapping(value: LabelOverlap): Self = StObject.set(x, "resolveLabelOverlapping", value.asInstanceOf[js.Any])
    
    inline def setResolveLabelOverlappingUndefined: Self = StObject.set(x, "resolveLabelOverlapping", js.undefined)
    
    inline def setSeries(value: PolarChartSeries | js.Array[PolarChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesSelectionMode(value: SingleOrMultiple): Self = StObject.set(x, "seriesSelectionMode", value.asInstanceOf[js.Any])
    
    inline def setSeriesSelectionModeUndefined: Self = StObject.set(x, "seriesSelectionMode", js.undefined)
    
    inline def setSeriesTemplate(value: CustomizeSeriesNameField): Self = StObject.set(x, "seriesTemplate", value.asInstanceOf[js.Any])
    
    inline def setSeriesTemplateUndefined: Self = StObject.set(x, "seriesTemplate", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: PolarChartSeries*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setTooltip(value: dxPolarChartTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setUseSpiderWeb(value: Boolean): Self = StObject.set(x, "useSpiderWeb", value.asInstanceOf[js.Any])
    
    inline def setUseSpiderWebUndefined: Self = StObject.set(x, "useSpiderWeb", js.undefined)
    
    inline def setValueAxis(value: dxPolarChartValueAxis): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
  }
}
