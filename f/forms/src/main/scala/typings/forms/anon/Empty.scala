package typings.forms.anon

import typings.forms.mod.Form
import typings.forms.mod.FormHandleCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Empty extends js.Object {
  
  var empty: js.UndefOr[FormHandleCallback] = js.native
  
  var error: js.UndefOr[FormHandleCallback] = js.native
  
  var other: js.UndefOr[FormHandleCallback] = js.native
  
  var success: js.UndefOr[FormHandleCallback] = js.native
}
object Empty {
  
  @scala.inline
  def apply(): Empty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Empty]
  }
  
  @scala.inline
  implicit class EmptyOps[Self <: Empty] (val x: Self) extends AnyVal {
    
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
    def setEmpty(value: /* form */ Form => Unit): Self = this.set("empty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setError(value: /* form */ Form => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setOther(value: /* form */ Form => Unit): Self = this.set("other", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* form */ Form => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
