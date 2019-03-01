package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/joyride.html#optional-javascript-configuration
trait JoyrideOptions extends js.Object {
  var cookie_domain: js.UndefOr[scala.Boolean] = js.undefined
  var cookie_expires: js.UndefOr[scala.Double] = js.undefined
  var cookie_monster: js.UndefOr[scala.Boolean] = js.undefined
  var cookie_name: js.UndefOr[java.lang.String] = js.undefined
  var expose: js.UndefOr[scala.Boolean] = js.undefined
  var expose_add_class: js.UndefOr[java.lang.String] = js.undefined
  var exposed: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var next_button: js.UndefOr[scala.Boolean] = js.undefined
  var nub_position: js.UndefOr[java.lang.String] = js.undefined
  var pause_after: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var post_expose_callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var post_ride_callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var post_step_callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var pre_ride_callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var pre_step_callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var prev_button: js.UndefOr[scala.Boolean] = js.undefined
  var scroll_animation: js.UndefOr[java.lang.String] = js.undefined
  var scroll_speed: js.UndefOr[scala.Double] = js.undefined
  var start_offset: js.UndefOr[scala.Double] = js.undefined
  var start_timer_on_click: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[foundationLib.Anon_Button] = js.undefined
  var timer: js.UndefOr[scala.Double] = js.undefined
  var tip_animation: js.UndefOr[java.lang.String] = js.undefined
  var tip_animation_fade_speed: js.UndefOr[scala.Double] = js.undefined
  var tip_container: js.UndefOr[java.lang.String] = js.undefined
  var tip_location: js.UndefOr[java.lang.String] = js.undefined
  var tip_location_patterns: js.UndefOr[foundationLib.Anon_Bottom] = js.undefined
}

object JoyrideOptions {
  @scala.inline
  def apply(
    cookie_domain: js.UndefOr[scala.Boolean] = js.undefined,
    cookie_expires: scala.Int | scala.Double = null,
    cookie_monster: js.UndefOr[scala.Boolean] = js.undefined,
    cookie_name: java.lang.String = null,
    expose: js.UndefOr[scala.Boolean] = js.undefined,
    expose_add_class: java.lang.String = null,
    exposed: js.Array[java.lang.String] = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    next_button: js.UndefOr[scala.Boolean] = js.undefined,
    nub_position: java.lang.String = null,
    pause_after: js.Array[scala.Double] = null,
    post_expose_callback: js.Function0[scala.Unit] = null,
    post_ride_callback: js.Function0[scala.Unit] = null,
    post_step_callback: js.Function0[scala.Unit] = null,
    pre_ride_callback: js.Function0[scala.Unit] = null,
    pre_step_callback: js.Function0[scala.Unit] = null,
    prev_button: js.UndefOr[scala.Boolean] = js.undefined,
    scroll_animation: java.lang.String = null,
    scroll_speed: scala.Int | scala.Double = null,
    start_offset: scala.Int | scala.Double = null,
    start_timer_on_click: js.UndefOr[scala.Boolean] = js.undefined,
    template: foundationLib.Anon_Button = null,
    timer: scala.Int | scala.Double = null,
    tip_animation: java.lang.String = null,
    tip_animation_fade_speed: scala.Int | scala.Double = null,
    tip_container: java.lang.String = null,
    tip_location: java.lang.String = null,
    tip_location_patterns: foundationLib.Anon_Bottom = null
  ): JoyrideOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cookie_domain)) __obj.updateDynamic("cookie_domain")(cookie_domain)
    if (cookie_expires != null) __obj.updateDynamic("cookie_expires")(cookie_expires.asInstanceOf[js.Any])
    if (!js.isUndefined(cookie_monster)) __obj.updateDynamic("cookie_monster")(cookie_monster)
    if (cookie_name != null) __obj.updateDynamic("cookie_name")(cookie_name)
    if (!js.isUndefined(expose)) __obj.updateDynamic("expose")(expose)
    if (expose_add_class != null) __obj.updateDynamic("expose_add_class")(expose_add_class)
    if (exposed != null) __obj.updateDynamic("exposed")(exposed)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (!js.isUndefined(next_button)) __obj.updateDynamic("next_button")(next_button)
    if (nub_position != null) __obj.updateDynamic("nub_position")(nub_position)
    if (pause_after != null) __obj.updateDynamic("pause_after")(pause_after)
    if (post_expose_callback != null) __obj.updateDynamic("post_expose_callback")(post_expose_callback)
    if (post_ride_callback != null) __obj.updateDynamic("post_ride_callback")(post_ride_callback)
    if (post_step_callback != null) __obj.updateDynamic("post_step_callback")(post_step_callback)
    if (pre_ride_callback != null) __obj.updateDynamic("pre_ride_callback")(pre_ride_callback)
    if (pre_step_callback != null) __obj.updateDynamic("pre_step_callback")(pre_step_callback)
    if (!js.isUndefined(prev_button)) __obj.updateDynamic("prev_button")(prev_button)
    if (scroll_animation != null) __obj.updateDynamic("scroll_animation")(scroll_animation)
    if (scroll_speed != null) __obj.updateDynamic("scroll_speed")(scroll_speed.asInstanceOf[js.Any])
    if (start_offset != null) __obj.updateDynamic("start_offset")(start_offset.asInstanceOf[js.Any])
    if (!js.isUndefined(start_timer_on_click)) __obj.updateDynamic("start_timer_on_click")(start_timer_on_click)
    if (template != null) __obj.updateDynamic("template")(template)
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    if (tip_animation != null) __obj.updateDynamic("tip_animation")(tip_animation)
    if (tip_animation_fade_speed != null) __obj.updateDynamic("tip_animation_fade_speed")(tip_animation_fade_speed.asInstanceOf[js.Any])
    if (tip_container != null) __obj.updateDynamic("tip_container")(tip_container)
    if (tip_location != null) __obj.updateDynamic("tip_location")(tip_location)
    if (tip_location_patterns != null) __obj.updateDynamic("tip_location_patterns")(tip_location_patterns)
    __obj.asInstanceOf[JoyrideOptions]
  }
}

