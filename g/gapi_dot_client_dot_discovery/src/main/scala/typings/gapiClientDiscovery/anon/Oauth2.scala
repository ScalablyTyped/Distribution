package typings.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Oauth2 extends js.Object {
  /** OAuth 2.0 authentication information. */
  var oauth2: js.UndefOr[Scopes] = js.undefined
}

object Oauth2 {
  @scala.inline
  def apply(oauth2: Scopes = null): Oauth2 = {
    val __obj = js.Dynamic.literal()
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oauth2]
  }
}

