package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonFromIndex
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a tab is moved within a window. Only one move event is fired, representing the tab the user directly
  * moved. Move events are not fired for the other tabs that must move in response. This event is not fired when a
  * tab is moved between windows. For that, see `tabs.onDetached`.
  */
@JSGlobal("browser.tabs.onMoved")
@js.native
object onMoved
  extends TopLevel[
      WebExtEvent[js.Function2[/* tabId */ Double, /* moveInfo */ AnonFromIndex, Unit]]
    ]

