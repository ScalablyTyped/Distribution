package typings.firefoxDashWebextDashBrowser.browser.identity

import typings.firefoxDashWebextDashBrowser.Anon_Email
import typings.firefoxDashWebextDashBrowser.Anon_Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.identity.removeCachedAuthToken")
@js.native
object removeCachedAuthToken extends js.Object {
  /**
    * Removes an OAuth2 access token from the Identity API's token cache.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(details: Anon_Token): js.Promise[Anon_Email] = js.native
}

