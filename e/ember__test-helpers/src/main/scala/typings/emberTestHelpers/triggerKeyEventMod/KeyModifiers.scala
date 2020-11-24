package typings.emberTestHelpers.triggerKeyEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyModifiers extends js.Object {
  
  var altKey: js.UndefOr[Boolean] = js.native
  
  var ctrlKey: js.UndefOr[Boolean] = js.native
  
  var metaKey: js.UndefOr[Boolean] = js.native
  
  var shiftKey: js.UndefOr[Boolean] = js.native
}
object KeyModifiers {
  
  @scala.inline
  def apply(): KeyModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyModifiers]
  }
  
  @scala.inline
  implicit class KeyModifiersOps[Self <: KeyModifiers] (val x: Self) extends AnyVal {
    
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
    def setAltKey(value: Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltKey: Self = this.set("altKey", js.undefined)
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtrlKey: Self = this.set("ctrlKey", js.undefined)
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = this.set("metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaKey: Self = this.set("metaKey", js.undefined)
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShiftKey: Self = this.set("shiftKey", js.undefined)
  }
}
