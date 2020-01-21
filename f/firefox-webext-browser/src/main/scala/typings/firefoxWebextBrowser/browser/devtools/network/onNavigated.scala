package typings.firefoxWebextBrowser.browser.devtools.network

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the inspected window navigates to a new page.
  * @param url URL of the new page.
  */
@JSGlobal("browser.devtools.network.onNavigated")
@js.native
object onNavigated
  extends TopLevel[WebExtEvent[js.Function1[/* url */ String, Unit]]]

