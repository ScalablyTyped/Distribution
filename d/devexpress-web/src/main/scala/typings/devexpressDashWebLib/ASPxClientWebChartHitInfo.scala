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

