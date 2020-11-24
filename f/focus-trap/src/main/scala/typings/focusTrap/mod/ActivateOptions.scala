package typings.focusTrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<focus-trap.focus-trap.Options, 'onActivate'> */
@js.native
trait ActivateOptions extends js.Object {
  
  var onActivate: js.UndefOr[js.Function0[Unit]] = js.native
}
object ActivateOptions {
  
  @scala.inline
  def apply(): ActivateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivateOptions]
  }
  
  @scala.inline
  implicit class ActivateOptionsOps[Self <: ActivateOptions] (val x: Self) extends AnyVal {
    
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
    def setOnActivate(value: () => Unit): Self = this.set("onActivate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnActivate: Self = this.set("onActivate", js.undefined)
  }
}
