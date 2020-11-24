package typings.ethersprojectWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PollOptions extends js.Object {
  
  var ceiling: js.UndefOr[Double] = js.native
  
  var floor: js.UndefOr[Double] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var onceBlock: js.UndefOr[OnceBlockable] = js.native
  
  var oncePoll: js.UndefOr[OncePollable] = js.native
  
  var retryLimit: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object PollOptions {
  
  @scala.inline
  def apply(): PollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollOptions]
  }
  
  @scala.inline
  implicit class PollOptionsOps[Self <: PollOptions] (val x: Self) extends AnyVal {
    
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
    def setCeiling(value: Double): Self = this.set("ceiling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCeiling: Self = this.set("ceiling", js.undefined)
    
    @scala.inline
    def setFloor(value: Double): Self = this.set("floor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloor: Self = this.set("floor", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setOnceBlock(value: OnceBlockable): Self = this.set("onceBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnceBlock: Self = this.set("onceBlock", js.undefined)
    
    @scala.inline
    def setOncePoll(value: OncePollable): Self = this.set("oncePoll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncePoll: Self = this.set("oncePoll", js.undefined)
    
    @scala.inline
    def setRetryLimit(value: Double): Self = this.set("retryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryLimit: Self = this.set("retryLimit", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
