package typings.firefoxDashWebextDashBrowser.browser.management

import typings.firefoxDashWebextDashBrowser.browser._manifest.ExtensionID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.management.get")
@js.native
object get extends js.Object {
  /**
    * Returns information about the installed extension that has the given ID.
    * @param id The ID from an item of `management.ExtensionInfo`.
    */
  def apply(id: ExtensionID): js.Promise[ExtensionInfo] = js.native
}

