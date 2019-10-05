package typings.firefoxDashWebextDashBrowser.browser.management

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* management events */
/** Fired when an addon has been disabled. */
@JSGlobal("browser.management.onDisabled")
@js.native
object onDisabled
  extends TopLevel[WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]]]

