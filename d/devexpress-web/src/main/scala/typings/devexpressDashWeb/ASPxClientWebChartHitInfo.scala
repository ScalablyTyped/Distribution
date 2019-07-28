package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a specific test point within a chart control, on the client side.
  */
trait ASPxClientWebChartHitInfo extends js.Object {
  /**
    * Gets the client-side annotation instance from under the test point.
    * Value: An ASPxClientAnnotation object.
    */
  var annotation: ASPxClientAnnotation
  /**
    * Gets the client-side axis instance from under the test point.
    * Value: An ASPxClientAxisBase descendant.
    */
  var axis: ASPxClientAxisBase
  /**
    * Gets the client-side axis label item instance from under the test point.
    * Value: An ASPxClientAxisLabelItem object.
    */
  var axisLabelItem: ASPxClientAxisLabelItem
  /**
    * Gets the client-side axis title instance from under the test point.
    * Value: An ASPxClientAxisTitle object.
    */
  var axisTitle: ASPxClientAxisTitle
  /**
    * Gets the client-side chart instance from under the test point.
    * Value: An ASPxClientWebChart object.
    */
  var chart: ASPxClientWebChart
  /**
    * Gets the client-side chart title instance from under the test point.
    * Value: An ASPxClientChartTitle object.
    */
  var chartTitle: ASPxClientChartTitle
  /**
    * Gets the client-side constant line instance from under the test point.
    * Value: An ASPxClientConstantLine object.
    */
  var constantLine: ASPxClientConstantLine
  /**
    * Gets a custom legend item which is located under the test point.
    * Value: An ASPxClientCustomLegendItem object which represents the item located under the test point.
    */
  var customLegendItem: ASPxClientCustomLegendItem
  /**
    * Gets the client-side diagram instance from under the test point.
    * Value: An ASPxClientXYDiagramBase descendant.
    */
  var diagram: ASPxClientXYDiagramBase
  /**
    * Gets the client-side Fibonacci indicator instance from under the test point.
    * Value: An ASPxClientFibonacciIndicator object.
    */
  var fibonacciIndicator: ASPxClientFibonacciIndicator
  /**
    * Returns a hyperlink which is located under the test point.
    * Value: A String object representing a hyperlink.
    */
  var hyperlink: String
  /**
    * Gets a value indicating whether the test point is within an annotation.
    * Value: true if the test point is within an annotation; otherwise, false.
    */
  var inAnnotation: Boolean
  /**
    * Gets a value indicating whether the test point is within the axis.
    * Value: true if the test point is within an axis; otherwise, false.
    */
  var inAxis: Boolean
  /**
    * Gets a value indicating whether the test point is within the axis label item.
    * Value: true if the test point is within an axis label item; otherwise, false.
    */
  var inAxisLabelItem: Boolean
  /**
    * Gets a value indicating whether the test point is within the axis title.
    * Value: true if the test point is within an axis title; otherwise, false.
    */
  var inAxisTitle: Boolean
  /**
    * Gets a value indicating whether the test point is within the chart.
    * Value: true if the test point is within a chart; otherwise, false.
    */
  var inChart: Boolean
  /**
    * Gets a value indicating whether the test point is within the chart title.
    * Value: true if the test point is within a chart title; otherwise, false.
    */
  var inChartTitle: Boolean
  /**
    * Gets a value indicating whether the test point is within the constant line.
    * Value: true if the test point is within a constant line; otherwise, false.
    */
  var inConstantLine: Boolean
  /**
    * Gets the value indicating whether or not the test point is within a custom legend item.
    * Value: true if the test point is within a custom legend item; otherwise, false.
    */
  var inCustomLegendItem: Boolean
  /**
    * Gets a value indicating whether the test point is within the diagram.
    * Value: true if the test point is within a diagram; otherwise, false.
    */
  var inDiagram: Boolean
  /**
    * Gets a value indicating whether the test point is within the Fibonacci Indicator.
    * Value: true if the test point is within a Fibonacci Indicator; otherwise, false.
    */
  var inFibonacciIndicator: Boolean
  /**
    * Gets a value indicating whether the test point is within a hyperlink.
    * Value: true, if the test point is within a hyperlink; otherwise, false.
    */
  var inHyperlink: Boolean
  /**
    * Gets a value specifying whether the test point is within an indicator.
    * Value: true if the test point is within an indicator; otherwise, false.
    */
  var inIndicator: Boolean
  /**
    * Gets a value indicating whether the test point is within the legend.
    * Value: true if the test point is within a legend; otherwise, false.
    */
  var inLegend: Boolean
  /**
    * Gets a value indicating whether the test point is within the non-default pane.
    * Value: true if the test point is within a non-default pane; otherwise, false.
    */
  var inNonDefaultPane: Boolean
  /**
    * Returns the value that indicates whether the test point is within the pane title.
    * Value: true, if the test point is within a pane title; otherwise, false.
    */
  var inPaneTitle: Boolean
  /**
    * Gets a value indicating whether the test point is within the regression line.
    * Value: true if the test point is within a regression line; otherwise, false.
    */
  var inRegressionLine: Boolean
  /**
    * Gets a value indicating whether the test point is within the series.
    * Value: true if the test point is within a series; otherwise, false.
    */
  var inSeries: Boolean
  /**
    * Gets a value indicating whether the test point is within the series label.
    * Value: true if the test point is within a series label; otherwise, false.
    */
  var inSeriesLabel: Boolean
  /**
    * Gets a value indicating whether the test point is within the series point.
    * Value: true if the test point is within a series point; otherwise, false.
    */
  var inSeriesPoint: Boolean
  /**
    * Gets a value indicating whether the test point is within the series title.
    * Value: true if the test point is within a series title; otherwise, false.
    */
  var inSeriesTitle: Boolean
  /**
    * Gets a value indicating whether the test point is within the trendline.
    * Value: true if the test point is within a trendline; otherwise, false.
    */
  var inTrendLine: Boolean
  /**
    * Gets the client-side indicator instance from under the test point.
    * Value: An ASPxClientIndicator descendant.
    */
  var indicator: ASPxClientIndicator
  /**
    * Gets the client-side legend instance from under the test point.
    * Value: An ASPxClientLegend object.
    */
  var legend: ASPxClientLegend
  /**
    * Gets the client-side non-default pane instance from under the test point.
    * Value: An ASPxClientXYDiagramPane object.
    */
  var nonDefaultPane: ASPxClientXYDiagramPane
  /**
    * Gets the client-side pane title instance from under the test point.
    * Value: A pane title.
    */
  var paneTitle: ASPxClientPaneTitle
  /**
    * Gets the client-side regression line instance from under the test point.
    * Value: An ASPxClientRegressionLine object.
    */
  var regressionLine: ASPxClientRegressionLine
  /**
    * Gets the client-side series instance from under the test point.
    * Value: An ASPxClientSeries object.
    */
  var series: ASPxClientSeries
  /**
    * Gets the client-side series label instance from under the test point.
    * Value: An ASPxClientSeriesLabel object.
    */
  var seriesLabel: ASPxClientSeriesLabel
  /**
    * Gets the client-side series point instance from under the test point.
    * Value: An ASPxClientSeriesPoint object.
    */
  var seriesPoint: ASPxClientSeriesPoint
  /**
    * Gets the client-side series title instance from under the test point.
    * Value: An ASPxClientSeriesTitle object.
    */
  var seriesTitle: ASPxClientSeriesTitle
  /**
    * Gets the client-side trendline instance from under the test point.
    * Value: An ASPxClientTrendLine object.
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
    val __obj = js.Dynamic.literal(annotation = annotation, axis = axis, axisLabelItem = axisLabelItem, axisTitle = axisTitle, chart = chart, chartTitle = chartTitle, constantLine = constantLine, customLegendItem = customLegendItem, diagram = diagram, fibonacciIndicator = fibonacciIndicator, hyperlink = hyperlink, inAnnotation = inAnnotation, inAxis = inAxis, inAxisLabelItem = inAxisLabelItem, inAxisTitle = inAxisTitle, inChart = inChart, inChartTitle = inChartTitle, inConstantLine = inConstantLine, inCustomLegendItem = inCustomLegendItem, inDiagram = inDiagram, inFibonacciIndicator = inFibonacciIndicator, inHyperlink = inHyperlink, inIndicator = inIndicator, inLegend = inLegend, inNonDefaultPane = inNonDefaultPane, inPaneTitle = inPaneTitle, inRegressionLine = inRegressionLine, inSeries = inSeries, inSeriesLabel = inSeriesLabel, inSeriesPoint = inSeriesPoint, inSeriesTitle = inSeriesTitle, inTrendLine = inTrendLine, indicator = indicator, legend = legend, nonDefaultPane = nonDefaultPane, paneTitle = paneTitle, regressionLine = regressionLine, series = series, seriesLabel = seriesLabel, seriesPoint = seriesPoint, seriesTitle = seriesTitle, trendLine = trendLine)
  
    __obj.asInstanceOf[ASPxClientWebChartHitInfo]
  }
}

