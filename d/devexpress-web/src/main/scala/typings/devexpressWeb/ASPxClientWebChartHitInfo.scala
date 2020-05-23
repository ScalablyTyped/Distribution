package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a specific test point within a chart control, on the client side.
  */
trait ASPxClientWebChartHitInfo extends js.Object {
  /**
    * Gets the client-side annotation instance from under the test point.
    */
  var annotation: ASPxClientAnnotation
  /**
    * Gets the client-side axis instance from under the test point.
    */
  var axis: ASPxClientAxisBase
  /**
    * Gets the client-side axis label item instance from under the test point.
    */
  var axisLabelItem: ASPxClientAxisLabelItem
  /**
    * Gets the client-side axis title instance from under the test point.
    */
  var axisTitle: ASPxClientAxisTitle
  /**
    * Gets the client-side chart instance from under the test point.
    */
  var chart: ASPxClientWebChart
  /**
    * Gets the client-side chart title instance from under the test point.
    */
  var chartTitle: ASPxClientChartTitle
  /**
    * Gets the client-side constant line instance from under the test point.
    */
  var constantLine: ASPxClientConstantLine
  /**
    * Gets a custom legend item which is located under the test point.
    */
  var customLegendItem: ASPxClientCustomLegendItem
  /**
    * Gets the client-side diagram instance from under the test point.
    */
  var diagram: ASPxClientXYDiagramBase
  /** @deprecated This property is now obsolete. Use the indicator property instead. */
  /**
    * Gets the client-side Fibonacci indicator instance from under the test point.
    */
  var fibonacciIndicator: ASPxClientFibonacciIndicator
  /**
    * Returns a hyperlink which is located under the test point.
    */
  var hyperlink: String
  /**
    * Gets a value indicating whether the test point is within an annotation.
    */
  var inAnnotation: Boolean
  /**
    * Gets a value indicating whether the test point is within the axis.
    */
  var inAxis: Boolean
  /**
    * Gets a value indicating whether the test point is within the axis label item.
    */
  var inAxisLabelItem: Boolean
  /**
    * Gets a value indicating whether the test point is within the axis title.
    */
  var inAxisTitle: Boolean
  /**
    * Gets a value indicating whether the test point is within the chart.
    */
  var inChart: Boolean
  /**
    * Gets a value indicating whether the test point is within the chart title.
    */
  var inChartTitle: Boolean
  /**
    * Gets a value indicating whether the test point is within the constant line.
    */
  var inConstantLine: Boolean
  /**
    * Gets the value indicating whether or not the test point is within a custom legend item.
    */
  var inCustomLegendItem: Boolean
  /**
    * Gets a value indicating whether the test point is within the diagram.
    */
  var inDiagram: Boolean
  /** @deprecated This property is now obsolete. Use the inIndicator property instead. */
  /**
    * Gets a value indicating whether the test point is within the Fibonacci Indicator.
    */
  var inFibonacciIndicator: Boolean
  /**
    * Gets a value indicating whether the test point is within a hyperlink.
    */
  var inHyperlink: Boolean
  /**
    * Gets a value specifying whether the test point is within an indicator.
    */
  var inIndicator: Boolean
  /**
    * Gets a value indicating whether the test point is within the legend.
    */
  var inLegend: Boolean
  /**
    * Gets a value indicating whether the test point is within the non-default pane.
    */
  var inNonDefaultPane: Boolean
  /**
    * Returns the value that indicates whether the test point is within the pane title.
    */
  var inPaneTitle: Boolean
  /** @deprecated This property is now obsolete. Use the inIndicator property instead. */
  /**
    * Gets a value indicating whether the test point is within the regression line.
    */
  var inRegressionLine: Boolean
  /**
    * Gets a value indicating whether the test point is within the series.
    */
  var inSeries: Boolean
  /**
    * Gets a value indicating whether the test point is within the series label.
    */
  var inSeriesLabel: Boolean
  /**
    * Gets a value indicating whether the test point is within the series point.
    */
  var inSeriesPoint: Boolean
  /**
    * Gets a value indicating whether the test point is within the series title.
    */
  var inSeriesTitle: Boolean
  /** @deprecated This property is now obsolete. Use the inIndicator property instead. */
  /**
    * Gets a value indicating whether the test point is within the trendline.
    */
  var inTrendLine: Boolean
  /**
    * Gets the client-side indicator instance from under the test point.
    */
  var indicator: ASPxClientIndicator
  /**
    * Gets the client-side legend instance from under the test point.
    */
  var legend: ASPxClientLegend
  /**
    * Gets the client-side non-default pane instance from under the test point.
    */
  var nonDefaultPane: ASPxClientXYDiagramPane
  /**
    * Gets the client-side pane title instance from under the test point.
    */
  var paneTitle: ASPxClientPaneTitle
  /** @deprecated This property is now obsolete. Use the indicator property instead. */
  /**
    * Gets the client-side regression line instance from under the test point.
    */
  var regressionLine: ASPxClientRegressionLine
  /**
    * Gets the client-side series instance from under the test point.
    */
  var series: ASPxClientSeries
  /**
    * Gets the client-side series label instance from under the test point.
    */
  var seriesLabel: ASPxClientSeriesLabel
  /**
    * Gets the client-side series point instance from under the test point.
    */
  var seriesPoint: ASPxClientSeriesPoint
  /**
    * Gets the client-side series title instance from under the test point.
    */
  var seriesTitle: ASPxClientSeriesTitle
  /** @deprecated This property is now obsolete. Use the indicator property instead. */
  /**
    * Gets the client-side trendline instance from under the test point.
    */
  var trendLine: ASPxClientTrendLine
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
}

