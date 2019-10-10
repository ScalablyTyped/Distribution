package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.activityLog._ActivityLogOnExtensionActivityEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofactivityLog extends js.Object {
  /* activityLog events */
  /** Receives an activityItem for each logging event. */
  val onExtensionActivity: _ActivityLogOnExtensionActivityEvent[js.Function1[/* details */ Anon_Data, Unit]]
}

object TypeofactivityLog {
  @scala.inline
  def apply(
    onExtensionActivity: _ActivityLogOnExtensionActivityEvent[js.Function1[/* details */ Anon_Data, Unit]]
  ): TypeofactivityLog = {
    val __obj = js.Dynamic.literal(onExtensionActivity = onExtensionActivity)
  
    __obj.asInstanceOf[TypeofactivityLog]
  }
}

