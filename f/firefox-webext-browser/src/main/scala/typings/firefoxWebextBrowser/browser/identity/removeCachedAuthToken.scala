package typings.firefoxWebextBrowser.browser.identity

import typings.firefoxWebextBrowser.AnonEmail
import typings.firefoxWebextBrowser.AnonToken
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
  def apply(details: AnonToken): js.Promise[AnonEmail] = js.native
}

