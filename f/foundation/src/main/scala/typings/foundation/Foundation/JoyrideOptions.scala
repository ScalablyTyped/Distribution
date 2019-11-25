package typings.foundation.Foundation

import typings.foundation.Anon_Bottom
import typings.foundation.Anon_Button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/joyride.html#optional-javascript-configuration
trait JoyrideOptions extends js.Object {
  var cookie_domain: js.UndefOr[Boolean] = js.undefined
  var cookie_expires: js.UndefOr[Double] = js.undefined
  var cookie_monster: js.UndefOr[Boolean] = js.undefined
  var cookie_name: js.UndefOr[String] = js.undefined
  var expose: js.UndefOr[Boolean] = js.undefined
  var expose_add_class: js.UndefOr[String] = js.undefined
  var exposed: js.UndefOr[js.Array[String]] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var next_button: js.UndefOr[Boolean] = js.undefined
  var nub_position: js.UndefOr[String] = js.undefined
  var pause_after: js.UndefOr[js.Array[Double]] = js.undefined
  var post_expose_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var post_ride_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var post_step_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pre_ride_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pre_step_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prev_button: js.UndefOr[Boolean] = js.undefined
  var scroll_animation: js.UndefOr[String] = js.undefined
  var scroll_speed: js.UndefOr[Double] = js.undefined
  var start_offset: js.UndefOr[Double] = js.undefined
  var start_timer_on_click: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[Anon_Button] = js.undefined
  var timer: js.UndefOr[Double] = js.undefined
  var tip_animation: js.UndefOr[String] = js.undefined
  var tip_animation_fade_speed: js.UndefOr[Double] = js.undefined
  var tip_container: js.UndefOr[String] = js.undefined
  var tip_location: js.UndefOr[String] = js.undefined
  var tip_location_patterns: js.UndefOr[Anon_Bottom] = js.undefined
}

object JoyrideOptions {
  @scala.inline
  def apply(
    cookie_domain: js.UndefOr[Boolean] = js.undefined,
    cookie_expires: Int | Double = null,
    cookie_monster: js.UndefOr[Boolean] = js.undefined,
    cookie_name: String = null,
    expose: js.UndefOr[Boolean] = js.undefined,
    expose_add_class: String = null,
    exposed: js.Array[String] = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined,
    next_button: js.UndefOr[Boolean] = js.undefined,
    nub_position: String = null,
    pause_after: js.Array[Double] = null,
    post_expose_callback: () => Unit = null,
    post_ride_callback: () => Unit = null,
    post_step_callback: () => Unit = null,
    pre_ride_callback: () => Unit = null,
    pre_step_callback: () => Unit = null,
    prev_button: js.UndefOr[Boolean] = js.undefined,
    scroll_animation: String = null,
    scroll_speed: Int | Double = null,
    start_offset: Int | Double = null,
    start_timer_on_click: js.UndefOr[Boolean] = js.undefined,
    template: Anon_Button = null,
    timer: Int | Double = null,
    tip_animation: String = null,
    tip_animation_fade_speed: Int | Double = null,
    tip_container: String = null,
    tip_location: String = null,
    tip_location_patterns: Anon_Bottom = null
  ): JoyrideOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cookie_domain)) __obj.updateDynamic("cookie_domain")(cookie_domain.asInstanceOf[js.Any])
    if (cookie_expires != null) __obj.updateDynamic("cookie_expires")(cookie_expires.asInstanceOf[js.Any])
    if (!js.isUndefined(cookie_monster)) __obj.updateDynamic("cookie_monster")(cookie_monster.asInstanceOf[js.Any])
    if (cookie_name != null) __obj.updateDynamic("cookie_name")(cookie_name.asInstanceOf[js.Any])
    if (!js.isUndefined(expose)) __obj.updateDynamic("expose")(expose.asInstanceOf[js.Any])
    if (expose_add_class != null) __obj.updateDynamic("expose_add_class")(expose_add_class.asInstanceOf[js.Any])
    if (exposed != null) __obj.updateDynamic("exposed")(exposed.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (!js.isUndefined(next_button)) __obj.updateDynamic("next_button")(next_button.asInstanceOf[js.Any])
    if (nub_position != null) __obj.updateDynamic("nub_position")(nub_position.asInstanceOf[js.Any])
    if (pause_after != null) __obj.updateDynamic("pause_after")(pause_after.asInstanceOf[js.Any])
    if (post_expose_callback != null) __obj.updateDynamic("post_expose_callback")(js.Any.fromFunction0(post_expose_callback))
    if (post_ride_callback != null) __obj.updateDynamic("post_ride_callback")(js.Any.fromFunction0(post_ride_callback))
    if (post_step_callback != null) __obj.updateDynamic("post_step_callback")(js.Any.fromFunction0(post_step_callback))
    if (pre_ride_callback != null) __obj.updateDynamic("pre_ride_callback")(js.Any.fromFunction0(pre_ride_callback))
    if (pre_step_callback != null) __obj.updateDynamic("pre_step_callback")(js.Any.fromFunction0(pre_step_callback))
    if (!js.isUndefined(prev_button)) __obj.updateDynamic("prev_button")(prev_button.asInstanceOf[js.Any])
    if (scroll_animation != null) __obj.updateDynamic("scroll_animation")(scroll_animation.asInstanceOf[js.Any])
    if (scroll_speed != null) __obj.updateDynamic("scroll_speed")(scroll_speed.asInstanceOf[js.Any])
    if (start_offset != null) __obj.updateDynamic("start_offset")(start_offset.asInstanceOf[js.Any])
    if (!js.isUndefined(start_timer_on_click)) __obj.updateDynamic("start_timer_on_click")(start_timer_on_click.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    if (tip_animation != null) __obj.updateDynamic("tip_animation")(tip_animation.asInstanceOf[js.Any])
    if (tip_animation_fade_speed != null) __obj.updateDynamic("tip_animation_fade_speed")(tip_animation_fade_speed.asInstanceOf[js.Any])
    if (tip_container != null) __obj.updateDynamic("tip_container")(tip_container.asInstanceOf[js.Any])
    if (tip_location != null) __obj.updateDynamic("tip_location")(tip_location.asInstanceOf[js.Any])
    if (tip_location_patterns != null) __obj.updateDynamic("tip_location_patterns")(tip_location_patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoyrideOptions]
  }
}

