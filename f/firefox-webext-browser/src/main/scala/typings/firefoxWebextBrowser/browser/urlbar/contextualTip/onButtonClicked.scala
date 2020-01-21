package typings.firefoxWebextBrowser.browser.urlbar.contextualTip

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* urlbar.contextualTip events */
/**
  * Fired when the user clicks the contextual tip's button.
  * @param windowId The id of the window where the contextual tip's button was clicked.
  */
@JSGlobal("browser.urlbar.contextualTip.onButtonClicked")
@js.native
object onButtonClicked
  extends TopLevel[WebExtEvent[js.Function1[/* windowId */ Double, Unit]]]

