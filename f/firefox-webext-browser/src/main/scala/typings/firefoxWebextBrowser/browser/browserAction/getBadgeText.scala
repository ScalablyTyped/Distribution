package typings.firefoxWebextBrowser.browser.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browserAction.getBadgeText")
@js.native
object getBadgeText extends js.Object {
  /**
    * Gets the badge text of the browser action. If no tab nor window is specified is specified, the global badge text
    * is returned.
    */
  def apply(details: Details): js.Promise[String] = js.native
}

