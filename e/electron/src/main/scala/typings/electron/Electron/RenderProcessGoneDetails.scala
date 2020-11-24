package typings.electron.Electron

import typings.electron.electronStrings.`abnormal-exit`
import typings.electron.electronStrings.`clean-exit`
import typings.electron.electronStrings.`integrity-failure`
import typings.electron.electronStrings.`launch-failed`
import typings.electron.electronStrings.crashed
import typings.electron.electronStrings.killed
import typings.electron.electronStrings.oom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderProcessGoneDetails extends js.Object {
  
  /**
    * The reason the render process is gone.  Possible values:
    */
  var reason: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure` = js.native
}
object RenderProcessGoneDetails {
  
  @scala.inline
  def apply(
    reason: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`
  ): RenderProcessGoneDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProcessGoneDetails]
  }
  
  @scala.inline
  implicit class RenderProcessGoneDetailsOps[Self <: RenderProcessGoneDetails] (val x: Self) extends AnyVal {
    
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
    def setReason(
      value: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`
    ): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
