package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusOptions extends js.Object {
  
  /**
    * Make the receiver the active app even if another app is currently active.
    *
    * @platform darwin
    */
  var steal: Boolean = js.native
}
object FocusOptions {
  
  @scala.inline
  def apply(steal: Boolean): FocusOptions = {
    val __obj = js.Dynamic.literal(steal = steal.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusOptions]
  }
  
  @scala.inline
  implicit class FocusOptionsOps[Self <: FocusOptions] (val x: Self) extends AnyVal {
    
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
    def setSteal(value: Boolean): Self = this.set("steal", value.asInstanceOf[js.Any])
  }
}
