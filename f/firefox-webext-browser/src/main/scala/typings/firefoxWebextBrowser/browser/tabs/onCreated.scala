package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tabs events */
/**
  * Fired when a tab is created. Note that the tab's URL may not be set at the time this event fired, but you can
  * listen to onUpdated events to be notified when a URL is set.
  * @param tab Details of the tab that was created.
  */
@JSGlobal("browser.tabs.onCreated")
@js.native
object onCreated
  extends TopLevel[WebExtEvent[js.Function1[/* tab */ Tab, Unit]]]

