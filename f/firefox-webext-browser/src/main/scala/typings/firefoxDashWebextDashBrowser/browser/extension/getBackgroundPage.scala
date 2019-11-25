package typings.firefoxDashWebextDashBrowser.browser.extension

import typings.firefoxDashWebextDashBrowser.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.extension.getBackgroundPage")
@js.native
object getBackgroundPage extends js.Object {
  /**
    * Returns the JavaScript 'window' object for the background page running inside the current extension. Returns
    * null if the extension has no background page.
    */
  def apply(): Window | Unit = js.native
}

