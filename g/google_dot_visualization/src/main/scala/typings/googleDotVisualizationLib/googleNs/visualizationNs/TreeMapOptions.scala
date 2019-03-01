package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeMapOptions extends js.Object {
  var fontColor: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var forceIFrame: js.UndefOr[scala.Boolean] = js.undefined
  var headerColor: js.UndefOr[java.lang.String] = js.undefined
  var headerHeight: js.UndefOr[scala.Double] = js.undefined
  var headerHighlightColor: js.UndefOr[java.lang.String] = js.undefined
  var hintOpacity: js.UndefOr[scala.Double] = js.undefined
  var maxColor: js.UndefOr[java.lang.String] = js.undefined
  var maxColorValue: js.UndefOr[scala.Double] = js.undefined
  var maxDepth: js.UndefOr[scala.Double] = js.undefined
  var maxHighlightColor: js.UndefOr[java.lang.String] = js.undefined
  var maxPostDepth: js.UndefOr[scala.Double] = js.undefined
  var midColor: js.UndefOr[java.lang.String] = js.undefined
  var midHighlightColor: js.UndefOr[java.lang.String] = js.undefined
  var minColor: js.UndefOr[java.lang.String] = js.undefined
  var minColorValue: js.UndefOr[scala.Double] = js.undefined
  var minHighlightColor: js.UndefOr[java.lang.String] = js.undefined
  var showScale: js.UndefOr[scala.Boolean] = js.undefined
  var showTooltips: js.UndefOr[scala.Boolean] = js.undefined
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var useWeightedAverageForAggregation: js.UndefOr[scala.Boolean] = js.undefined
}

object TreeMapOptions {
  @scala.inline
  def apply(
    fontColor: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    forceIFrame: js.UndefOr[scala.Boolean] = js.undefined,
    headerColor: java.lang.String = null,
    headerHeight: scala.Int | scala.Double = null,
    headerHighlightColor: java.lang.String = null,
    hintOpacity: scala.Int | scala.Double = null,
    maxColor: java.lang.String = null,
    maxColorValue: scala.Int | scala.Double = null,
    maxDepth: scala.Int | scala.Double = null,
    maxHighlightColor: java.lang.String = null,
    maxPostDepth: scala.Int | scala.Double = null,
    midColor: java.lang.String = null,
    midHighlightColor: java.lang.String = null,
    minColor: java.lang.String = null,
    minColorValue: scala.Int | scala.Double = null,
    minHighlightColor: java.lang.String = null,
    showScale: js.UndefOr[scala.Boolean] = js.undefined,
    showTooltips: js.UndefOr[scala.Boolean] = js.undefined,
    textStyle: ChartTextStyle = null,
    title: java.lang.String = null,
    titleTextStyle: ChartTextStyle = null,
    useWeightedAverageForAggregation: js.UndefOr[scala.Boolean] = js.undefined
  ): TreeMapOptions = {
    val __obj = js.Dynamic.literal()
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIFrame)) __obj.updateDynamic("forceIFrame")(forceIFrame)
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor)
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (headerHighlightColor != null) __obj.updateDynamic("headerHighlightColor")(headerHighlightColor)
    if (hintOpacity != null) __obj.updateDynamic("hintOpacity")(hintOpacity.asInstanceOf[js.Any])
    if (maxColor != null) __obj.updateDynamic("maxColor")(maxColor)
    if (maxColorValue != null) __obj.updateDynamic("maxColorValue")(maxColorValue.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (maxHighlightColor != null) __obj.updateDynamic("maxHighlightColor")(maxHighlightColor)
    if (maxPostDepth != null) __obj.updateDynamic("maxPostDepth")(maxPostDepth.asInstanceOf[js.Any])
    if (midColor != null) __obj.updateDynamic("midColor")(midColor)
    if (midHighlightColor != null) __obj.updateDynamic("midHighlightColor")(midHighlightColor)
    if (minColor != null) __obj.updateDynamic("minColor")(minColor)
    if (minColorValue != null) __obj.updateDynamic("minColorValue")(minColorValue.asInstanceOf[js.Any])
    if (minHighlightColor != null) __obj.updateDynamic("minHighlightColor")(minHighlightColor)
    if (!js.isUndefined(showScale)) __obj.updateDynamic("showScale")(showScale)
    if (!js.isUndefined(showTooltips)) __obj.updateDynamic("showTooltips")(showTooltips)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle)
    if (!js.isUndefined(useWeightedAverageForAggregation)) __obj.updateDynamic("useWeightedAverageForAggregation")(useWeightedAverageForAggregation)
    __obj.asInstanceOf[TreeMapOptions]
  }
}

