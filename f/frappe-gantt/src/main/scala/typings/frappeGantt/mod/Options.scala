package typings.frappeGantt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arrow_curve: js.UndefOr[Double] = js.undefined
  var bar_corner_radius: js.UndefOr[Double] = js.undefined
  var bar_height: js.UndefOr[Double] = js.undefined
  var column_width: js.UndefOr[Double] = js.undefined
  var custom_popup_html: js.UndefOr[String | (js.Function1[/* task */ js.Any, String])] = js.undefined
  var date_format: js.UndefOr[String] = js.undefined
  var header_height: js.UndefOr[Double] = js.undefined
  var on_click: js.UndefOr[js.Function1[/* task */ js.Any, Unit]] = js.undefined
  var on_date_change: js.UndefOr[js.Function3[/* task */ js.Any, /* start */ String, /* end */ String, Unit]] = js.undefined
  var on_progress_change: js.UndefOr[js.Function2[/* task */ js.Any, /* progress */ Double, Unit]] = js.undefined
  var on_view_change: js.UndefOr[js.Function1[/* mode */ viewMode, Unit]] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var view_mode: js.UndefOr[viewMode] = js.undefined
  var view_modes: js.UndefOr[js.Array[viewMode]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrow_curve: js.UndefOr[Double] = js.undefined,
    bar_corner_radius: js.UndefOr[Double] = js.undefined,
    bar_height: js.UndefOr[Double] = js.undefined,
    column_width: js.UndefOr[Double] = js.undefined,
    custom_popup_html: String | (js.Function1[/* task */ js.Any, String]) = null,
    date_format: String = null,
    header_height: js.UndefOr[Double] = js.undefined,
    on_click: /* task */ js.Any => Unit = null,
    on_date_change: (/* task */ js.Any, /* start */ String, /* end */ String) => Unit = null,
    on_progress_change: (/* task */ js.Any, /* progress */ Double) => Unit = null,
    on_view_change: /* mode */ viewMode => Unit = null,
    padding: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    view_mode: viewMode = null,
    view_modes: js.Array[viewMode] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrow_curve)) __obj.updateDynamic("arrow_curve")(arrow_curve.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bar_corner_radius)) __obj.updateDynamic("bar_corner_radius")(bar_corner_radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bar_height)) __obj.updateDynamic("bar_height")(bar_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(column_width)) __obj.updateDynamic("column_width")(column_width.get.asInstanceOf[js.Any])
    if (custom_popup_html != null) __obj.updateDynamic("custom_popup_html")(custom_popup_html.asInstanceOf[js.Any])
    if (date_format != null) __obj.updateDynamic("date_format")(date_format.asInstanceOf[js.Any])
    if (!js.isUndefined(header_height)) __obj.updateDynamic("header_height")(header_height.get.asInstanceOf[js.Any])
    if (on_click != null) __obj.updateDynamic("on_click")(js.Any.fromFunction1(on_click))
    if (on_date_change != null) __obj.updateDynamic("on_date_change")(js.Any.fromFunction3(on_date_change))
    if (on_progress_change != null) __obj.updateDynamic("on_progress_change")(js.Any.fromFunction2(on_progress_change))
    if (on_view_change != null) __obj.updateDynamic("on_view_change")(js.Any.fromFunction1(on_view_change))
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (view_mode != null) __obj.updateDynamic("view_mode")(view_mode.asInstanceOf[js.Any])
    if (view_modes != null) __obj.updateDynamic("view_modes")(view_modes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

