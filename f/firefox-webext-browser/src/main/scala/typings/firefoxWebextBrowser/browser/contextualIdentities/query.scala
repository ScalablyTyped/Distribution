package typings.firefoxWebextBrowser.browser.contextualIdentities

import typings.firefoxWebextBrowser.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.contextualIdentities.query")
@js.native
object query extends js.Object {
  /**
    * Retrieves all contextual identities
    * @param details Information to filter the contextual identities being retrieved.
    */
  def apply(details: AnonName): js.Promise[js.Array[ContextualIdentity]] = js.native
}

