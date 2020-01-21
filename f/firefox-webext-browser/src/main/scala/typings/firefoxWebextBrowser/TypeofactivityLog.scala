package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.activityLog.ActivityLogOnExtensionActivityEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofactivityLog extends js.Object {
  /* activityLog events */
  /** Receives an activityItem for each logging event. */
  val onExtensionActivity: ActivityLogOnExtensionActivityEvent[js.Function1[/* details */ AnonData, Unit]]
}

object TypeofactivityLog {
  @scala.inline
  def apply(
    onExtensionActivity: ActivityLogOnExtensionActivityEvent[js.Function1[/* details */ AnonData, Unit]]
  ): TypeofactivityLog = {
    val __obj = js.Dynamic.literal(onExtensionActivity = onExtensionActivity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofactivityLog]
  }
}

