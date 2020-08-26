package typings.foundation.Foundation

import typings.foundation.anon.Bottom
import typings.foundation.anon.Button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/joyride.html#optional-javascript-configuration
@js.native
trait JoyrideOptions extends js.Object {
  var cookie_domain: js.UndefOr[Boolean] = js.native
  var cookie_expires: js.UndefOr[Double] = js.native
  var cookie_monster: js.UndefOr[Boolean] = js.native
  var cookie_name: js.UndefOr[String] = js.native
  var expose: js.UndefOr[Boolean] = js.native
  var expose_add_class: js.UndefOr[String] = js.native
  var exposed: js.UndefOr[js.Array[String]] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var next_button: js.UndefOr[Boolean] = js.native
  var nub_position: js.UndefOr[String] = js.native
  var pause_after: js.UndefOr[js.Array[Double]] = js.native
  var post_expose_callback: js.UndefOr[js.Function0[Unit]] = js.native
  var post_ride_callback: js.UndefOr[js.Function0[Unit]] = js.native
  var post_step_callback: js.UndefOr[js.Function0[Unit]] = js.native
  var pre_ride_callback: js.UndefOr[js.Function0[Unit]] = js.native
  var pre_step_callback: js.UndefOr[js.Function0[Unit]] = js.native
  var prev_button: js.UndefOr[Boolean] = js.native
  var scroll_animation: js.UndefOr[String] = js.native
  var scroll_speed: js.UndefOr[Double] = js.native
  var start_offset: js.UndefOr[Double] = js.native
  var start_timer_on_click: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[Button] = js.native
  var timer: js.UndefOr[Double] = js.native
  var tip_animation: js.UndefOr[String] = js.native
  var tip_animation_fade_speed: js.UndefOr[Double] = js.native
  var tip_container: js.UndefOr[String] = js.native
  var tip_location: js.UndefOr[String] = js.native
  var tip_location_patterns: js.UndefOr[Bottom] = js.native
}

object JoyrideOptions {
  @scala.inline
  def apply(): JoyrideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoyrideOptions]
  }
  @scala.inline
  implicit class JoyrideOptionsOps[Self <: JoyrideOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCookie_domain(value: Boolean): Self = this.set("cookie_domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie_domain: Self = this.set("cookie_domain", js.undefined)
    @scala.inline
    def setCookie_expires(value: Double): Self = this.set("cookie_expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie_expires: Self = this.set("cookie_expires", js.undefined)
    @scala.inline
    def setCookie_monster(value: Boolean): Self = this.set("cookie_monster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie_monster: Self = this.set("cookie_monster", js.undefined)
    @scala.inline
    def setCookie_name(value: String): Self = this.set("cookie_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie_name: Self = this.set("cookie_name", js.undefined)
    @scala.inline
    def setExpose(value: Boolean): Self = this.set("expose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpose: Self = this.set("expose", js.undefined)
    @scala.inline
    def setExpose_add_class(value: String): Self = this.set("expose_add_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpose_add_class: Self = this.set("expose_add_class", js.undefined)
    @scala.inline
    def setExposedVarargs(value: String*): Self = this.set("exposed", js.Array(value :_*))
    @scala.inline
    def setExposed(value: js.Array[String]): Self = this.set("exposed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposed: Self = this.set("exposed", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setNext_button(value: Boolean): Self = this.set("next_button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext_button: Self = this.set("next_button", js.undefined)
    @scala.inline
    def setNub_position(value: String): Self = this.set("nub_position", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNub_position: Self = this.set("nub_position", js.undefined)
    @scala.inline
    def setPause_afterVarargs(value: Double*): Self = this.set("pause_after", js.Array(value :_*))
    @scala.inline
    def setPause_after(value: js.Array[Double]): Self = this.set("pause_after", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePause_after: Self = this.set("pause_after", js.undefined)
    @scala.inline
    def setPost_expose_callback(value: () => Unit): Self = this.set("post_expose_callback", js.Any.fromFunction0(value))
    @scala.inline
    def deletePost_expose_callback: Self = this.set("post_expose_callback", js.undefined)
    @scala.inline
    def setPost_ride_callback(value: () => Unit): Self = this.set("post_ride_callback", js.Any.fromFunction0(value))
    @scala.inline
    def deletePost_ride_callback: Self = this.set("post_ride_callback", js.undefined)
    @scala.inline
    def setPost_step_callback(value: () => Unit): Self = this.set("post_step_callback", js.Any.fromFunction0(value))
    @scala.inline
    def deletePost_step_callback: Self = this.set("post_step_callback", js.undefined)
    @scala.inline
    def setPre_ride_callback(value: () => Unit): Self = this.set("pre_ride_callback", js.Any.fromFunction0(value))
    @scala.inline
    def deletePre_ride_callback: Self = this.set("pre_ride_callback", js.undefined)
    @scala.inline
    def setPre_step_callback(value: () => Unit): Self = this.set("pre_step_callback", js.Any.fromFunction0(value))
    @scala.inline
    def deletePre_step_callback: Self = this.set("pre_step_callback", js.undefined)
    @scala.inline
    def setPrev_button(value: Boolean): Self = this.set("prev_button", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev_button: Self = this.set("prev_button", js.undefined)
    @scala.inline
    def setScroll_animation(value: String): Self = this.set("scroll_animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll_animation: Self = this.set("scroll_animation", js.undefined)
    @scala.inline
    def setScroll_speed(value: Double): Self = this.set("scroll_speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll_speed: Self = this.set("scroll_speed", js.undefined)
    @scala.inline
    def setStart_offset(value: Double): Self = this.set("start_offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_offset: Self = this.set("start_offset", js.undefined)
    @scala.inline
    def setStart_timer_on_click(value: Boolean): Self = this.set("start_timer_on_click", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_timer_on_click: Self = this.set("start_timer_on_click", js.undefined)
    @scala.inline
    def setTemplate(value: Button): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTimer(value: Double): Self = this.set("timer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
    @scala.inline
    def setTip_animation(value: String): Self = this.set("tip_animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTip_animation: Self = this.set("tip_animation", js.undefined)
    @scala.inline
    def setTip_animation_fade_speed(value: Double): Self = this.set("tip_animation_fade_speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTip_animation_fade_speed: Self = this.set("tip_animation_fade_speed", js.undefined)
    @scala.inline
    def setTip_container(value: String): Self = this.set("tip_container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTip_container: Self = this.set("tip_container", js.undefined)
    @scala.inline
    def setTip_location(value: String): Self = this.set("tip_location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTip_location: Self = this.set("tip_location", js.undefined)
    @scala.inline
    def setTip_location_patterns(value: Bottom): Self = this.set("tip_location_patterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTip_location_patterns: Self = this.set("tip_location_patterns", js.undefined)
  }
  
}

