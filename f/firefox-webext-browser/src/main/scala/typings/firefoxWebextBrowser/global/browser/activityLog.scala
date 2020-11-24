package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.activityLog.ActivityLogOnExtensionActivityEvent
import typings.firefoxWebextBrowser.browser.activityLog.OnExtensionActivityDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  val onExtensionActivity: ActivityLogOnExtensionActivityEvent[js.Function1[/* details */ OnExtensionActivityDetails, Unit]] = js.native
}
