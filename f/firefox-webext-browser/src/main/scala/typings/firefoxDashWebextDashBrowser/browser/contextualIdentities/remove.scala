package typings.firefoxDashWebextDashBrowser.browser.contextualIdentities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.contextualIdentities.remove")
@js.native
object remove extends js.Object {
  /**
    * Deletes a contetual identity by its cookie Store ID.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def apply(cookieStoreId: String): js.Promise[ContextualIdentity] = js.native
}

