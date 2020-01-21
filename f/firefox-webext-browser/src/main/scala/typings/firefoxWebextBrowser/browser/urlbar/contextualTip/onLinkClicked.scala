package typings.firefoxWebextBrowser.browser.urlbar.contextualTip

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user clicks the contextual tip's link.
  * @param windowId The id of the window where the contextual tip's link was clicked.
  */
@JSGlobal("browser.urlbar.contextualTip.onLinkClicked")
@js.native
object onLinkClicked
  extends TopLevel[WebExtEvent[js.Function1[/* windowId */ Double, Unit]]]

