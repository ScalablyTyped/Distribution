package typings.firefoxWebextBrowser.browser.management

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when an addon has been uninstalled. */
@JSGlobal("browser.management.onUninstalled")
@js.native
object onUninstalled
  extends TopLevel[WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]]]

