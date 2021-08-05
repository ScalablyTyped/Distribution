package typings.foundation.Foundation

import typings.foundation.anon.Bottom
import typings.foundation.anon.Button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/joyride.html#optional-javascript-configuration
trait JoyrideOptions extends StObject {
  
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
  
  var template: js.UndefOr[Button] = js.undefined
  
  var timer: js.UndefOr[Double] = js.undefined
  
  var tip_animation: js.UndefOr[String] = js.undefined
  
  var tip_animation_fade_speed: js.UndefOr[Double] = js.undefined
  
  var tip_container: js.UndefOr[String] = js.undefined
  
  var tip_location: js.UndefOr[String] = js.undefined
  
  var tip_location_patterns: js.UndefOr[Bottom] = js.undefined
}
object JoyrideOptions {
  
  inline def apply(): JoyrideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoyrideOptions]
  }
  
  extension [Self <: JoyrideOptions](x: Self) {
    
    inline def setCookie_domain(value: Boolean): Self = StObject.set(x, "cookie_domain", value.asInstanceOf[js.Any])
    
    inline def setCookie_domainUndefined: Self = StObject.set(x, "cookie_domain", js.undefined)
    
    inline def setCookie_expires(value: Double): Self = StObject.set(x, "cookie_expires", value.asInstanceOf[js.Any])
    
    inline def setCookie_expiresUndefined: Self = StObject.set(x, "cookie_expires", js.undefined)
    
    inline def setCookie_monster(value: Boolean): Self = StObject.set(x, "cookie_monster", value.asInstanceOf[js.Any])
    
    inline def setCookie_monsterUndefined: Self = StObject.set(x, "cookie_monster", js.undefined)
    
    inline def setCookie_name(value: String): Self = StObject.set(x, "cookie_name", value.asInstanceOf[js.Any])
    
    inline def setCookie_nameUndefined: Self = StObject.set(x, "cookie_name", js.undefined)
    
    inline def setExpose(value: Boolean): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
    
    inline def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
    
    inline def setExpose_add_class(value: String): Self = StObject.set(x, "expose_add_class", value.asInstanceOf[js.Any])
    
    inline def setExpose_add_classUndefined: Self = StObject.set(x, "expose_add_class", js.undefined)
    
    inline def setExposed(value: js.Array[String]): Self = StObject.set(x, "exposed", value.asInstanceOf[js.Any])
    
    inline def setExposedUndefined: Self = StObject.set(x, "exposed", js.undefined)
    
    inline def setExposedVarargs(value: String*): Self = StObject.set(x, "exposed", js.Array(value :_*))
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setNext_button(value: Boolean): Self = StObject.set(x, "next_button", value.asInstanceOf[js.Any])
    
    inline def setNext_buttonUndefined: Self = StObject.set(x, "next_button", js.undefined)
    
    inline def setNub_position(value: String): Self = StObject.set(x, "nub_position", value.asInstanceOf[js.Any])
    
    inline def setNub_positionUndefined: Self = StObject.set(x, "nub_position", js.undefined)
    
    inline def setPause_after(value: js.Array[Double]): Self = StObject.set(x, "pause_after", value.asInstanceOf[js.Any])
    
    inline def setPause_afterUndefined: Self = StObject.set(x, "pause_after", js.undefined)
    
    inline def setPause_afterVarargs(value: Double*): Self = StObject.set(x, "pause_after", js.Array(value :_*))
    
    inline def setPost_expose_callback(value: () => Unit): Self = StObject.set(x, "post_expose_callback", js.Any.fromFunction0(value))
    
    inline def setPost_expose_callbackUndefined: Self = StObject.set(x, "post_expose_callback", js.undefined)
    
    inline def setPost_ride_callback(value: () => Unit): Self = StObject.set(x, "post_ride_callback", js.Any.fromFunction0(value))
    
    inline def setPost_ride_callbackUndefined: Self = StObject.set(x, "post_ride_callback", js.undefined)
    
    inline def setPost_step_callback(value: () => Unit): Self = StObject.set(x, "post_step_callback", js.Any.fromFunction0(value))
    
    inline def setPost_step_callbackUndefined: Self = StObject.set(x, "post_step_callback", js.undefined)
    
    inline def setPre_ride_callback(value: () => Unit): Self = StObject.set(x, "pre_ride_callback", js.Any.fromFunction0(value))
    
    inline def setPre_ride_callbackUndefined: Self = StObject.set(x, "pre_ride_callback", js.undefined)
    
    inline def setPre_step_callback(value: () => Unit): Self = StObject.set(x, "pre_step_callback", js.Any.fromFunction0(value))
    
    inline def setPre_step_callbackUndefined: Self = StObject.set(x, "pre_step_callback", js.undefined)
    
    inline def setPrev_button(value: Boolean): Self = StObject.set(x, "prev_button", value.asInstanceOf[js.Any])
    
    inline def setPrev_buttonUndefined: Self = StObject.set(x, "prev_button", js.undefined)
    
    inline def setScroll_animation(value: String): Self = StObject.set(x, "scroll_animation", value.asInstanceOf[js.Any])
    
    inline def setScroll_animationUndefined: Self = StObject.set(x, "scroll_animation", js.undefined)
    
    inline def setScroll_speed(value: Double): Self = StObject.set(x, "scroll_speed", value.asInstanceOf[js.Any])
    
    inline def setScroll_speedUndefined: Self = StObject.set(x, "scroll_speed", js.undefined)
    
    inline def setStart_offset(value: Double): Self = StObject.set(x, "start_offset", value.asInstanceOf[js.Any])
    
    inline def setStart_offsetUndefined: Self = StObject.set(x, "start_offset", js.undefined)
    
    inline def setStart_timer_on_click(value: Boolean): Self = StObject.set(x, "start_timer_on_click", value.asInstanceOf[js.Any])
    
    inline def setStart_timer_on_clickUndefined: Self = StObject.set(x, "start_timer_on_click", js.undefined)
    
    inline def setTemplate(value: Button): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
    
    inline def setTip_animation(value: String): Self = StObject.set(x, "tip_animation", value.asInstanceOf[js.Any])
    
    inline def setTip_animationUndefined: Self = StObject.set(x, "tip_animation", js.undefined)
    
    inline def setTip_animation_fade_speed(value: Double): Self = StObject.set(x, "tip_animation_fade_speed", value.asInstanceOf[js.Any])
    
    inline def setTip_animation_fade_speedUndefined: Self = StObject.set(x, "tip_animation_fade_speed", js.undefined)
    
    inline def setTip_container(value: String): Self = StObject.set(x, "tip_container", value.asInstanceOf[js.Any])
    
    inline def setTip_containerUndefined: Self = StObject.set(x, "tip_container", js.undefined)
    
    inline def setTip_location(value: String): Self = StObject.set(x, "tip_location", value.asInstanceOf[js.Any])
    
    inline def setTip_locationUndefined: Self = StObject.set(x, "tip_location", js.undefined)
    
    inline def setTip_location_patterns(value: Bottom): Self = StObject.set(x, "tip_location_patterns", value.asInstanceOf[js.Any])
    
    inline def setTip_location_patternsUndefined: Self = StObject.set(x, "tip_location_patterns", js.undefined)
  }
}
