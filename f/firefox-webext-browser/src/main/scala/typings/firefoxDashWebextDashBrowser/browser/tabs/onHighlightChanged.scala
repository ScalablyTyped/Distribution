package typings.firefoxDashWebextDashBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_TabIds
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the highlighted or selected tabs in a window changes.
  * @deprecated Please use `tabs.onHighlighted`.
  */
@JSGlobal("browser.tabs.onHighlightChanged")
@js.native
object onHighlightChanged
  extends TopLevel[js.UndefOr[WebExtEvent[js.Function1[/* selectInfo */ Anon_TabIds, Unit]]]]

