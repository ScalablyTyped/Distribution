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
  
  var close: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var close_on_background_click: js.UndefOr[Boolean] = js.undefined
  
  var closed: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var css: js.UndefOr[Close] = js.undefined
  
  var dismiss_modal_class: js.UndefOr[String] = js.undefined
  
  var multiple_opened: js.UndefOr[Boolean] = js.undefined
  
  var on_ajax_error: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var open: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var opened: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var root_element: js.UndefOr[String] = js.undefined
}
object RevealOptions {
  
  inline def apply(): RevealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevealOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevealOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAnimation_speed(value: Double): Self = StObject.set(x, "animation_speed", value.asInstanceOf[js.Any])
    
    inline def setAnimation_speedUndefined: Self = StObject.set(x, "animation_speed", js.undefined)
    
    inline def setBg(value: JQuery): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setBg_class(value: String): Self = StObject.set(x, "bg_class", value.asInstanceOf[js.Any])
    
    inline def setBg_classUndefined: Self = StObject.set(x, "bg_class", js.undefined)
    
    inline def setClose(value: () => Any): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setClose_on_background_click(value: Boolean): Self = StObject.set(x, "close_on_background_click", value.asInstanceOf[js.Any])
    
    inline def setClose_on_background_clickUndefined: Self = StObject.set(x, "close_on_background_click", js.undefined)
    
    inline def setClosed(value: () => Any): Self = StObject.set(x, "closed", js.Any.fromFunction0(value))
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setCss(value: Close): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setDismiss_modal_class(value: String): Self = StObject.set(x, "dismiss_modal_class", value.asInstanceOf[js.Any])
    
    inline def setDismiss_modal_classUndefined: Self = StObject.set(x, "dismiss_modal_class", js.undefined)
    
    inline def setMultiple_opened(value: Boolean): Self = StObject.set(x, "multiple_opened", value.asInstanceOf[js.Any])
    
    inline def setMultiple_openedUndefined: Self = StObject.set(x, "multiple_opened", js.undefined)
    
    inline def setOn_ajax_error(value: () => Any): Self = StObject.set(x, "on_ajax_error", js.Any.fromFunction0(value))
    
    inline def setOn_ajax_errorUndefined: Self = StObject.set(x, "on_ajax_error", js.undefined)
    
    inline def setOpen(value: () => Any): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOpened(value: () => Any): Self = StObject.set(x, "opened", js.Any.fromFunction0(value))
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    inline def setRoot_element(value: String): Self = StObject.set(x, "root_element", value.asInstanceOf[js.Any])
    
    inline def setRoot_elementUndefined: Self = StObject.set(x, "root_element", js.undefined)
  }
}
