package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/orbit.html#advanced
@js.native
trait OrbitOptions extends StObject {
  
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
  implicit class OrbitOptionsMutableBuilder[Self <: OrbitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive_slide_class(value: String): Self = StObject.set(x, "active_slide_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive_slide_classUndefined: Self = StObject.set(x, "active_slide_class", js.undefined)
    
    @scala.inline
    def setAfter_slide_change(value: () => _): Self = StObject.set(x, "after_slide_change", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfter_slide_changeUndefined: Self = StObject.set(x, "after_slide_change", js.undefined)
    
    @scala.inline
    def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAnimation_speed(value: Double): Self = StObject.set(x, "animation_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation_speedUndefined: Self = StObject.set(x, "animation_speed", js.undefined)
    
    @scala.inline
    def setBefore_slide_change(value: () => _): Self = StObject.set(x, "before_slide_change", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBefore_slide_changeUndefined: Self = StObject.set(x, "before_slide_change", js.undefined)
    
    @scala.inline
    def setBullets(value: Boolean): Self = StObject.set(x, "bullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletsUndefined: Self = StObject.set(x, "bullets", js.undefined)
    
    @scala.inline
    def setBullets_active_class(value: String): Self = StObject.set(x, "bullets_active_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBullets_active_classUndefined: Self = StObject.set(x, "bullets_active_class", js.undefined)
    
    @scala.inline
    def setBullets_container_class(value: String): Self = StObject.set(x, "bullets_container_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBullets_container_classUndefined: Self = StObject.set(x, "bullets_container_class", js.undefined)
    
    @scala.inline
    def setCaption_class(value: String): Self = StObject.set(x, "caption_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_classUndefined: Self = StObject.set(x, "caption_class", js.undefined)
    
    @scala.inline
    def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
    
    @scala.inline
    def setContainer_class(value: String): Self = StObject.set(x, "container_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer_classUndefined: Self = StObject.set(x, "container_class", js.undefined)
    
    @scala.inline
    def setNavigation_arrows(value: Boolean): Self = StObject.set(x, "navigation_arrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation_arrowsUndefined: Self = StObject.set(x, "navigation_arrows", js.undefined)
    
    @scala.inline
    def setNext_class(value: String): Self = StObject.set(x, "next_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_classUndefined: Self = StObject.set(x, "next_class", js.undefined)
    
    @scala.inline
    def setNext_on_click(value: Boolean): Self = StObject.set(x, "next_on_click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_on_clickUndefined: Self = StObject.set(x, "next_on_click", js.undefined)
    
    @scala.inline
    def setOrbit_transition_class(value: String): Self = StObject.set(x, "orbit_transition_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrbit_transition_classUndefined: Self = StObject.set(x, "orbit_transition_class", js.undefined)
    
    @scala.inline
    def setPause_on_hover(value: Boolean): Self = StObject.set(x, "pause_on_hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause_on_hoverUndefined: Self = StObject.set(x, "pause_on_hover", js.undefined)
    
    @scala.inline
    def setPreloader_class(value: String): Self = StObject.set(x, "preloader_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloader_classUndefined: Self = StObject.set(x, "preloader_class", js.undefined)
    
    @scala.inline
    def setPrev_class(value: String): Self = StObject.set(x, "prev_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev_classUndefined: Self = StObject.set(x, "prev_class", js.undefined)
    
    @scala.inline
    def setResume_on_mouseout(value: Boolean): Self = StObject.set(x, "resume_on_mouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume_on_mouseoutUndefined: Self = StObject.set(x, "resume_on_mouseout", js.undefined)
    
    @scala.inline
    def setSlide_number(value: Boolean): Self = StObject.set(x, "slide_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlide_numberUndefined: Self = StObject.set(x, "slide_number", js.undefined)
    
    @scala.inline
    def setSlide_number_class(value: String): Self = StObject.set(x, "slide_number_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlide_number_classUndefined: Self = StObject.set(x, "slide_number_class", js.undefined)
    
    @scala.inline
    def setSlide_number_text(value: String): Self = StObject.set(x, "slide_number_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlide_number_textUndefined: Self = StObject.set(x, "slide_number_text", js.undefined)
    
    @scala.inline
    def setSlide_selector(value: String): Self = StObject.set(x, "slide_selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlide_selectorUndefined: Self = StObject.set(x, "slide_selector", js.undefined)
    
    @scala.inline
    def setSlides_container_class(value: String): Self = StObject.set(x, "slides_container_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlides_container_classUndefined: Self = StObject.set(x, "slides_container_class", js.undefined)
    
    @scala.inline
    def setStack_on_small(value: Boolean): Self = StObject.set(x, "stack_on_small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack_on_smallUndefined: Self = StObject.set(x, "stack_on_small", js.undefined)
    
    @scala.inline
    def setStack_on_small_class(value: String): Self = StObject.set(x, "stack_on_small_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack_on_small_classUndefined: Self = StObject.set(x, "stack_on_small_class", js.undefined)
    
    @scala.inline
    def setSwipe(value: Boolean): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
    
    @scala.inline
    def setTimer(value: Boolean): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
    
    @scala.inline
    def setTimer_container_class(value: String): Self = StObject.set(x, "timer_container_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimer_container_classUndefined: Self = StObject.set(x, "timer_container_class", js.undefined)
    
    @scala.inline
    def setTimer_paused_class(value: String): Self = StObject.set(x, "timer_paused_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimer_paused_classUndefined: Self = StObject.set(x, "timer_paused_class", js.undefined)
    
    @scala.inline
    def setTimer_progress_class(value: String): Self = StObject.set(x, "timer_progress_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimer_progress_classUndefined: Self = StObject.set(x, "timer_progress_class", js.undefined)
    
    @scala.inline
    def setTimer_speed(value: Double): Self = StObject.set(x, "timer_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimer_speedUndefined: Self = StObject.set(x, "timer_speed", js.undefined)
    
    @scala.inline
    def setVariable_height(value: Boolean): Self = StObject.set(x, "variable_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable_heightUndefined: Self = StObject.set(x, "variable_height", js.undefined)
  }
}
