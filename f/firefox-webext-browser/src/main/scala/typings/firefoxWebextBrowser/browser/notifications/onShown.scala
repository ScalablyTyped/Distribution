package typings.firefoxWebextBrowser.browser.notifications

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the notification is shown.
  * @param notificationId The notificationId of the shown notification.
  */
@JSGlobal("browser.notifications.onShown")
@js.native
object onShown
  extends TopLevel[WebExtEvent[js.Function1[/* notificationId */ String, Unit]]]

