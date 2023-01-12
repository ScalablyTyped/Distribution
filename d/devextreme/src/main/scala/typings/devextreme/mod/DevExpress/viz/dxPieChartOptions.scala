package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.NameField
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.viz.dxPieChart.LegendClickEvent
import typings.devextreme.mod.DevExpress.viz.dxPieChart.PieChartLabelOverlap
import typings.devextreme.mod.DevExpress.viz.dxPieChart.PieChartSegmentDirection
import typings.devextreme.mod.DevExpress.viz.dxPieChart.PieChartType
import typings.std.SVGElement
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPieChartOptions
  extends StObject
     with BaseChartOptions[dxPieChart] {
  
  /**
    * Specifies adaptive layout properties.
    */
  @JSName("adaptiveLayout")
  var adaptiveLayout_dxPieChartOptions: js.UndefOr[dxPieChartAdaptiveLayout] = js.undefined
  
  /**
    * Specifies the annotation collection.
    */
  var annotations: js.UndefOr[js.Array[dxPieChartAnnotationConfig | Any]] = js.undefined
  
  /**
    * Specifies a custom template for content in the pie&apos;s center.
    */
  var centerTemplate: js.UndefOr[
    template | (js.Function2[
      /* component */ dxPieChart, 
      /* element */ SVGGElement, 
      String | UserDefinedElement[SVGElement]
    ])
  ] = js.undefined
  
  /**
    * Specifies settings common for all annotations in the PieChart.
    */
  var commonAnnotationSettings: js.UndefOr[dxPieChartCommonAnnotationConfig] = js.undefined
  
  /**
    * An object defining the configuration properties that are common for all series of the PieChart UI component.
    */
  var commonSeriesSettings: js.UndefOr[Any] = js.undefined
  
  /**
    * Customizes an individual annotation.
    */
  var customizeAnnotation: js.UndefOr[
    js.Function1[/* annotation */ dxPieChartAnnotationConfig | Any, dxPieChartAnnotationConfig]
  ] = js.undefined
  
  /**
    * Specifies the diameter of the pie.
    */
  var diameter: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the fraction of the inner radius relative to the total radius in the series of the &apos;doughnut&apos; type. The value should be between 0 and 1.
    */
  var innerRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies PieChart legend properties.
    */
  @JSName("legend")
  var legend_dxPieChartOptions: js.UndefOr[dxPieChartLegend] = js.undefined
  
  /**
    * Specifies the minimum diameter of the pie.
    */
  var minDiameter: js.UndefOr[Double] = js.undefined
  
  /**
    * A function that is executed when a legend item is clicked or tapped.
    */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ LegendClickEvent, Unit]) | String] = js.undefined
  
  /**
    * Specifies how a chart must behave when point labels overlap.
    */
  var resolveLabelOverlapping: js.UndefOr[PieChartLabelOverlap] = js.undefined
  
  /**
    * Specifies the direction that the pie chart segments will occupy.
    */
  var segmentsDirection: js.UndefOr[PieChartSegmentDirection] = js.undefined
  
  /**
    * Defines properties for the series template.
    */
  var seriesTemplate: js.UndefOr[NameField] = js.undefined
  
  /**
    * Specifies properties for the series of the PieChart UI component.
    */
  @JSName("series")
  var series_dxPieChartOptions: js.UndefOr[PieChartSeries | js.Array[PieChartSeries]] = js.undefined
  
  /**
    * Allows you to display several adjoining pies in the same size.
    */
  var sizeGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the angle in arc degrees from which the first segment of a pie chart should start.
    */
  var startAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the type of the pie chart series.
    */
  var `type`: js.UndefOr[PieChartType] = js.undefined
}
object dxPieChartOptions {
  
  inline def apply(): dxPieChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPieChartOptions] (val x: Self) extends AnyVal {
    
    inline def setAdaptiveLayout(value: dxPieChartAdaptiveLayout): Self = StObject.set(x, "adaptiveLayout", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveLayoutUndefined: Self = StObject.set(x, "adaptiveLayout", js.undefined)
    
    inline def setAnnotations(value: js.Array[dxPieChartAnnotationConfig | Any]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: (dxPieChartAnnotationConfig | Any)*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setCenterTemplate(
      value: template | (js.Function2[
          /* component */ dxPieChart, 
          /* element */ SVGGElement, 
          String | UserDefinedElement[SVGElement]
        ])
    ): Self = StObject.set(x, "centerTemplate", value.asInstanceOf[js.Any])
    
    inline def setCenterTemplateFunction2(
      value: (/* component */ dxPieChart, /* element */ SVGGElement) => String | UserDefinedElement[SVGElement]
    ): Self = StObject.set(x, "centerTemplate", js.Any.fromFunction2(value))
    
    inline def setCenterTemplateUndefined: Self = StObject.set(x, "centerTemplate", js.undefined)
    
    inline def setCommonAnnotationSettings(value: dxPieChartCommonAnnotationConfig): Self = StObject.set(x, "commonAnnotationSettings", value.asInstanceOf[js.Any])
    
    inline def setCommonAnnotationSettingsUndefined: Self = StObject.set(x, "commonAnnotationSettings", js.undefined)
    
    inline def setCommonSeriesSettings(value: Any): Self = StObject.set(x, "commonSeriesSettings", value.asInstanceOf[js.Any])
    
    inline def setCommonSeriesSettingsUndefined: Self = StObject.set(x, "commonSeriesSettings", js.undefined)
    
    inline def setCustomizeAnnotation(value: /* annotation */ dxPieChartAnnotationConfig | Any => dxPieChartAnnotationConfig): Self = StObject.set(x, "customizeAnnotation", js.Any.fromFunction1(value))
    
    inline def setCustomizeAnnotationUndefined: Self = StObject.set(x, "customizeAnnotation", js.undefined)
    
    inline def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    inline def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setLegend(value: dxPieChartLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setMinDiameter(value: Double): Self = StObject.set(x, "minDiameter", value.asInstanceOf[js.Any])
    
    inline def setMinDiameterUndefined: Self = StObject.set(x, "minDiameter", js.undefined)
    
    inline def setOnLegendClick(value: (js.Function1[/* e */ LegendClickEvent, Unit]) | String): Self = StObject.set(x, "onLegendClick", value.asInstanceOf[js.Any])
    
    inline def setOnLegendClickFunction1(value: /* e */ LegendClickEvent => Unit): Self = StObject.set(x, "onLegendClick", js.Any.fromFunction1(value))
    
    inline def setOnLegendClickUndefined: Self = StObject.set(x, "onLegendClick", js.undefined)
    
    inline def setResolveLabelOverlapping(value: PieChartLabelOverlap): Self = StObject.set(x, "resolveLabelOverlapping", value.asInstanceOf[js.Any])
    
    inline def setResolveLabelOverlappingUndefined: Self = StObject.set(x, "resolveLabelOverlapping", js.undefined)
    
    inline def setSegmentsDirection(value: PieChartSegmentDirection): Self = StObject.set(x, "segmentsDirection", value.asInstanceOf[js.Any])
    
    inline def setSegmentsDirectionUndefined: Self = StObject.set(x, "segmentsDirection", js.undefined)
    
    inline def setSeries(value: PieChartSeries | js.Array[PieChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesTemplate(value: NameField): Self = StObject.set(x, "seriesTemplate", value.asInstanceOf[js.Any])
    
    inline def setSeriesTemplateUndefined: Self = StObject.set(x, "seriesTemplate", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: PieChartSeries*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setSizeGroup(value: String): Self = StObject.set(x, "sizeGroup", value.asInstanceOf[js.Any])
    
    inline def setSizeGroupUndefined: Self = StObject.set(x, "sizeGroup", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setType(value: PieChartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
