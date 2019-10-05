package typings.firefoxDashWebextDashBrowser.browser.identity

import typings.firefoxDashWebextDashBrowser.Anon_Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.identity.getAuthToken")
@js.native
object getAuthToken extends js.Object {
  /**
    * Gets an OAuth2 access token using the client ID and scopes specified in the oauth2 section of manifest.json.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(): js.Promise[js.UndefOr[js.Array[AccountInfo]]] = js.native
  def apply(details: Anon_Account): js.Promise[js.UndefOr[js.Array[AccountInfo]]] = js.native
}

