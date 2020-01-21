package typings.firefoxWebextBrowser.browser.runtime

import typings.firefoxWebextBrowser.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.runtime.getBackgroundPage")
@js.native
object getBackgroundPage extends js.Object {
  /* runtime functions */
  /**
    * Retrieves the JavaScript 'window' object for the background page running inside the current extension/app. If
    * the background page is an event page, the system will ensure it is loaded before calling the callback. If there
    * is no background page, an error is set.
    */
  def apply(): js.Promise[Window] = js.native
}

