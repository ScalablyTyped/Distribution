package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Oauth2 extends js.Object {
  var oauth2: js.UndefOr[Anon_KeyScopes] = js.native
}

object Anon_Oauth2 {
  @scala.inline
  def apply(oauth2: Anon_KeyScopes = null): Anon_Oauth2 = {
    val __obj = js.Dynamic.literal()
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Oauth2]
  }
}

