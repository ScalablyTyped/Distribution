package typings.firefoxDashWebextDashBrowser.browser.devtools.panels

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.panels events */
/**
  * Fired when the devtools theme changes.
  * @param themeName The name of the current devtools theme.
  */
@JSGlobal("browser.devtools.panels.onThemeChanged")
@js.native
object onThemeChanged
  extends TopLevel[WebExtEvent[js.Function1[/* themeName */ String, Unit]]]

