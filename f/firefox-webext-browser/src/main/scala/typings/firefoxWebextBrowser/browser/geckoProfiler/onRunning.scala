package typings.firefoxWebextBrowser.browser.geckoProfiler

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* geckoProfiler events */
/**
  * Fires when the profiler starts/stops running.
  * @param isRunning Whether the profiler is running or not. Pausing the profiler will not affect this value.
  */
@JSGlobal("browser.geckoProfiler.onRunning")
@js.native
object onRunning
  extends TopLevel[WebExtEvent[js.Function1[/* isRunning */ Boolean, Unit]]]

