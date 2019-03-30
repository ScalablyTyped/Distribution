package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSpec extends js.Object {
  var altText: js.UndefOr[java.lang.String] = js.undefined
  var backgroundColor: js.UndefOr[Color] = js.undefined
  var basicChart: js.UndefOr[BasicChartSpec] = js.undefined
  var bubbleChart: js.UndefOr[BubbleChartSpec] = js.undefined
  var candlestickChart: js.UndefOr[CandlestickChartSpec] = js.undefined
  var fontName: js.UndefOr[java.lang.String] = js.undefined
  var hiddenDimensionStrategy: js.UndefOr[java.lang.String] = js.undefined
  var histogramChart: js.UndefOr[HistogramChartSpec] = js.undefined
  var maximized: js.UndefOr[scala.Boolean] = js.undefined
  var orgChart: js.UndefOr[OrgChartSpec] = js.undefined
  var pieChart: js.UndefOr[PieChartSpec] = js.undefined
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  var subtitleTextFormat: js.UndefOr[TextFormat] = js.undefined
  var subtitleTextPosition: js.UndefOr[TextPosition] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleTextFormat: js.UndefOr[TextFormat] = js.undefined
  var titleTextPosition: js.UndefOr[TextPosition] = js.undefined
  var treemapChart: js.UndefOr[TreemapChartSpec] = js.undefined
  var waterfallChart: js.UndefOr[WaterfallChartSpec] = js.undefined
}

object ChartSpec {
  @scala.inline
  def apply(
    altText: java.lang.String = null,
    backgroundColor: Color = null,
    basicChart: BasicChartSpec = null,
    bubbleChart: BubbleChartSpec = null,
    candlestickChart: CandlestickChartSpec = null,
    fontName: java.lang.String = null,
    hiddenDimensionStrategy: java.lang.String = null,
    histogramChart: HistogramChartSpec = null,
    maximized: js.UndefOr[scala.Boolean] = js.undefined,
    orgChart: OrgChartSpec = null,
    pieChart: PieChartSpec = null,
    subtitle: java.lang.String = null,
    subtitleTextFormat: TextFormat = null,
    subtitleTextPosition: TextPosition = null,
    title: java.lang.String = null,
    titleTextFormat: TextFormat = null,
    titleTextPosition: TextPosition = null,
    treemapChart: TreemapChartSpec = null,
    waterfallChart: WaterfallChartSpec = null
  ): ChartSpec = {
    val __obj = js.Dynamic.literal()
    if (altText != null) __obj.updateDynamic("altText")(altText)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (basicChart != null) __obj.updateDynamic("basicChart")(basicChart)
    if (bubbleChart != null) __obj.updateDynamic("bubbleChart")(bubbleChart)
    if (candlestickChart != null) __obj.updateDynamic("candlestickChart")(candlestickChart)
    if (fontName != null) __obj.updateDynamic("fontName")(fontName)
    if (hiddenDimensionStrategy != null) __obj.updateDynamic("hiddenDimensionStrategy")(hiddenDimensionStrategy)
    if (histogramChart != null) __obj.updateDynamic("histogramChart")(histogramChart)
    if (!js.isUndefined(maximized)) __obj.updateDynamic("maximized")(maximized)
    if (orgChart != null) __obj.updateDynamic("orgChart")(orgChart)
    if (pieChart != null) __obj.updateDynamic("pieChart")(pieChart)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (subtitleTextFormat != null) __obj.updateDynamic("subtitleTextFormat")(subtitleTextFormat)
    if (subtitleTextPosition != null) __obj.updateDynamic("subtitleTextPosition")(subtitleTextPosition)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleTextFormat != null) __obj.updateDynamic("titleTextFormat")(titleTextFormat)
    if (titleTextPosition != null) __obj.updateDynamic("titleTextPosition")(titleTextPosition)
    if (treemapChart != null) __obj.updateDynamic("treemapChart")(treemapChart)
    if (waterfallChart != null) __obj.updateDynamic("waterfallChart")(waterfallChart)
    __obj.asInstanceOf[ChartSpec]
  }
}

