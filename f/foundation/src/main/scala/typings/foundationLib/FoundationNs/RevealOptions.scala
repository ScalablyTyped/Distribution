package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevealOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var animation_speed: js.UndefOr[scala.Double] = js.undefined
  var bg: js.UndefOr[foundationLib.JQuery] = js.undefined
  var bg_class: js.UndefOr[java.lang.String] = js.undefined
  var close: js.UndefOr[js.Function0[_]] = js.undefined
  var close_on_background_click: js.UndefOr[scala.Boolean] = js.undefined
  var closed: js.UndefOr[js.Function0[_]] = js.undefined
  var css: js.UndefOr[foundationLib.Anon_Close] = js.undefined
  var dismiss_modal_class: js.UndefOr[java.lang.String] = js.undefined
  var multiple_opened: js.UndefOr[scala.Boolean] = js.undefined
  var on_ajax_error: js.UndefOr[js.Function0[_]] = js.undefined
  var open: js.UndefOr[js.Function0[_]] = js.undefined
  var opened: js.UndefOr[js.Function0[_]] = js.undefined
  var root_element: js.UndefOr[java.lang.String] = js.undefined
}

object RevealOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    animation_speed: scala.Int | scala.Double = null,
    bg: foundationLib.JQuery = null,
    bg_class: java.lang.String = null,
    close: js.Function0[_] = null,
    close_on_background_click: js.UndefOr[scala.Boolean] = js.undefined,
    closed: js.Function0[_] = null,
    css: foundationLib.Anon_Close = null,
    dismiss_modal_class: java.lang.String = null,
    multiple_opened: js.UndefOr[scala.Boolean] = js.undefined,
    on_ajax_error: js.Function0[_] = null,
    open: js.Function0[_] = null,
    opened: js.Function0[_] = null,
    root_element: java.lang.String = null
  ): RevealOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (animation_speed != null) __obj.updateDynamic("animation_speed")(animation_speed.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg)
    if (bg_class != null) __obj.updateDynamic("bg_class")(bg_class)
    if (close != null) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(close_on_background_click)) __obj.updateDynamic("close_on_background_click")(close_on_background_click)
    if (closed != null) __obj.updateDynamic("closed")(closed)
    if (css != null) __obj.updateDynamic("css")(css)
    if (dismiss_modal_class != null) __obj.updateDynamic("dismiss_modal_class")(dismiss_modal_class)
    if (!js.isUndefined(multiple_opened)) __obj.updateDynamic("multiple_opened")(multiple_opened)
    if (on_ajax_error != null) __obj.updateDynamic("on_ajax_error")(on_ajax_error)
    if (open != null) __obj.updateDynamic("open")(open)
    if (opened != null) __obj.updateDynamic("opened")(opened)
    if (root_element != null) __obj.updateDynamic("root_element")(root_element)
    __obj.asInstanceOf[RevealOptions]
  }
}

