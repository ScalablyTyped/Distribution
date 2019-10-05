package typings.firefoxDashWebextDashBrowser.browser.browserAction

import typings.firefoxDashWebextDashBrowser.Anon_Popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browserAction.setPopup")
@js.native
object setPopup extends js.Object {
  /**
    * Sets the html document to be opened as a popup when the user clicks on the browser action's icon.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be
    *     retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  def apply(details: Anon_Popup): js.Promise[Unit] = js.native
}

