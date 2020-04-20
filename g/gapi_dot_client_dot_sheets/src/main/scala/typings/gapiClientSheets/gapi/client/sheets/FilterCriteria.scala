package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  /**
    * A condition that must be true for values to be shown.
    * (This does not override hidden_values -- if a value is listed there,
    * it will still be hidden.)
    */
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  /** Values that should be hidden. */
  var hiddenValues: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The background fill color to filter by; only cells with this fill color are
    * shown. Mutually exclusive with visible_foreground_color.
    */
  var visibleBackgroundColor: js.UndefOr[Color] = js.undefined
  /**
    * The background fill color to filter by; only cells with this fill color are
    * shown. This field is mutually exclusive with visible_foreground_color,
    * and must be set to an RGB-type color. If visible_background_color is
    * also set, this field takes precedence.
    */
  var visibleBackgroundColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /**
    * The foreground color to filter by; only cells with this foreground color
    * are shown. Mutually exclusive with visible_background_color.
    */
  var visibleForegroundColor: js.UndefOr[Color] = js.undefined
  /**
    * The foreground color to filter by; only cells with this foreground color
    * are shown. This field is mutually exclusive with
    * visible_background_color, and must be set to an RGB-type color. If
    * visible_foreground_color is also set, this field takes precedence.
    */
  var visibleForegroundColorStyle: js.UndefOr[ColorStyle] = js.undefined
}

object FilterCriteria {
  @scala.inline
  def apply(
    condition: BooleanCondition = null,
    hiddenValues: js.Array[String] = null,
    visibleBackgroundColor: Color = null,
    visibleBackgroundColorStyle: ColorStyle = null,
    visibleForegroundColor: Color = null,
    visibleForegroundColorStyle: ColorStyle = null
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (hiddenValues != null) __obj.updateDynamic("hiddenValues")(hiddenValues.asInstanceOf[js.Any])
    if (visibleBackgroundColor != null) __obj.updateDynamic("visibleBackgroundColor")(visibleBackgroundColor.asInstanceOf[js.Any])
    if (visibleBackgroundColorStyle != null) __obj.updateDynamic("visibleBackgroundColorStyle")(visibleBackgroundColorStyle.asInstanceOf[js.Any])
    if (visibleForegroundColor != null) __obj.updateDynamic("visibleForegroundColor")(visibleForegroundColor.asInstanceOf[js.Any])
    if (visibleForegroundColorStyle != null) __obj.updateDynamic("visibleForegroundColorStyle")(visibleForegroundColorStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
}

