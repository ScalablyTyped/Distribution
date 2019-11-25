package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreemapChartSpec extends js.Object {
  /**
    * The data that determines the background color of each treemap data cell.
    * This field is optional. If not specified, size_data is used to
    * determine background colors. If specified, the data is expected to be
    * numeric. color_scale will determine how the values in this data map to
    * data cell background colors.
    */
  var colorData: js.UndefOr[ChartData] = js.undefined
  /**
    * The color scale for data cells in the treemap chart. Data cells are
    * assigned colors based on their color values. These color values come from
    * color_data, or from size_data if color_data is not specified.
    * Cells with color values less than or equal to min_value will
    * have minValueColor as their
    * background color. Cells with color values greater than or equal to
    * max_value will have
    * maxValueColor as their background
    * color. Cells with color values between min_value and max_value will
    * have background colors on a gradient between
    * minValueColor and
    * maxValueColor, the midpoint of
    * the gradient being midValueColor.
    * Cells with missing or non-numeric color values will have
    * noDataColor as their background
    * color.
    */
  var colorScale: js.UndefOr[TreemapChartColorScale] = js.undefined
  /** The background color for header cells. */
  var headerColor: js.UndefOr[Color] = js.undefined
  /** True to hide tooltips. */
  var hideTooltips: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of additional data levels beyond the labeled levels to be shown
    * on the treemap chart. These levels are not interactive and are shown
    * without their labels. Defaults to 0 if not specified.
    */
  var hintedLevels: js.UndefOr[Double] = js.undefined
  /** The data that contains the treemap cell labels. */
  var labels: js.UndefOr[ChartData] = js.undefined
  /**
    * The number of data levels to show on the treemap chart. These levels are
    * interactive and are shown with their labels. Defaults to 2 if not
    * specified.
    */
  var levels: js.UndefOr[Double] = js.undefined
  /**
    * The maximum possible data value. Cells with values greater than this will
    * have the same color as cells with this value. If not specified, defaults
    * to the actual maximum value from color_data, or the maximum value from
    * size_data if color_data is not specified.
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * The minimum possible data value. Cells with values less than this will
    * have the same color as cells with this value. If not specified, defaults
    * to the actual minimum value from color_data, or the minimum value from
    * size_data if color_data is not specified.
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /** The data the contains the treemap cells' parent labels. */
  var parentLabels: js.UndefOr[ChartData] = js.undefined
  /**
    * The data that determines the size of each treemap data cell. This data is
    * expected to be numeric. The cells corresponding to non-numeric or missing
    * data will not be rendered. If color_data is not specified, this data
    * is used to determine data cell background colors as well.
    */
  var sizeData: js.UndefOr[ChartData] = js.undefined
  /** The text format for all labels on the chart. */
  var textFormat: js.UndefOr[TextFormat] = js.undefined
}

object TreemapChartSpec {
  @scala.inline
  def apply(
    colorData: ChartData = null,
    colorScale: TreemapChartColorScale = null,
    headerColor: Color = null,
    hideTooltips: js.UndefOr[Boolean] = js.undefined,
    hintedLevels: Int | Double = null,
    labels: ChartData = null,
    levels: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    parentLabels: ChartData = null,
    sizeData: ChartData = null,
    textFormat: TextFormat = null
  ): TreemapChartSpec = {
    val __obj = js.Dynamic.literal()
    if (colorData != null) __obj.updateDynamic("colorData")(colorData.asInstanceOf[js.Any])
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale.asInstanceOf[js.Any])
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTooltips)) __obj.updateDynamic("hideTooltips")(hideTooltips.asInstanceOf[js.Any])
    if (hintedLevels != null) __obj.updateDynamic("hintedLevels")(hintedLevels.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (parentLabels != null) __obj.updateDynamic("parentLabels")(parentLabels.asInstanceOf[js.Any])
    if (sizeData != null) __obj.updateDynamic("sizeData")(sizeData.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapChartSpec]
  }
}

