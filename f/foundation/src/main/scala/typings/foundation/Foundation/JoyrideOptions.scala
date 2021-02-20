package typings.foundation.Foundation

import typings.foundation.anon.Bottom
import typings.foundation.anon.Button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/joyride.html#optional-javascript-configuration
@js.native
trait JoyrideOptions extends StObject {
  
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
  implicit class JoyrideOptionsMutableBuilder[Self <: JoyrideOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookie_domain(value: Boolean): Self = StObject.set(x, "cookie_domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookie_domainUndefined: Self = StObject.set(x, "cookie_domain", js.undefined)
    
    @scala.inline
    def setCookie_expires(value: Double): Self = StObject.set(x, "cookie_expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookie_expiresUndefined: Self = StObject.set(x, "cookie_expires", js.undefined)
    
    @scala.inline
    def setCookie_monster(value: Boolean): Self = StObject.set(x, "cookie_monster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookie_monsterUndefined: Self = StObject.set(x, "cookie_monster", js.undefined)
    
    @scala.inline
    def setCookie_name(value: String): Self = StObject.set(x, "cookie_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookie_nameUndefined: Self = StObject.set(x, "cookie_name", js.undefined)
    
    @scala.inline
    def setExpose(value: Boolean): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
    
    @scala.inline
    def setExpose_add_class(value: String): Self = StObject.set(x, "expose_add_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpose_add_classUndefined: Self = StObject.set(x, "expose_add_class", js.undefined)
    
    @scala.inline
    def setExposed(value: js.Array[String]): Self = StObject.set(x, "exposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposedUndefined: Self = StObject.set(x, "exposed", js.undefined)
    
    @scala.inline
    def setExposedVarargs(value: String*): Self = StObject.set(x, "exposed", js.Array(value :_*))
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setNext_button(value: Boolean): Self = StObject.set(x, "next_button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_buttonUndefined: Self = StObject.set(x, "next_button", js.undefined)
    
    @scala.inline
    def setNub_position(value: String): Self = StObject.set(x, "nub_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNub_positionUndefined: Self = StObject.set(x, "nub_position", js.undefined)
    
    @scala.inline
    def setPause_after(value: js.Array[Double]): Self = StObject.set(x, "pause_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause_afterUndefined: Self = StObject.set(x, "pause_after", js.undefined)
    
    @scala.inline
    def setPause_afterVarargs(value: Double*): Self = StObject.set(x, "pause_after", js.Array(value :_*))
    
    @scala.inline
    def setPost_expose_callback(value: () => Unit): Self = StObject.set(x, "post_expose_callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPost_expose_callbackUndefined: Self = StObject.set(x, "post_expose_callback", js.undefined)
    
    @scala.inline
    def setPost_ride_callback(value: () => Unit): Self = StObject.set(x, "post_ride_callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPost_ride_callbackUndefined: Self = StObject.set(x, "post_ride_callback", js.undefined)
    
    @scala.inline
    def setPost_step_callback(value: () => Unit): Self = StObject.set(x, "post_step_callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPost_step_callbackUndefined: Self = StObject.set(x, "post_step_callback", js.undefined)
    
    @scala.inline
    def setPre_ride_callback(value: () => Unit): Self = StObject.set(x, "pre_ride_callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPre_ride_callbackUndefined: Self = StObject.set(x, "pre_ride_callback", js.undefined)
    
    @scala.inline
    def setPre_step_callback(value: () => Unit): Self = StObject.set(x, "pre_step_callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPre_step_callbackUndefined: Self = StObject.set(x, "pre_step_callback", js.undefined)
    
    @scala.inline
    def setPrev_button(value: Boolean): Self = StObject.set(x, "prev_button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev_buttonUndefined: Self = StObject.set(x, "prev_button", js.undefined)
    
    @scala.inline
    def setScroll_animation(value: String): Self = StObject.set(x, "scroll_animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll_animationUndefined: Self = StObject.set(x, "scroll_animation", js.undefined)
    
    @scala.inline
    def setScroll_speed(value: Double): Self = StObject.set(x, "scroll_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll_speedUndefined: Self = StObject.set(x, "scroll_speed", js.undefined)
    
    @scala.inline
    def setStart_offset(value: Double): Self = StObject.set(x, "start_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_offsetUndefined: Self = StObject.set(x, "start_offset", js.undefined)
    
    @scala.inline
    def setStart_timer_on_click(value: Boolean): Self = StObject.set(x, "start_timer_on_click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_timer_on_clickUndefined: Self = StObject.set(x, "start_timer_on_click", js.undefined)
    
    @scala.inline
    def setTemplate(value: Button): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
    
    @scala.inline
    def setTip_animation(value: String): Self = StObject.set(x, "tip_animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTip_animationUndefined: Self = StObject.set(x, "tip_animation", js.undefined)
    
    @scala.inline
    def setTip_animation_fade_speed(value: Double): Self = StObject.set(x, "tip_animation_fade_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTip_animation_fade_speedUndefined: Self = StObject.set(x, "tip_animation_fade_speed", js.undefined)
    
    @scala.inline
    def setTip_container(value: String): Self = StObject.set(x, "tip_container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTip_containerUndefined: Self = StObject.set(x, "tip_container", js.undefined)
    
    @scala.inline
    def setTip_location(value: String): Self = StObject.set(x, "tip_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTip_locationUndefined: Self = StObject.set(x, "tip_location", js.undefined)
    
    @scala.inline
    def setTip_location_patterns(value: Bottom): Self = StObject.set(x, "tip_location_patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTip_location_patternsUndefined: Self = StObject.set(x, "tip_location_patterns", js.undefined)
  }
}
