package typings.firefoxWebextBrowser.browser.sessions

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* sessions events */
/**
  * Fired when recently closed tabs and/or windows are changed. This event does not monitor synced sessions changes.
  */
@JSGlobal("browser.sessions.onChanged")
@js.native
object onChanged
  extends TopLevel[WebExtEvent[js.Function0[Unit]]]

