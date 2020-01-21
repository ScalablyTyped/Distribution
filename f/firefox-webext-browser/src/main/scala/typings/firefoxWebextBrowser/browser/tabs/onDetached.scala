package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonOldPosition
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a tab is detached from a window, for example because it is being moved between windows. */
@JSGlobal("browser.tabs.onDetached")
@js.native
object onDetached
  extends TopLevel[
      WebExtEvent[js.Function2[/* tabId */ Double, /* detachInfo */ AnonOldPosition, Unit]]
    ]

