package typings.expectPuppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures how to poll for an element.
  */
@js.native
trait ExpectTimingActions extends ExpectDefaultOptions {
  
  /**
    * delay to pass to the puppeteer element.type API
    */
  var delay: js.UndefOr[Double] = js.native
}
object ExpectTimingActions {
  
  @scala.inline
  def apply(): ExpectTimingActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpectTimingActions]
  }
  
  @scala.inline
  implicit class ExpectTimingActionsOps[Self <: ExpectTimingActions] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
  }
}
