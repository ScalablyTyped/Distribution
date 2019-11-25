package typings.firefoxDashWebextDashBrowser.browser.extension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.extension.isAllowedFileSchemeAccess")
@js.native
object isAllowedFileSchemeAccess extends js.Object {
  /**
    * Retrieves the state of the extension's access to the 'file://' scheme (as determined by the user-controlled
    * 'Allow access to File URLs' checkbox.
    */
  def apply(): js.Promise[Boolean] = js.native
}

