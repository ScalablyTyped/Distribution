package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSpec extends js.Object {
  /**
    * The background fill color to sort by; cells with this fill color are sorted
    * to the top. Mutually exclusive with foreground_color.
    */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  /**
    * The background fill color to sort by; cells with this fill color are sorted
    * to the top. Mutually exclusive with foreground_color, and must be an
    * RGB-type color. If background_color is also set, this field takes
    * precedence.
    */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /** The dimension the sort should be applied to. */
  var dimensionIndex: js.UndefOr[Double] = js.undefined
  /**
    * The foreground color to sort by; cells with this foreground color are
    * sorted to the top. Mutually exclusive with background_color.
    */
  var foregroundColor: js.UndefOr[Color] = js.undefined
  /**
    * The foreground color to sort by; cells with this foreground color are
    * sorted to the top. Mutually exclusive with background_color, and must
    * be an RGB-type color. If foreground_color is also set, this field takes
    * precedence.
    */
  var foregroundColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /** The order data should be sorted. */
  var sortOrder: js.UndefOr[String] = js.undefined
}

object SortSpec {
  @scala.inline
  def apply(
    backgroundColor: Color = null,
    backgroundColorStyle: ColorStyle = null,
    dimensionIndex: Int | Double = null,
    foregroundColor: Color = null,
    foregroundColorStyle: ColorStyle = null,
    sortOrder: String = null
  ): SortSpec = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundColorStyle != null) __obj.updateDynamic("backgroundColorStyle")(backgroundColorStyle.asInstanceOf[js.Any])
    if (dimensionIndex != null) __obj.updateDynamic("dimensionIndex")(dimensionIndex.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (foregroundColorStyle != null) __obj.updateDynamic("foregroundColorStyle")(foregroundColorStyle.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortSpec]
  }
}

