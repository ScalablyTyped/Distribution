package typings.foundation.Foundation

import typings.foundation.JQuery
import typings.foundation.anon.Close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevealOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
  
  var animation_speed: js.UndefOr[Double] = js.undefined
  
  var bg: js.UndefOr[JQuery] = js.undefined
  
  var bg_class: js.UndefOr[String] = js.undefined
  
  var close: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var close_on_background_click: js.UndefOr[Boolean] = js.undefined
  
  var closed: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var css: js.UndefOr[Close] = js.undefined
  
  var dismiss_modal_class: js.UndefOr[String] = js.undefined
  
  var multiple_opened: js.UndefOr[Boolean] = js.undefined
  
  var on_ajax_error: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var open: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var opened: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var root_element: js.UndefOr[String] = js.undefined
}
object RevealOptions {
  
  @scala.inline
  def apply(): RevealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevealOptions]
  }
  
  @scala.inline
  implicit class RevealOptionsMutableBuilder[Self <: RevealOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAnimation_speed(value: Double): Self = StObject.set(x, "animation_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation_speedUndefined: Self = StObject.set(x, "animation_speed", js.undefined)
    
    @scala.inline
    def setBg(value: JQuery): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    @scala.inline
    def setBg_class(value: String): Self = StObject.set(x, "bg_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBg_classUndefined: Self = StObject.set(x, "bg_class", js.undefined)
    
    @scala.inline
    def setClose(value: () => js.Any): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setClose_on_background_click(value: Boolean): Self = StObject.set(x, "close_on_background_click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose_on_background_clickUndefined: Self = StObject.set(x, "close_on_background_click", js.undefined)
    
    @scala.inline
    def setClosed(value: () => js.Any): Self = StObject.set(x, "closed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    @scala.inline
    def setCss(value: Close): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setDismiss_modal_class(value: String): Self = StObject.set(x, "dismiss_modal_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismiss_modal_classUndefined: Self = StObject.set(x, "dismiss_modal_class", js.undefined)
    
    @scala.inline
    def setMultiple_opened(value: Boolean): Self = StObject.set(x, "multiple_opened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiple_openedUndefined: Self = StObject.set(x, "multiple_opened", js.undefined)
    
    @scala.inline
    def setOn_ajax_error(value: () => js.Any): Self = StObject.set(x, "on_ajax_error", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn_ajax_errorUndefined: Self = StObject.set(x, "on_ajax_error", js.undefined)
    
    @scala.inline
    def setOpen(value: () => js.Any): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setOpened(value: () => js.Any): Self = StObject.set(x, "opened", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    @scala.inline
    def setRoot_element(value: String): Self = StObject.set(x, "root_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot_elementUndefined: Self = StObject.set(x, "root_element", js.undefined)
  }
}
