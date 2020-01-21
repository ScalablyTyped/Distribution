package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BubbleChartSpec extends js.Object {
  /** The bubble border color. */
  var bubbleBorderColor: js.UndefOr[Color] = js.undefined
  /** The data containing the bubble labels.  These do not need to be unique. */
  var bubbleLabels: js.UndefOr[ChartData] = js.undefined
  /**
    * The max radius size of the bubbles, in pixels.
    * If specified, the field must be a positive value.
    */
  var bubbleMaxRadiusSize: js.UndefOr[Double] = js.undefined
  /**
    * The minimum radius size of the bubbles, in pixels.
    * If specific, the field must be a positive value.
    */
  var bubbleMinRadiusSize: js.UndefOr[Double] = js.undefined
  /**
    * The opacity of the bubbles between 0 and 1.0.
    * 0 is fully transparent and 1 is fully opaque.
    */
  var bubbleOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The data contianing the bubble sizes.  Bubble sizes are used to draw
    * the bubbles at different sizes relative to each other.
    * If specified, group_ids must also be specified.  This field is
    * optional.
    */
  var bubbleSizes: js.UndefOr[ChartData] = js.undefined
  /**
    * The format of the text inside the bubbles.
    * Underline and Strikethrough are not supported.
    */
  var bubbleTextStyle: js.UndefOr[TextFormat] = js.undefined
  /**
    * The data containing the bubble x-values.  These values locate the bubbles
    * in the chart horizontally.
    */
  var domain: js.UndefOr[ChartData] = js.undefined
  /**
    * The data containing the bubble group IDs. All bubbles with the same group
    * ID are drawn in the same color. If bubble_sizes is specified then
    * this field must also be specified but may contain blank values.
    * This field is optional.
    */
  var groupIds: js.UndefOr[ChartData] = js.undefined
  /** Where the legend of the chart should be drawn. */
  var legendPosition: js.UndefOr[String] = js.undefined
  /**
    * The data contianing the bubble y-values.  These values locate the bubbles
    * in the chart vertically.
    */
  var series: js.UndefOr[ChartData] = js.undefined
}

object BubbleChartSpec {
  @scala.inline
  def apply(
    bubbleBorderColor: Color = null,
    bubbleLabels: ChartData = null,
    bubbleMaxRadiusSize: Int | Double = null,
    bubbleMinRadiusSize: Int | Double = null,
    bubbleOpacity: Int | Double = null,
    bubbleSizes: ChartData = null,
    bubbleTextStyle: TextFormat = null,
    domain: ChartData = null,
    groupIds: ChartData = null,
    legendPosition: String = null,
    series: ChartData = null
  ): BubbleChartSpec = {
    val __obj = js.Dynamic.literal()
    if (bubbleBorderColor != null) __obj.updateDynamic("bubbleBorderColor")(bubbleBorderColor.asInstanceOf[js.Any])
    if (bubbleLabels != null) __obj.updateDynamic("bubbleLabels")(bubbleLabels.asInstanceOf[js.Any])
    if (bubbleMaxRadiusSize != null) __obj.updateDynamic("bubbleMaxRadiusSize")(bubbleMaxRadiusSize.asInstanceOf[js.Any])
    if (bubbleMinRadiusSize != null) __obj.updateDynamic("bubbleMinRadiusSize")(bubbleMinRadiusSize.asInstanceOf[js.Any])
    if (bubbleOpacity != null) __obj.updateDynamic("bubbleOpacity")(bubbleOpacity.asInstanceOf[js.Any])
    if (bubbleSizes != null) __obj.updateDynamic("bubbleSizes")(bubbleSizes.asInstanceOf[js.Any])
    if (bubbleTextStyle != null) __obj.updateDynamic("bubbleTextStyle")(bubbleTextStyle.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (groupIds != null) __obj.updateDynamic("groupIds")(groupIds.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleChartSpec]
  }
}

