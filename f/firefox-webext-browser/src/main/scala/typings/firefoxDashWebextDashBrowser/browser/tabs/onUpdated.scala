package typings.firefoxDashWebextDashBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_Attention
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a tab is updated.
  * @param changeInfo Lists the changes to the state of the tab that was updated.
  * @param tab Gives the state of the tab that was updated.
  */
@JSGlobal("browser.tabs.onUpdated")
@js.native
object onUpdated
  extends TopLevel[
      _TabsOnUpdatedEvent[
        js.Function3[/* tabId */ Double, /* changeInfo */ Anon_Attention, /* tab */ Tab, Unit]
      ]
    ]

