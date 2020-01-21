package typings.gapiClientDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOauth2 extends js.Object {
  /** OAuth 2.0 authentication information. */
  var oauth2: js.UndefOr[AnonScopes] = js.undefined
}

object AnonOauth2 {
  @scala.inline
  def apply(oauth2: AnonScopes = null): AnonOauth2 = {
    val __obj = js.Dynamic.literal()
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOauth2]
  }
}

