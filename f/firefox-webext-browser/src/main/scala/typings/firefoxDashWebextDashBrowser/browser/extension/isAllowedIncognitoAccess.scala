package typings.firefoxDashWebextDashBrowser.browser.extension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.extension.isAllowedIncognitoAccess")
@js.native
object isAllowedIncognitoAccess extends js.Object {
  /**
    * Retrieves the state of the extension's access to Incognito-mode (as determined by the user-controlled 'Allowed
    * in Incognito' checkbox.
    */
  def apply(): js.Promise[Boolean] = js.native
}

