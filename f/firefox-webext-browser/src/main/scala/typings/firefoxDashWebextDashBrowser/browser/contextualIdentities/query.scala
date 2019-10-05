package typings.firefoxDashWebextDashBrowser.browser.contextualIdentities

import typings.firefoxDashWebextDashBrowser.Anon_Name
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
  def apply(details: Anon_Name): js.Promise[js.Array[ContextualIdentity]] = js.native
}

