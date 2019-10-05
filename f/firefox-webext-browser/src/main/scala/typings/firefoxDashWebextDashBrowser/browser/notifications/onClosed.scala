package typings.firefoxDashWebextDashBrowser.browser.notifications

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* notifications events */
/**
  * Fired when the notification closed, either by the system or by user action.
  * @param notificationId The notificationId of the closed notification.
  * @param byUser True if the notification was closed by the user.
  */
@JSGlobal("browser.notifications.onClosed")
@js.native
object onClosed
  extends TopLevel[
      WebExtEvent[js.Function2[/* notificationId */ String, /* byUser */ Boolean, Unit]]
    ]

