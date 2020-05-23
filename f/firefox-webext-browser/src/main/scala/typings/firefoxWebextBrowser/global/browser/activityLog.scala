package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.anon.Data
import typings.firefoxWebextBrowser.browser.activityLog.ActivityLogOnExtensionActivityEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Monitor extension activity
  *
  * Permissions: `activityLog`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.activityLog")
@js.native
object activityLog extends js.Object {
  /* activityLog events */
  /** Receives an activityItem for each logging event. */
  val onExtensionActivity: ActivityLogOnExtensionActivityEvent[js.Function1[/* details */ Data, Unit]] = js.native
}

