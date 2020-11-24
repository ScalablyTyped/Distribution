package typings.focusLock.siblingMod

import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusNextOptions extends js.Object {
  
  var cycle: js.UndefOr[Boolean] = js.native
  
  var scope: js.UndefOr[HTMLElement | HTMLDocument] = js.native
}
object FocusNextOptions {
  
  @scala.inline
  def apply(): FocusNextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusNextOptions]
  }
  
  @scala.inline
  implicit class FocusNextOptionsOps[Self <: FocusNextOptions] (val x: Self) extends AnyVal {
    
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
    def setCycle(value: Boolean): Self = this.set("cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCycle: Self = this.set("cycle", js.undefined)
    
    @scala.inline
    def setScope(value: HTMLElement | HTMLDocument): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
