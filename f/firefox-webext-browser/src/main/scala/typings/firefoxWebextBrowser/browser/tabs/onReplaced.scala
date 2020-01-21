package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a tab is replaced with another tab due to prerendering or instant. */
@JSGlobal("browser.tabs.onReplaced")
@js.native
object onReplaced
  extends TopLevel[
      WebExtEvent[js.Function2[/* addedTabId */ Double, /* removedTabId */ Double, Unit]]
    ]

