package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.activityLog.ActivityLogOnExtensionActivityEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofactivityLog extends js.Object {
  /* activityLog events */
  /** Receives an activityItem for each logging event. */
  val onExtensionActivity: ActivityLogOnExtensionActivityEvent[js.Function1[/* details */ Data, Unit]] = js.native
}

object TypeofactivityLog {
  @scala.inline
  def apply(onExtensionActivity: ActivityLogOnExtensionActivityEvent[js.Function1[/* details */ Data, Unit]]): TypeofactivityLog = {
    val __obj = js.Dynamic.literal(onExtensionActivity = onExtensionActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofactivityLog]
  }
  @scala.inline
  implicit class TypeofactivityLogOps[Self <: TypeofactivityLog] (val x: Self) extends AnyVal {
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
    def setOnExtensionActivity(value: ActivityLogOnExtensionActivityEvent[js.Function1[/* details */ Data, Unit]]): Self = this.set("onExtensionActivity", value.asInstanceOf[js.Any])
  }
  
}

