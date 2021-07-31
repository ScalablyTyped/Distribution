package typings.electron.Electron

import typings.electron.electronStrings.`abnormal-exit`
import typings.electron.electronStrings.`clean-exit`
import typings.electron.electronStrings.`integrity-failure`
import typings.electron.electronStrings.`launch-failed`
import typings.electron.electronStrings.crashed
import typings.electron.electronStrings.killed
import typings.electron.electronStrings.oom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderProcessGoneDetails extends StObject {
  
  /**
    * The reason the render process is gone.  Possible values:
    */
  var reason: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`
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
  implicit class RenderProcessGoneDetailsMutableBuilder[Self <: RenderProcessGoneDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(
      value: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`
    ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
