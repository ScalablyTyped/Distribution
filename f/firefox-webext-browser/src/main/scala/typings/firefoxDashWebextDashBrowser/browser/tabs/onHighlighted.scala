package typings.firefoxDashWebextDashBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_TabIds
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when the highlighted or selected tabs in a window changes. */
@JSGlobal("browser.tabs.onHighlighted")
@js.native
object onHighlighted
  extends TopLevel[WebExtEvent[js.Function1[/* highlightInfo */ Anon_TabIds, Unit]]]

