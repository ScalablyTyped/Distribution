package typings.gapiDotClientDotDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Oauth2 extends js.Object {
  /** OAuth 2.0 authentication information. */
  var oauth2: js.UndefOr[Anon_Scopes] = js.undefined
}

object Anon_Oauth2 {
  @scala.inline
  def apply(oauth2: Anon_Scopes = null): Anon_Oauth2 = {
    val __obj = js.Dynamic.literal()
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Oauth2]
  }
}

