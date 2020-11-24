package typings.focusTrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<focus-trap.focus-trap.Options, 'onDeactivate'> */
@js.native
trait DeactivateOptions extends js.Object {
  
  var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.native
  
  var returnFocus: js.UndefOr[Boolean] = js.native
}
object DeactivateOptions {
  
  @scala.inline
  def apply(): DeactivateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeactivateOptions]
  }
  
  @scala.inline
  implicit class DeactivateOptionsOps[Self <: DeactivateOptions] (val x: Self) extends AnyVal {
    
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
    def setOnDeactivate(value: () => Unit): Self = this.set("onDeactivate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDeactivate: Self = this.set("onDeactivate", js.undefined)
    
    @scala.inline
    def setReturnFocus(value: Boolean): Self = this.set("returnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnFocus: Self = this.set("returnFocus", js.undefined)
  }
}
