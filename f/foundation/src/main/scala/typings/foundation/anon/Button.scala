package typings.foundation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button extends js.Object {
  
  var button: js.UndefOr[String] = js.native
  
  var expose: js.UndefOr[String] = js.native
  
  var expose_cover: js.UndefOr[String] = js.native
  
  var link: js.UndefOr[String] = js.native
  
  var modal: js.UndefOr[String] = js.native
  
  var prev_button: js.UndefOr[String] = js.native
  
  var timer: js.UndefOr[String] = js.native
  
  var tip: js.UndefOr[String] = js.native
  
  var wrapper: js.UndefOr[String] = js.native
}
object Button {
  
  @scala.inline
  def apply(): Button = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    
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
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setExpose(value: String): Self = this.set("expose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpose: Self = this.set("expose", js.undefined)
    
    @scala.inline
    def setExpose_cover(value: String): Self = this.set("expose_cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpose_cover: Self = this.set("expose_cover", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setModal(value: String): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setPrev_button(value: String): Self = this.set("prev_button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrev_button: Self = this.set("prev_button", js.undefined)
    
    @scala.inline
    def setTimer(value: String): Self = this.set("timer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
    
    @scala.inline
    def setTip(value: String): Self = this.set("tip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTip: Self = this.set("tip", js.undefined)
    
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
