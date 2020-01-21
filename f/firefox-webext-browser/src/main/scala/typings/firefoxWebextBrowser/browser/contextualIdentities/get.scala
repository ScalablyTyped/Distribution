package typings.firefoxWebextBrowser.browser.contextualIdentities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.contextualIdentities.get")
@js.native
object get extends js.Object {
  /* contextualIdentities functions */
  /**
    * Retrieves information about a single contextual identity.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def apply(cookieStoreId: String): js.Promise[ContextualIdentity] = js.native
}

