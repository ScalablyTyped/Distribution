package typings
package devexpressDashWebLib

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
  var hyperlink: java.lang.String
  /**
    * Gets a value indicating whether the test point is within an annotation.
    * Value: true if the test point is within an annotation; otherwise, false.
    */
  var inAnnotation: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the axis.
    * Value: true if the test point is within an axis; otherwise, false.
    */
  var inAxis: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the axis label item.
    * Value: true if the test point is within an axis label item; otherwise, false.
    */
  var inAxisLabelItem: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the axis title.
    * Value: true if the test point is within an axis title; otherwise, false.
    */
  var inAxisTitle: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the chart.
    * Value: true if the test point is within a chart; otherwise, false.
    */
  var inChart: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the chart title.
    * Value: true if the test point is within a chart title; otherwise, false.
    */
  var inChartTitle: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the constant line.
    * Value: true if the test point is within a constant line; otherwise, false.
    */
  var inConstantLine: scala.Boolean
  /**
    * Gets the value indicating whether or not the test point is within a custom legend item.
    * Value: true if the test point is within a custom legend item; otherwise, false.
    */
  var inCustomLegendItem: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the diagram.
    * Value: true if the test point is within a diagram; otherwise, false.
    */
  var inDiagram: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the Fibonacci Indicator.
    * Value: true if the test point is within a Fibonacci Indicator; otherwise, false.
    */
  var inFibonacciIndicator: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within a hyperlink.
    * Value: true, if the test point is within a hyperlink; otherwise, false.
    */
  var inHyperlink: scala.Boolean
  /**
    * Gets a value specifying whether the test point is within an indicator.
    * Value: true if the test point is within an indicator; otherwise, false.
    */
  var inIndicator: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the legend.
    * Value: true if the test point is within a legend; otherwise, false.
    */
  var inLegend: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the non-default pane.
    * Value: true if the test point is within a non-default pane; otherwise, false.
    */
  var inNonDefaultPane: scala.Boolean
  /**
    * Returns the value that indicates whether the test point is within the pane title.
    * Value: true, if the test point is within a pane title; otherwise, false.
    */
  var inPaneTitle: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the regression line.
    * Value: true if the test point is within a regression line; otherwise, false.
    */
  var inRegressionLine: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the series.
    * Value: true if the test point is within a series; otherwise, false.
    */
  var inSeries: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the series label.
    * Value: true if the test point is within a series label; otherwise, false.
    */
  var inSeriesLabel: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the series point.
    * Value: true if the test point is within a series point; otherwise, false.
    */
  var inSeriesPoint: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the series title.
    * Value: true if the test point is within a series title; otherwise, false.
    */
  var inSeriesTitle: scala.Boolean
  /**
    * Gets a value indicating whether the test point is within the trendline.
    * Value: true if the test point is within a trendline; otherwise, false.
    */
  var inTrendLine: scala.Boolean
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
    hyperlink: java.lang.String,
    inAnnotation: scala.Boolean,
    inAxis: scala.Boolean,
    inAxisLabelItem: scala.Boolean,
    inAxisTitle: scala.Boolean,
    inChart: scala.Boolean,
    inChartTitle: scala.Boolean,
    inConstantLine: scala.Boolean,
    inCustomLegendItem: scala.Boolean,
    inDiagram: scala.Boolean,
    inFibonacciIndicator: scala.Boolean,
    inHyperlink: scala.Boolean,
    inIndicator: scala.Boolean,
    inLegend: scala.Boolean,
    inNonDefaultPane: scala.Boolean,
    inPaneTitle: scala.Boolean,
    inRegressionLine: scala.Boolean,
    inSeries: scala.Boolean,
    inSeriesLabel: scala.Boolean,
    inSeriesPoint: scala.Boolean,
    inSeriesTitle: scala.Boolean,
    inTrendLine: scala.Boolean,
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotation")(annotation)
    __obj.updateDynamic("axis")(axis)
    __obj.updateDynamic("axisLabelItem")(axisLabelItem)
    __obj.updateDynamic("axisTitle")(axisTitle)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("chartTitle")(chartTitle)
    __obj.updateDynamic("constantLine")(constantLine)
    __obj.updateDynamic("customLegendItem")(customLegendItem)
    __obj.updateDynamic("diagram")(diagram)
    __obj.updateDynamic("fibonacciIndicator")(fibonacciIndicator)
    __obj.updateDynamic("hyperlink")(hyperlink)
    __obj.updateDynamic("inAnnotation")(inAnnotation)
    __obj.updateDynamic("inAxis")(inAxis)
    __obj.updateDynamic("inAxisLabelItem")(inAxisLabelItem)
    __obj.updateDynamic("inAxisTitle")(inAxisTitle)
    __obj.updateDynamic("inChart")(inChart)
    __obj.updateDynamic("inChartTitle")(inChartTitle)
    __obj.updateDynamic("inConstantLine")(inConstantLine)
    __obj.updateDynamic("inCustomLegendItem")(inCustomLegendItem)
    __obj.updateDynamic("inDiagram")(inDiagram)
    __obj.updateDynamic("inFibonacciIndicator")(inFibonacciIndicator)
    __obj.updateDynamic("inHyperlink")(inHyperlink)
    __obj.updateDynamic("inIndicator")(inIndicator)
    __obj.updateDynamic("inLegend")(inLegend)
    __obj.updateDynamic("inNonDefaultPane")(inNonDefaultPane)
    __obj.updateDynamic("inPaneTitle")(inPaneTitle)
    __obj.updateDynamic("inRegressionLine")(inRegressionLine)
    __obj.updateDynamic("inSeries")(inSeries)
    __obj.updateDynamic("inSeriesLabel")(inSeriesLabel)
    __obj.updateDynamic("inSeriesPoint")(inSeriesPoint)
    __obj.updateDynamic("inSeriesTitle")(inSeriesTitle)
    __obj.updateDynamic("inTrendLine")(inTrendLine)
    __obj.updateDynamic("indicator")(indicator)
    __obj.updateDynamic("legend")(legend)
    __obj.updateDynamic("nonDefaultPane")(nonDefaultPane)
    __obj.updateDynamic("paneTitle")(paneTitle)
    __obj.updateDynamic("regressionLine")(regressionLine)
    __obj.updateDynamic("series")(series)
    __obj.updateDynamic("seriesLabel")(seriesLabel)
    __obj.updateDynamic("seriesPoint")(seriesPoint)
    __obj.updateDynamic("seriesTitle")(seriesTitle)
    __obj.updateDynamic("trendLine")(trendLine)
    __obj.asInstanceOf[ASPxClientWebChartHitInfo]
  }
}

