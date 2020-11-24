package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/accordion.html#optional-javascript-configuration
@js.native
trait AccordionOptions extends js.Object {
  
  var active_class: js.UndefOr[String] = js.native
  
  var callback: js.UndefOr[js.Function0[_]] = js.native
  
  var content_class: js.UndefOr[String] = js.native
  
  var multi_expand: js.UndefOr[Boolean] = js.native
  
  var toggleable: js.UndefOr[Boolean] = js.native
}
object AccordionOptions {
  
  @scala.inline
  def apply(): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionOptions]
  }
  
  @scala.inline
  implicit class AccordionOptionsOps[Self <: AccordionOptions] (val x: Self) extends AnyVal {
    
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
    def setActive_class(value: String): Self = this.set("active_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive_class: Self = this.set("active_class", js.undefined)
    
    @scala.inline
    def setCallback(value: () => _): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setContent_class(value: String): Self = this.set("content_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_class: Self = this.set("content_class", js.undefined)
    
    @scala.inline
    def setMulti_expand(value: Boolean): Self = this.set("multi_expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti_expand: Self = this.set("multi_expand", js.undefined)
    
    @scala.inline
    def setToggleable(value: Boolean): Self = this.set("toggleable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleable: Self = this.set("toggleable", js.undefined)
  }
}
