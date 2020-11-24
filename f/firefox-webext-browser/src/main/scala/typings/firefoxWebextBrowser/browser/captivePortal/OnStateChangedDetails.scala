package typings.firefoxWebextBrowser.browser.captivePortal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnStateChangedDetails extends js.Object {
  
  /** The current captive portal state. */
  var state: OnStateChangedDetailsState = js.native
}
object OnStateChangedDetails {
  
  @scala.inline
  def apply(state: OnStateChangedDetailsState): OnStateChangedDetails = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnStateChangedDetails]
  }
  
  @scala.inline
  implicit class OnStateChangedDetailsOps[Self <: OnStateChangedDetails] (val x: Self) extends AnyVal {
    
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
    def setState(value: OnStateChangedDetailsState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
