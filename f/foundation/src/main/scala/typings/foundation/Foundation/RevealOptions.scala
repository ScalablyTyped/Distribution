package typings.foundation.Foundation

import typings.foundation.Anon_Close
import typings.foundation.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevealOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var animation_speed: js.UndefOr[Double] = js.undefined
  var bg: js.UndefOr[JQuery] = js.undefined
  var bg_class: js.UndefOr[String] = js.undefined
  var close: js.UndefOr[js.Function0[_]] = js.undefined
  var close_on_background_click: js.UndefOr[Boolean] = js.undefined
  var closed: js.UndefOr[js.Function0[_]] = js.undefined
  var css: js.UndefOr[Anon_Close] = js.undefined
  var dismiss_modal_class: js.UndefOr[String] = js.undefined
  var multiple_opened: js.UndefOr[Boolean] = js.undefined
  var on_ajax_error: js.UndefOr[js.Function0[_]] = js.undefined
  var open: js.UndefOr[js.Function0[_]] = js.undefined
  var opened: js.UndefOr[js.Function0[_]] = js.undefined
  var root_element: js.UndefOr[String] = js.undefined
}

object RevealOptions {
  @scala.inline
  def apply(
    animation: String = null,
    animation_speed: Int | Double = null,
    bg: JQuery = null,
    bg_class: String = null,
    close: () => _ = null,
    close_on_background_click: js.UndefOr[Boolean] = js.undefined,
    closed: () => _ = null,
    css: Anon_Close = null,
    dismiss_modal_class: String = null,
    multiple_opened: js.UndefOr[Boolean] = js.undefined,
    on_ajax_error: () => _ = null,
    open: () => _ = null,
    opened: () => _ = null,
    root_element: String = null
  ): RevealOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (animation_speed != null) __obj.updateDynamic("animation_speed")(animation_speed.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg)
    if (bg_class != null) __obj.updateDynamic("bg_class")(bg_class)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (!js.isUndefined(close_on_background_click)) __obj.updateDynamic("close_on_background_click")(close_on_background_click)
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction0(closed))
    if (css != null) __obj.updateDynamic("css")(css)
    if (dismiss_modal_class != null) __obj.updateDynamic("dismiss_modal_class")(dismiss_modal_class)
    if (!js.isUndefined(multiple_opened)) __obj.updateDynamic("multiple_opened")(multiple_opened)
    if (on_ajax_error != null) __obj.updateDynamic("on_ajax_error")(js.Any.fromFunction0(on_ajax_error))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction0(open))
    if (opened != null) __obj.updateDynamic("opened")(js.Any.fromFunction0(opened))
    if (root_element != null) __obj.updateDynamic("root_element")(root_element)
    __obj.asInstanceOf[RevealOptions]
  }
}

