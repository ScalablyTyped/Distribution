package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a specific test point within a chart control, on the client side.
  */
@js.native
trait ASPxClientWebChartHitInfo extends StObject {
  
  /**
    * Gets the client-side annotation instance from under the test point.
    */
  var annotation: ASPxClientAnnotation = js.native
  
  /**
    * Gets the client-side axis instance from under the test point.
    */
  var axis: ASPxClientAxisBase = js.native
  
  /**
    * Gets the client-side axis label item instance from under the test point.
    */
  var axisLabelItem: ASPxClientAxisLabelItem = js.native
  
  /**
    * Gets the client-side axis title instance from under the test point.
    */
  var axisTitle: ASPxClientAxisTitle = js.native
  
  /**
    * Gets the client-side chart instance from under the test point.
    */
  var chart: ASPxClientWebChart = js.native
  
  /**
    * Gets the client-side chart title instance from under the test point.
    */
  var chartTitle: ASPxClientChartTitle = js.native
  
  /**
    * Gets the client-side constant line instance from under the test point.
    */
  var constantLine: ASPxClientConstantLine = js.native
  
  /**
    * Gets a custom legend item which is located under the test point.
    */
  var customLegendItem: ASPxClientCustomLegendItem = js.native
  
  /**
    * Gets the client-side diagram instance from under the test point.
    */
  var diagram: ASPxClientXYDiagramBase = js.native
  
  /** @deprecated This property is now obsolete. Use the indicator property instead. */
  /**
    * Gets the client-side Fibonacci indicator instance from under the test point.
    */
  var fibonacciIndicator: ASPxClientFibonacciIndicator = js.native
  
  /**
    * Returns a hyperlink which is located under the test point.
    */
  var hyperlink: String = js.native
  
  /**
    * Gets a value indicating whether the test point is within an annotation.
    */
  var inAnnotation: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the axis.
    */
  var inAxis: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the axis label item.
    */
  var inAxisLabelItem: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the axis title.
    */
  var inAxisTitle: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the chart.
    */
  var inChart: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the chart title.
    */
  var inChartTitle: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the constant line.
    */
  var inConstantLine: Boolean = js.native
  
  /**
    * Gets the value indicating whether or not the test point is within a custom legend item.
    */
  var inCustomLegendItem: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the diagram.
    */
  var inDiagram: Boolean = js.native
  
  /** @deprecated This property is now obsolete. Use the inIndicator property instead. */
  /**
    * Gets a value indicating whether the test point is within the Fibonacci Indicator.
    */
  var inFibonacciIndicator: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within a hyperlink.
    */
  var inHyperlink: Boolean = js.native
  
  /**
    * Gets a value specifying whether the test point is within an indicator.
    */
  var inIndicator: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the legend.
    */
  var inLegend: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the non-default pane.
    */
  var inNonDefaultPane: Boolean = js.native
  
  /**
    * Returns the value that indicates whether the test point is within the pane title.
    */
  var inPaneTitle: Boolean = js.native
  
  /** @deprecated This property is now obsolete. Use the inIndicator property instead. */
  /**
    * Gets a value indicating whether the test point is within the regression line.
    */
  var inRegressionLine: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the series.
    */
  var inSeries: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the series label.
    */
  var inSeriesLabel: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the series point.
    */
  var inSeriesPoint: Boolean = js.native
  
  /**
    * Gets a value indicating whether the test point is within the series title.
    */
  var inSeriesTitle: Boolean = js.native
  
  /** @deprecated This property is now obsolete. Use the inIndicator property instead. */
  /**
    * Gets a value indicating whether the test point is within the trendline.
    */
  var inTrendLine: Boolean = js.native
  
  /**
    * Gets the client-side indicator instance from under the test point.
    */
  var indicator: ASPxClientIndicator = js.native
  
  /**
    * Gets the client-side legend instance from under the test point.
    */
  var legend: ASPxClientLegend = js.native
  
  /**
    * Gets the client-side non-default pane instance from under the test point.
    */
  var nonDefaultPane: ASPxClientXYDiagramPane = js.native
  
  /**
    * Gets the client-side pane title instance from under the test point.
    */
  var paneTitle: ASPxClientPaneTitle = js.native
  
  /** @deprecated This property is now obsolete. Use the indicator property instead. */
  /**
    * Gets the client-side regression line instance from under the test point.
    */
  var regressionLine: ASPxClientRegressionLine = js.native
  
  /**
    * Gets the client-side series instance from under the test point.
    */
  var series: ASPxClientSeries = js.native
  
  /**
    * Gets the client-side series label instance from under the test point.
    */
  var seriesLabel: ASPxClientSeriesLabel = js.native
  
  /**
    * Gets the client-side series point instance from under the test point.
    */
  var seriesPoint: ASPxClientSeriesPoint = js.native
  
  /**
    * Gets the client-side series title instance from under the test point.
    */
  var seriesTitle: ASPxClientSeriesTitle = js.native
  
  /** @deprecated This property is now obsolete. Use the indicator property instead. */
  /**
    * Gets the client-side trendline instance from under the test point.
    */
  var trendLine: ASPxClientTrendLine = js.native
}
object ASPxClientWebChartHitInfo {
  
  @scala.inline
  def apply(
    annotation: ASPxClientAnnotation,
    axis: ASPxClientAxisBase,
    axisLabelItem: ASPxClientAxisLabelItem,
    axisTitle: ASPxClientAxisTitle,
    chart: ASPxClientWebChart,
    chartTitle: ASPxClientChartTitle,
    constantLine: ASPxClientConstantLine,
    customLegendItem: ASPxClientCustomLegendItem,
    diagram: ASPxClientXYDiagramBase,
    fibonacciIndicator: ASPxClientFibonacciIndicator,
    hyperlink: String,
    inAnnotation: Boolean,
    inAxis: Boolean,
    inAxisLabelItem: Boolean,
    inAxisTitle: Boolean,
    inChart: Boolean,
    inChartTitle: Boolean,
    inConstantLine: Boolean,
    inCustomLegendItem: Boolean,
    inDiagram: Boolean,
    inFibonacciIndicator: Boolean,
    inHyperlink: Boolean,
    inIndicator: Boolean,
    inLegend: Boolean,
    inNonDefaultPane: Boolean,
    inPaneTitle: Boolean,
    inRegressionLine: Boolean,
    inSeries: Boolean,
    inSeriesLabel: Boolean,
    inSeriesPoint: Boolean,
    inSeriesTitle: Boolean,
    inTrendLine: Boolean,
    indicator: ASPxClientIndicator,
    legend: ASPxClientLegend,
    nonDefaultPane: ASPxClientXYDiagramPane,
    paneTitle: ASPxClientPaneTitle,
    regressionLine: ASPxClientRegressionLine,
    series: ASPxClientSeries,
    seriesLabel: ASPxClientSeriesLabel,
    seriesPoint: ASPxClientSeriesPoint,
    seriesTitle: ASPxClientSeriesTitle,
    trendLine: ASPxClientTrendLine
  ): ASPxClientWebChartHitInfo = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], axisLabelItem = axisLabelItem.asInstanceOf[js.Any], axisTitle = axisTitle.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], chartTitle = chartTitle.asInstanceOf[js.Any], constantLine = constantLine.asInstanceOf[js.Any], customLegendItem = customLegendItem.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], fibonacciIndicator = fibonacciIndicator.asInstanceOf[js.Any], hyperlink = hyperlink.asInstanceOf[js.Any], inAnnotation = inAnnotation.asInstanceOf[js.Any], inAxis = inAxis.asInstanceOf[js.Any], inAxisLabelItem = inAxisLabelItem.asInstanceOf[js.Any], inAxisTitle = inAxisTitle.asInstanceOf[js.Any], inChart = inChart.asInstanceOf[js.Any], inChartTitle = inChartTitle.asInstanceOf[js.Any], inConstantLine = inConstantLine.asInstanceOf[js.Any], inCustomLegendItem = inCustomLegendItem.asInstanceOf[js.Any], inDiagram = inDiagram.asInstanceOf[js.Any], inFibonacciIndicator = inFibonacciIndicator.asInstanceOf[js.Any], inHyperlink = inHyperlink.asInstanceOf[js.Any], inIndicator = inIndicator.asInstanceOf[js.Any], inLegend = inLegend.asInstanceOf[js.Any], inNonDefaultPane = inNonDefaultPane.asInstanceOf[js.Any], inPaneTitle = inPaneTitle.asInstanceOf[js.Any], inRegressionLine = inRegressionLine.asInstanceOf[js.Any], inSeries = inSeries.asInstanceOf[js.Any], inSeriesLabel = inSeriesLabel.asInstanceOf[js.Any], inSeriesPoint = inSeriesPoint.asInstanceOf[js.Any], inSeriesTitle = inSeriesTitle.asInstanceOf[js.Any], inTrendLine = inTrendLine.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], nonDefaultPane = nonDefaultPane.asInstanceOf[js.Any], paneTitle = paneTitle.asInstanceOf[js.Any], regressionLine = regressionLine.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], seriesLabel = seriesLabel.asInstanceOf[js.Any], seriesPoint = seriesPoint.asInstanceOf[js.Any], seriesTitle = seriesTitle.asInstanceOf[js.Any], trendLine = trendLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartHitInfo]
  }
  
  @scala.inline
  implicit class ASPxClientWebChartHitInfoMutableBuilder[Self <: ASPxClientWebChartHitInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: ASPxClientAnnotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxis(value: ASPxClientAxisBase): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisLabelItem(value: ASPxClientAxisLabelItem): Self = StObject.set(x, "axisLabelItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisTitle(value: ASPxClientAxisTitle): Self = StObject.set(x, "axisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: ASPxClientWebChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartTitle(value: ASPxClientChartTitle): Self = StObject.set(x, "chartTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstantLine(value: ASPxClientConstantLine): Self = StObject.set(x, "constantLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomLegendItem(value: ASPxClientCustomLegendItem): Self = StObject.set(x, "customLegendItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagram(value: ASPxClientXYDiagramBase): Self = StObject.set(x, "diagram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFibonacciIndicator(value: ASPxClientFibonacciIndicator): Self = StObject.set(x, "fibonacciIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAnnotation(value: Boolean): Self = StObject.set(x, "inAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAxis(value: Boolean): Self = StObject.set(x, "inAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAxisLabelItem(value: Boolean): Self = StObject.set(x, "inAxisLabelItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAxisTitle(value: Boolean): Self = StObject.set(x, "inAxisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInChart(value: Boolean): Self = StObject.set(x, "inChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInChartTitle(value: Boolean): Self = StObject.set(x, "inChartTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInConstantLine(value: Boolean): Self = StObject.set(x, "inConstantLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInCustomLegendItem(value: Boolean): Self = StObject.set(x, "inCustomLegendItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDiagram(value: Boolean): Self = StObject.set(x, "inDiagram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInFibonacciIndicator(value: Boolean): Self = StObject.set(x, "inFibonacciIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInHyperlink(value: Boolean): Self = StObject.set(x, "inHyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInIndicator(value: Boolean): Self = StObject.set(x, "inIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInLegend(value: Boolean): Self = StObject.set(x, "inLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInNonDefaultPane(value: Boolean): Self = StObject.set(x, "inNonDefaultPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInPaneTitle(value: Boolean): Self = StObject.set(x, "inPaneTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInRegressionLine(value: Boolean): Self = StObject.set(x, "inRegressionLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInSeries(value: Boolean): Self = StObject.set(x, "inSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInSeriesLabel(value: Boolean): Self = StObject.set(x, "inSeriesLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInSeriesPoint(value: Boolean): Self = StObject.set(x, "inSeriesPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInSeriesTitle(value: Boolean): Self = StObject.set(x, "inSeriesTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInTrendLine(value: Boolean): Self = StObject.set(x, "inTrendLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicator(value: ASPxClientIndicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegend(value: ASPxClientLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonDefaultPane(value: ASPxClientXYDiagramPane): Self = StObject.set(x, "nonDefaultPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneTitle(value: ASPxClientPaneTitle): Self = StObject.set(x, "paneTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegressionLine(value: ASPxClientRegressionLine): Self = StObject.set(x, "regressionLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: ASPxClientSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesLabel(value: ASPxClientSeriesLabel): Self = StObject.set(x, "seriesLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesPoint(value: ASPxClientSeriesPoint): Self = StObject.set(x, "seriesPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesTitle(value: ASPxClientSeriesTitle): Self = StObject.set(x, "seriesTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendLine(value: ASPxClientTrendLine): Self = StObject.set(x, "trendLine", value.asInstanceOf[js.Any])
  }
}
