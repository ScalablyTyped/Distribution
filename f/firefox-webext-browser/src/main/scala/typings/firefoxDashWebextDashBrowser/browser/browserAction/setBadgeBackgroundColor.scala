package typings.firefoxDashWebextDashBrowser.browser.browserAction

import typings.firefoxDashWebextDashBrowser.Anon_ColorTabId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browserAction.setBadgeBackgroundColor")
@js.native
object setBadgeBackgroundColor extends js.Object {
  /**
    * Sets the background color for the badge.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be
    *     retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  def apply(details: Anon_ColorTabId): js.Promise[Unit] = js.native
}

