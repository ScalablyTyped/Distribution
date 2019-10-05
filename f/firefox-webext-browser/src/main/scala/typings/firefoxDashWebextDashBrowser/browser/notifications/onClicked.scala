package typings.firefoxDashWebextDashBrowser.browser.notifications

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user clicked in a non-button area of the notification.
  * @param notificationId The notificationId of the clicked notification.
  */
@JSGlobal("browser.notifications.onClicked")
@js.native
object onClicked
  extends TopLevel[WebExtEvent[js.Function1[/* notificationId */ String, Unit]]]

