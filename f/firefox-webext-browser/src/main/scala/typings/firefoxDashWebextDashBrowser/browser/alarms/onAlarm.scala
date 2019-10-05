package typings.firefoxDashWebextDashBrowser.browser.alarms

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* alarms events */
/**
  * Fired when an alarm has expired. Useful for transient background pages.
  * @param name The alarm that has expired.
  */
@JSGlobal("browser.alarms.onAlarm")
@js.native
object onAlarm
  extends TopLevel[WebExtEvent[js.Function1[/* name */ Alarm, Unit]]]

