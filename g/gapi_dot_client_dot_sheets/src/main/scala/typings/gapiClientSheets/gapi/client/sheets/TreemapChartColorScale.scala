package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreemapChartColorScale extends js.Object {
  /**
    * The background color for cells with a color value greater than or equal
    * to maxValue. Defaults to #109618 if not
    * specified.
    */
  var maxValueColor: js.UndefOr[Color] = js.undefined
  /**
    * The background color for cells with a color value greater than or equal
    * to maxValue. Defaults to #109618 if not
    * specified.
    * If max_value_color is also set, this field takes precedence.
    */
  var maxValueColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /**
    * The background color for cells with a color value at the midpoint between
    * minValue and
    * maxValue. Defaults to #efe6dc if not
    * specified.
    */
  var midValueColor: js.UndefOr[Color] = js.undefined
  /**
    * The background color for cells with a color value at the midpoint between
    * minValue and
    * maxValue. Defaults to #efe6dc if not
    * specified.
    * If mid_value_color is also set, this field takes precedence.
    */
  var midValueColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /**
    * The background color for cells with a color value less than or equal to
    * minValue. Defaults to #dc3912 if not
    * specified.
    */
  var minValueColor: js.UndefOr[Color] = js.undefined
  /**
    * The background color for cells with a color value less than or equal to
    * minValue. Defaults to #dc3912 if not
    * specified.
    * If min_value_color is also set, this field takes precedence.
    */
  var minValueColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /**
    * The background color for cells that have no color data associated with
    * them. Defaults to #000000 if not specified.
    */
  var noDataColor: js.UndefOr[Color] = js.undefined
  /**
    * The background color for cells that have no color data associated with
    * them. Defaults to #000000 if not specified.
    * If no_data_color is also set, this field takes precedence.
    */
  var noDataColorStyle: js.UndefOr[ColorStyle] = js.undefined
}

object TreemapChartColorScale {
  @scala.inline
  def apply(
    maxValueColor: Color = null,
    maxValueColorStyle: ColorStyle = null,
    midValueColor: Color = null,
    midValueColorStyle: ColorStyle = null,
    minValueColor: Color = null,
    minValueColorStyle: ColorStyle = null,
    noDataColor: Color = null,
    noDataColorStyle: ColorStyle = null
  ): TreemapChartColorScale = {
    val __obj = js.Dynamic.literal()
    if (maxValueColor != null) __obj.updateDynamic("maxValueColor")(maxValueColor.asInstanceOf[js.Any])
    if (maxValueColorStyle != null) __obj.updateDynamic("maxValueColorStyle")(maxValueColorStyle.asInstanceOf[js.Any])
    if (midValueColor != null) __obj.updateDynamic("midValueColor")(midValueColor.asInstanceOf[js.Any])
    if (midValueColorStyle != null) __obj.updateDynamic("midValueColorStyle")(midValueColorStyle.asInstanceOf[js.Any])
    if (minValueColor != null) __obj.updateDynamic("minValueColor")(minValueColor.asInstanceOf[js.Any])
    if (minValueColorStyle != null) __obj.updateDynamic("minValueColorStyle")(minValueColorStyle.asInstanceOf[js.Any])
    if (noDataColor != null) __obj.updateDynamic("noDataColor")(noDataColor.asInstanceOf[js.Any])
    if (noDataColorStyle != null) __obj.updateDynamic("noDataColorStyle")(noDataColorStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapChartColorScale]
  }
}

