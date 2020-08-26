package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/orbit.html#advanced
@js.native
trait OrbitOptions extends js.Object {
  var active_slide_class: js.UndefOr[String] = js.native
  var after_slide_change: js.UndefOr[js.Function0[_]] = js.native
  var animation: js.UndefOr[String] = js.native
  var animation_speed: js.UndefOr[Double] = js.native
  var before_slide_change: js.UndefOr[js.Function0[_]] = js.native
  var bullets: js.UndefOr[Boolean] = js.native
  var bullets_active_class: js.UndefOr[String] = js.native
  var bullets_container_class: js.UndefOr[String] = js.native
  var caption_class: js.UndefOr[String] = js.native
  var circular: js.UndefOr[Boolean] = js.native
  var container_class: js.UndefOr[String] = js.native
  var navigation_arrows: js.UndefOr[Boolean] = js.native
  var next_class: js.UndefOr[String] = js.native
  var next_on_click: js.UndefOr[Boolean] = js.native
  var orbit_transition_class: js.UndefOr[String] = js.native
  var pause_on_hover: js.UndefOr[Boolean] = js.native
  var preloader_class: js.UndefOr[String] = js.native
  var prev_class: js.UndefOr[String] = js.native
  var resume_on_mouseout: js.UndefOr[Boolean] = js.native
  var slide_number: js.UndefOr[Boolean] = js.native
  var slide_number_class: js.UndefOr[String] = js.native
  var slide_number_text: js.UndefOr[String] = js.native
  var slide_selector: js.UndefOr[String] = js.native
  var slides_container_class: js.UndefOr[String] = js.native
  var stack_on_small: js.UndefOr[Boolean] = js.native
  var stack_on_small_class: js.UndefOr[String] = js.native
  var swipe: js.UndefOr[Boolean] = js.native
  var timer: js.UndefOr[Boolean] = js.native
  var timer_container_class: js.UndefOr[String] = js.native
  var timer_paused_class: js.UndefOr[String] = js.native
  var timer_progress_class: js.UndefOr[String] = js.native
  var timer_speed: js.UndefOr[Double] = js.native
  var variable_height: js.UndefOr[Boolean] = js.native
}

object OrbitOptions {
  @scala.inline
  def apply(): OrbitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrbitOptions]
  }
  @scala.inline
  implicit class OrbitOptionsOps[Self <: OrbitOptions] (val x: Self) extends AnyVal {
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
    def setActive_slide_class(value: String): Self = this.set("active_slide_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive_slide_class: Self = this.set("active_slide_class", js.undefined)
    @scala.inline
    def setAfter_slide_change(value: () => _): Self = this.set("after_slide_change", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfter_slide_change: Self = this.set("after_slide_change", js.undefined)
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimation_speed(value: Double): Self = this.set("animation_speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation_speed: Self = this.set("animation_speed", js.undefined)
    @scala.inline
    def setBefore_slide_change(value: () => _): Self = this.set("before_slide_change", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBefore_slide_change: Self = this.set("before_slide_change", js.undefined)
    @scala.inline
    def setBullets(value: Boolean): Self = this.set("bullets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBullets: Self = this.set("bullets", js.undefined)
    @scala.inline
    def setBullets_active_class(value: String): Self = this.set("bullets_active_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBullets_active_class: Self = this.set("bullets_active_class", js.undefined)
    @scala.inline
    def setBullets_container_class(value: String): Self = this.set("bullets_container_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBullets_container_class: Self = this.set("bullets_container_class", js.undefined)
    @scala.inline
    def setCaption_class(value: String): Self = this.set("caption_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption_class: Self = this.set("caption_class", js.undefined)
    @scala.inline
    def setCircular(value: Boolean): Self = this.set("circular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    @scala.inline
    def setContainer_class(value: String): Self = this.set("container_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer_class: Self = this.set("container_class", js.undefined)
    @scala.inline
    def setNavigation_arrows(value: Boolean): Self = this.set("navigation_arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigation_arrows: Self = this.set("navigation_arrows", js.undefined)
    @scala.inline
    def setNext_class(value: String): Self = this.set("next_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext_class: Self = this.set("next_class", js.undefined)
    @scala.inline
    def setNext_on_click(value: Boolean): Self = this.set("next_on_click", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext_on_click: Self = this.set("next_on_click", js.undefined)
    @scala.inline
    def setOrbit_transition_class(value: String): Self = this.set("orbit_transition_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrbit_transition_class: Self = this.set("orbit_transition_class", js.undefined)
    @scala.inline
    def setPause_on_hover(value: Boolean): Self = this.set("pause_on_hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePause_on_hover: Self = this.set("pause_on_hover", js.undefined)
    @scala.inline
    def setPreloader_class(value: String): Self = this.set("preloader_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloader_class: Self = this.set("preloader_class", js.undefined)
    @scala.inline
    def setPrev_class(value: String): Self = this.set("prev_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev_class: Self = this.set("prev_class", js.undefined)
    @scala.inline
    def setResume_on_mouseout(value: Boolean): Self = this.set("resume_on_mouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResume_on_mouseout: Self = this.set("resume_on_mouseout", js.undefined)
    @scala.inline
    def setSlide_number(value: Boolean): Self = this.set("slide_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlide_number: Self = this.set("slide_number", js.undefined)
    @scala.inline
    def setSlide_number_class(value: String): Self = this.set("slide_number_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlide_number_class: Self = this.set("slide_number_class", js.undefined)
    @scala.inline
    def setSlide_number_text(value: String): Self = this.set("slide_number_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlide_number_text: Self = this.set("slide_number_text", js.undefined)
    @scala.inline
    def setSlide_selector(value: String): Self = this.set("slide_selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlide_selector: Self = this.set("slide_selector", js.undefined)
    @scala.inline
    def setSlides_container_class(value: String): Self = this.set("slides_container_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlides_container_class: Self = this.set("slides_container_class", js.undefined)
    @scala.inline
    def setStack_on_small(value: Boolean): Self = this.set("stack_on_small", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack_on_small: Self = this.set("stack_on_small", js.undefined)
    @scala.inline
    def setStack_on_small_class(value: String): Self = this.set("stack_on_small_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack_on_small_class: Self = this.set("stack_on_small_class", js.undefined)
    @scala.inline
    def setSwipe(value: Boolean): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipe: Self = this.set("swipe", js.undefined)
    @scala.inline
    def setTimer(value: Boolean): Self = this.set("timer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
    @scala.inline
    def setTimer_container_class(value: String): Self = this.set("timer_container_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimer_container_class: Self = this.set("timer_container_class", js.undefined)
    @scala.inline
    def setTimer_paused_class(value: String): Self = this.set("timer_paused_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimer_paused_class: Self = this.set("timer_paused_class", js.undefined)
    @scala.inline
    def setTimer_progress_class(value: String): Self = this.set("timer_progress_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimer_progress_class: Self = this.set("timer_progress_class", js.undefined)
    @scala.inline
    def setTimer_speed(value: Double): Self = this.set("timer_speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimer_speed: Self = this.set("timer_speed", js.undefined)
    @scala.inline
    def setVariable_height(value: Boolean): Self = this.set("variable_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariable_height: Self = this.set("variable_height", js.undefined)
  }
  
}

