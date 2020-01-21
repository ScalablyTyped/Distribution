package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonIsWindowClosing
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a tab is closed. */
@JSGlobal("browser.tabs.onRemoved")
@js.native
object onRemoved
  extends TopLevel[
      WebExtEvent[js.Function2[/* tabId */ Double, /* removeInfo */ AnonIsWindowClosing, Unit]]
    ]

