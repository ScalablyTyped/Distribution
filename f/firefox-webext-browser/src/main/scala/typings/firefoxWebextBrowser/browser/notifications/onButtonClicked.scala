package typings.firefoxWebextBrowser.browser.notifications

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user pressed a button in the notification.
  * @param notificationId The notificationId of the clicked notification.
  * @param buttonIndex The index of the button clicked by the user.
  */
@JSGlobal("browser.notifications.onButtonClicked")
@js.native
object onButtonClicked
  extends TopLevel[
      WebExtEvent[js.Function2[/* notificationId */ String, /* buttonIndex */ Double, Unit]]
    ]

