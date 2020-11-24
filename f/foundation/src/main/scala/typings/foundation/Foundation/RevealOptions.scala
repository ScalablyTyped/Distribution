package typings.foundation.Foundation

import typings.foundation.JQuery
import typings.foundation.anon.Close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevealOptions extends js.Object {
  
  var animation: js.UndefOr[String] = js.native
  
  var animation_speed: js.UndefOr[Double] = js.native
  
  var bg: js.UndefOr[JQuery] = js.native
  
  var bg_class: js.UndefOr[String] = js.native
  
  var close: js.UndefOr[js.Function0[_]] = js.native
  
  var close_on_background_click: js.UndefOr[Boolean] = js.native
  
  var closed: js.UndefOr[js.Function0[_]] = js.native
  
  var css: js.UndefOr[Close] = js.native
  
  var dismiss_modal_class: js.UndefOr[String] = js.native
  
  var multiple_opened: js.UndefOr[Boolean] = js.native
  
  var on_ajax_error: js.UndefOr[js.Function0[_]] = js.native
  
  var open: js.UndefOr[js.Function0[_]] = js.native
  
  var opened: js.UndefOr[js.Function0[_]] = js.native
  
  var root_element: js.UndefOr[String] = js.native
}
object RevealOptions {
  
  @scala.inline
  def apply(): RevealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevealOptions]
  }
  
  @scala.inline
  implicit class RevealOptionsOps[Self <: RevealOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAnimation_speed(value: Double): Self = this.set("animation_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation_speed: Self = this.set("animation_speed", js.undefined)
    
    @scala.inline
    def setBg(value: JQuery): Self = this.set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    
    @scala.inline
    def setBg_class(value: String): Self = this.set("bg_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBg_class: Self = this.set("bg_class", js.undefined)
    
    @scala.inline
    def setClose(value: () => _): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setClose_on_background_click(value: Boolean): Self = this.set("close_on_background_click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose_on_background_click: Self = this.set("close_on_background_click", js.undefined)
    
    @scala.inline
    def setClosed(value: () => _): Self = this.set("closed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    
    @scala.inline
    def setCss(value: Close): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setDismiss_modal_class(value: String): Self = this.set("dismiss_modal_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismiss_modal_class: Self = this.set("dismiss_modal_class", js.undefined)
    
    @scala.inline
    def setMultiple_opened(value: Boolean): Self = this.set("multiple_opened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple_opened: Self = this.set("multiple_opened", js.undefined)
    
    @scala.inline
    def setOn_ajax_error(value: () => _): Self = this.set("on_ajax_error", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOn_ajax_error: Self = this.set("on_ajax_error", js.undefined)
    
    @scala.inline
    def setOpen(value: () => _): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOpened(value: () => _): Self = this.set("opened", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
    
    @scala.inline
    def setRoot_element(value: String): Self = this.set("root_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot_element: Self = this.set("root_element", js.undefined)
  }
}
