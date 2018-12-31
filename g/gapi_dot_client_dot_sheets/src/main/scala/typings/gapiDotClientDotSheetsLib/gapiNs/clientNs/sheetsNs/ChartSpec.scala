package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSpec extends js.Object {
  /**
    * The alternative text that describes the chart.  This is often used
    * for accessibility.
    */
  var altText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The background color of the entire chart.
    * Not applicable to Org charts.
    */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  /**
    * A basic chart specification, can be one of many kinds of charts.
    * See BasicChartType for the list of all
    * charts this supports.
    */
  var basicChart: js.UndefOr[BasicChartSpec] = js.undefined
  /** A bubble chart specification. */
  var bubbleChart: js.UndefOr[BubbleChartSpec] = js.undefined
  /** A candlestick chart specification. */
  var candlestickChart: js.UndefOr[CandlestickChartSpec] = js.undefined
  /**
    * The name of the font to use by default for all chart text (e.g. title,
    * axis labels, legend).  If a font is specified for a specific part of the
    * chart it will override this font name.
    */
  var fontName: js.UndefOr[java.lang.String] = js.undefined
  /** Determines how the charts will use hidden rows or columns. */
  var hiddenDimensionStrategy: js.UndefOr[java.lang.String] = js.undefined
  /** A histogram chart specification. */
  var histogramChart: js.UndefOr[HistogramChartSpec] = js.undefined
  /**
    * True to make a chart fill the entire space in which it's rendered with
    * minimum padding.  False to use the default padding.
    * (Not applicable to Geo and Org charts.)
    */
  var maximized: js.UndefOr[scala.Boolean] = js.undefined
  /** An org chart specification. */
  var orgChart: js.UndefOr[OrgChartSpec] = js.undefined
  /** A pie chart specification. */
  var pieChart: js.UndefOr[PieChartSpec] = js.undefined
  /** The subtitle of the chart. */
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The subtitle text format.
    * Strikethrough and underline are not supported.
    */
  var subtitleTextFormat: js.UndefOr[TextFormat] = js.undefined
  /**
    * The subtitle text position.
    * This field is optional.
    */
  var subtitleTextPosition: js.UndefOr[TextPosition] = js.undefined
  /** The title of the chart. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title text format.
    * Strikethrough and underline are not supported.
    */
  var titleTextFormat: js.UndefOr[TextFormat] = js.undefined
  /**
    * The title text position.
    * This field is optional.
    */
  var titleTextPosition: js.UndefOr[TextPosition] = js.undefined
}

