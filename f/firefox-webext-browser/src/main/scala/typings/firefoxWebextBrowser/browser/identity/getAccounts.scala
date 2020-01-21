package typings.firefoxWebextBrowser.browser.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.identity.getAccounts")
@js.native
object getAccounts extends js.Object {
  /* identity functions */
  /**
    * Retrieves a list of AccountInfo objects describing the accounts present on the profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(): js.Promise[js.Array[AccountInfo]] = js.native
}

