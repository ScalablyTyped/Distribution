package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/orbit.html#advanced
trait OrbitOptions extends StObject {
  
  var active_slide_class: js.UndefOr[String] = js.undefined
  
  var after_slide_change: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var animation: js.UndefOr[String] = js.undefined
  
  var animation_speed: js.UndefOr[Double] = js.undefined
  
  var before_slide_change: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var bullets: js.UndefOr[Boolean] = js.undefined
  
  var bullets_active_class: js.UndefOr[String] = js.undefined
  
  var bullets_container_class: js.UndefOr[String] = js.undefined
  
  var caption_class: js.UndefOr[String] = js.undefined
  
  var circular: js.UndefOr[Boolean] = js.undefined
  
  var container_class: js.UndefOr[String] = js.undefined
  
  var navigation_arrows: js.UndefOr[Boolean] = js.undefined
  
  var next_class: js.UndefOr[String] = js.undefined
  
  var next_on_click: js.UndefOr[Boolean] = js.undefined
  
  var orbit_transition_class: js.UndefOr[String] = js.undefined
  
  var pause_on_hover: js.UndefOr[Boolean] = js.undefined
  
  var preloader_class: js.UndefOr[String] = js.undefined
  
  var prev_class: js.UndefOr[String] = js.undefined
  
  var resume_on_mouseout: js.UndefOr[Boolean] = js.undefined
  
  var slide_number: js.UndefOr[Boolean] = js.undefined
  
  var slide_number_class: js.UndefOr[String] = js.undefined
  
  var slide_number_text: js.UndefOr[String] = js.undefined
  
  var slide_selector: js.UndefOr[String] = js.undefined
  
  var slides_container_class: js.UndefOr[String] = js.undefined
  
  var stack_on_small: js.UndefOr[Boolean] = js.undefined
  
  var stack_on_small_class: js.UndefOr[String] = js.undefined
  
  var swipe: js.UndefOr[Boolean] = js.undefined
  
  var timer: js.UndefOr[Boolean] = js.undefined
  
  var timer_container_class: js.UndefOr[String] = js.undefined
  
  var timer_paused_class: js.UndefOr[String] = js.undefined
  
  var timer_progress_class: js.UndefOr[String] = js.undefined
  
  var timer_speed: js.UndefOr[Double] = js.undefined
  
  var variable_height: js.UndefOr[Boolean] = js.undefined
}
object OrbitOptions {
  
  inline def apply(): OrbitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrbitOptions]
  }
  
  extension [Self <: OrbitOptions](x: Self) {
    
    inline def setActive_slide_class(value: String): Self = StObject.set(x, "active_slide_class", value.asInstanceOf[js.Any])
    
    inline def setActive_slide_classUndefined: Self = StObject.set(x, "active_slide_class", js.undefined)
    
    inline def setAfter_slide_change(value: () => Any): Self = StObject.set(x, "after_slide_change", js.Any.fromFunction0(value))
    
    inline def setAfter_slide_changeUndefined: Self = StObject.set(x, "after_slide_change", js.undefined)
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAnimation_speed(value: Double): Self = StObject.set(x, "animation_speed", value.asInstanceOf[js.Any])
    
    inline def setAnimation_speedUndefined: Self = StObject.set(x, "animation_speed", js.undefined)
    
    inline def setBefore_slide_change(value: () => Any): Self = StObject.set(x, "before_slide_change", js.Any.fromFunction0(value))
    
    inline def setBefore_slide_changeUndefined: Self = StObject.set(x, "before_slide_change", js.undefined)
    
    inline def setBullets(value: Boolean): Self = StObject.set(x, "bullets", value.asInstanceOf[js.Any])
    
    inline def setBulletsUndefined: Self = StObject.set(x, "bullets", js.undefined)
    
    inline def setBullets_active_class(value: String): Self = StObject.set(x, "bullets_active_class", value.asInstanceOf[js.Any])
    
    inline def setBullets_active_classUndefined: Self = StObject.set(x, "bullets_active_class", js.undefined)
    
    inline def setBullets_container_class(value: String): Self = StObject.set(x, "bullets_container_class", value.asInstanceOf[js.Any])
    
    inline def setBullets_container_classUndefined: Self = StObject.set(x, "bullets_container_class", js.undefined)
    
    inline def setCaption_class(value: String): Self = StObject.set(x, "caption_class", value.asInstanceOf[js.Any])
    
    inline def setCaption_classUndefined: Self = StObject.set(x, "caption_class", js.undefined)
    
    inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
    
    inline def setContainer_class(value: String): Self = StObject.set(x, "container_class", value.asInstanceOf[js.Any])
    
    inline def setContainer_classUndefined: Self = StObject.set(x, "container_class", js.undefined)
    
    inline def setNavigation_arrows(value: Boolean): Self = StObject.set(x, "navigation_arrows", value.asInstanceOf[js.Any])
    
    inline def setNavigation_arrowsUndefined: Self = StObject.set(x, "navigation_arrows", js.undefined)
    
    inline def setNext_class(value: String): Self = StObject.set(x, "next_class", value.asInstanceOf[js.Any])
    
    inline def setNext_classUndefined: Self = StObject.set(x, "next_class", js.undefined)
    
    inline def setNext_on_click(value: Boolean): Self = StObject.set(x, "next_on_click", value.asInstanceOf[js.Any])
    
    inline def setNext_on_clickUndefined: Self = StObject.set(x, "next_on_click", js.undefined)
    
    inline def setOrbit_transition_class(value: String): Self = StObject.set(x, "orbit_transition_class", value.asInstanceOf[js.Any])
    
    inline def setOrbit_transition_classUndefined: Self = StObject.set(x, "orbit_transition_class", js.undefined)
    
    inline def setPause_on_hover(value: Boolean): Self = StObject.set(x, "pause_on_hover", value.asInstanceOf[js.Any])
    
    inline def setPause_on_hoverUndefined: Self = StObject.set(x, "pause_on_hover", js.undefined)
    
    inline def setPreloader_class(value: String): Self = StObject.set(x, "preloader_class", value.asInstanceOf[js.Any])
    
    inline def setPreloader_classUndefined: Self = StObject.set(x, "preloader_class", js.undefined)
    
    inline def setPrev_class(value: String): Self = StObject.set(x, "prev_class", value.asInstanceOf[js.Any])
    
    inline def setPrev_classUndefined: Self = StObject.set(x, "prev_class", js.undefined)
    
    inline def setResume_on_mouseout(value: Boolean): Self = StObject.set(x, "resume_on_mouseout", value.asInstanceOf[js.Any])
    
    inline def setResume_on_mouseoutUndefined: Self = StObject.set(x, "resume_on_mouseout", js.undefined)
    
    inline def setSlide_number(value: Boolean): Self = StObject.set(x, "slide_number", value.asInstanceOf[js.Any])
    
    inline def setSlide_numberUndefined: Self = StObject.set(x, "slide_number", js.undefined)
    
    inline def setSlide_number_class(value: String): Self = StObject.set(x, "slide_number_class", value.asInstanceOf[js.Any])
    
    inline def setSlide_number_classUndefined: Self = StObject.set(x, "slide_number_class", js.undefined)
    
    inline def setSlide_number_text(value: String): Self = StObject.set(x, "slide_number_text", value.asInstanceOf[js.Any])
    
    inline def setSlide_number_textUndefined: Self = StObject.set(x, "slide_number_text", js.undefined)
    
    inline def setSlide_selector(value: String): Self = StObject.set(x, "slide_selector", value.asInstanceOf[js.Any])
    
    inline def setSlide_selectorUndefined: Self = StObject.set(x, "slide_selector", js.undefined)
    
    inline def setSlides_container_class(value: String): Self = StObject.set(x, "slides_container_class", value.asInstanceOf[js.Any])
    
    inline def setSlides_container_classUndefined: Self = StObject.set(x, "slides_container_class", js.undefined)
    
    inline def setStack_on_small(value: Boolean): Self = StObject.set(x, "stack_on_small", value.asInstanceOf[js.Any])
    
    inline def setStack_on_smallUndefined: Self = StObject.set(x, "stack_on_small", js.undefined)
    
    inline def setStack_on_small_class(value: String): Self = StObject.set(x, "stack_on_small_class", value.asInstanceOf[js.Any])
    
    inline def setStack_on_small_classUndefined: Self = StObject.set(x, "stack_on_small_class", js.undefined)
    
    inline def setSwipe(value: Boolean): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    inline def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
    
    inline def setTimer(value: Boolean): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
    
    inline def setTimer_container_class(value: String): Self = StObject.set(x, "timer_container_class", value.asInstanceOf[js.Any])
    
    inline def setTimer_container_classUndefined: Self = StObject.set(x, "timer_container_class", js.undefined)
    
    inline def setTimer_paused_class(value: String): Self = StObject.set(x, "timer_paused_class", value.asInstanceOf[js.Any])
    
    inline def setTimer_paused_classUndefined: Self = StObject.set(x, "timer_paused_class", js.undefined)
    
    inline def setTimer_progress_class(value: String): Self = StObject.set(x, "timer_progress_class", value.asInstanceOf[js.Any])
    
    inline def setTimer_progress_classUndefined: Self = StObject.set(x, "timer_progress_class", js.undefined)
    
    inline def setTimer_speed(value: Double): Self = StObject.set(x, "timer_speed", value.asInstanceOf[js.Any])
    
    inline def setTimer_speedUndefined: Self = StObject.set(x, "timer_speed", js.undefined)
    
    inline def setVariable_height(value: Boolean): Self = StObject.set(x, "variable_height", value.asInstanceOf[js.Any])
    
    inline def setVariable_heightUndefined: Self = StObject.set(x, "variable_height", js.undefined)
  }
}
