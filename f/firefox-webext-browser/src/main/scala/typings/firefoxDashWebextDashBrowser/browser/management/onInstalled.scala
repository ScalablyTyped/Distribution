package typings.firefoxDashWebextDashBrowser.browser.management

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when an addon has been installed. */
@JSGlobal("browser.management.onInstalled")
@js.native
object onInstalled
  extends TopLevel[WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]]]

