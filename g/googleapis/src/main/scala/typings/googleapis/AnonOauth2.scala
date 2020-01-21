package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOauth2 extends js.Object {
  var oauth2: js.UndefOr[AnonKeyScopes] = js.native
}

object AnonOauth2 {
  @scala.inline
  def apply(oauth2: AnonKeyScopes = null): AnonOauth2 = {
    val __obj = js.Dynamic.literal()
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOauth2]
  }
}

