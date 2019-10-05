package typings.firefoxDashWebextDashBrowser.browser.history

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* history events */
/**
  * Fired when a URL is visited, providing the HistoryItem data for that URL. This event fires before the page has
  * loaded.
  */
@JSGlobal("browser.history.onVisited")
@js.native
object onVisited
  extends TopLevel[WebExtEvent[js.Function1[/* result */ HistoryItem, Unit]]]

