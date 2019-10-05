package typings.firefoxDashWebextDashBrowser.browser.omnibox

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* omnibox events */
/**
  * User has started a keyword input session by typing the extension's keyword. This is guaranteed to be sent
  * exactly once per input session, and before any onInputChanged events.
  */
@JSGlobal("browser.omnibox.onInputStarted")
@js.native
object onInputStarted
  extends TopLevel[WebExtEvent[js.Function0[Unit]]]

