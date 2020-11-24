package typings.emberTestHelpers.waitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaitOptions extends js.Object {
  
  var waitForAJAX: js.UndefOr[Boolean] = js.native
  
  var waitForTimers: js.UndefOr[Boolean] = js.native
  
  var waitForWaiters: js.UndefOr[Boolean] = js.native
}
object WaitOptions {
  
  @scala.inline
  def apply(): WaitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitOptions]
  }
  
  @scala.inline
  implicit class WaitOptionsOps[Self <: WaitOptions] (val x: Self) extends AnyVal {
    
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
    def setWaitForAJAX(value: Boolean): Self = this.set("waitForAJAX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForAJAX: Self = this.set("waitForAJAX", js.undefined)
    
    @scala.inline
    def setWaitForTimers(value: Boolean): Self = this.set("waitForTimers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForTimers: Self = this.set("waitForTimers", js.undefined)
    
    @scala.inline
    def setWaitForWaiters(value: Boolean): Self = this.set("waitForWaiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForWaiters: Self = this.set("waitForWaiters", js.undefined)
  }
}
