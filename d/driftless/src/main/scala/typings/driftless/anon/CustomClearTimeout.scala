package typings.driftless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomClearTimeout extends js.Object {
  
  var customClearTimeout: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
}
object CustomClearTimeout {
  
  @scala.inline
  def apply(): CustomClearTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomClearTimeout]
  }
  
  @scala.inline
  implicit class CustomClearTimeoutOps[Self <: CustomClearTimeout] (val x: Self) extends AnyVal {
    
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
    def setCustomClearTimeout(value: /* repeated */ js.Any => Unit): Self = this.set("customClearTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomClearTimeout: Self = this.set("customClearTimeout", js.undefined)
  }
}
