package typings.firefoxDashWebextDashBrowser.browser.history

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_AllHistory
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when one or more URLs are removed from the history service. When all visits have been removed the URL is
  * purged from history.
  */
@JSGlobal("browser.history.onVisitRemoved")
@js.native
object onVisitRemoved
  extends TopLevel[WebExtEvent[js.Function1[/* removed */ Anon_AllHistory, Unit]]]

