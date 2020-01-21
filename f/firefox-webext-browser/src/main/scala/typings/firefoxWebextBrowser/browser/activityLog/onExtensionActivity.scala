package typings.firefoxWebextBrowser.browser.activityLog

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* activityLog events */
/** Receives an activityItem for each logging event. */
@JSGlobal("browser.activityLog.onExtensionActivity")
@js.native
object onExtensionActivity
  extends TopLevel[ActivityLogOnExtensionActivityEvent[js.Function1[/* details */ AnonData, Unit]]]

