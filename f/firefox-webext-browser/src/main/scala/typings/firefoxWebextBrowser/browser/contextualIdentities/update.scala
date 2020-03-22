package typings.firefoxWebextBrowser.browser.contextualIdentities

import typings.firefoxWebextBrowser.AnonIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.contextualIdentities.update")
@js.native
object update extends js.Object {
  /**
    * Updates a contextual identity with the given data.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    * @param details Details about the contextual identity being created.
    */
  def apply(cookieStoreId: String, details: AnonIcon): js.Promise[ContextualIdentity] = js.native
}

