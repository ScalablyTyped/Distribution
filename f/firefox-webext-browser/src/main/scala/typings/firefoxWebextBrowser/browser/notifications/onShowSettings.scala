package typings.firefoxWebextBrowser.browser.notifications

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user clicked on a link for the app's notification settings.
  * @deprecated Unsupported on Firefox at this time.
  */
@JSGlobal("browser.notifications.onShowSettings")
@js.native
object onShowSettings
  extends TopLevel[js.UndefOr[WebExtEvent[js.Function0[Unit]]]]

