package typings.firefoxWebextBrowser.browser.notifications

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user changes the permission level.
  * @param level The new permission level.
  * @deprecated Unsupported on Firefox at this time.
  */
@JSGlobal("browser.notifications.onPermissionLevelChanged")
@js.native
object onPermissionLevelChanged
  extends TopLevel[js.UndefOr[WebExtEvent[js.Function1[/* level */ PermissionLevel, Unit]]]]

