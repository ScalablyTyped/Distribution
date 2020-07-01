package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oauth2 extends js.Object {
  var oauth2: js.UndefOr[Scopes] = js.native
}

object Oauth2 {
  @scala.inline
  def apply(oauth2: Scopes = null): Oauth2 = {
    val __obj = js.Dynamic.literal()
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oauth2]
  }
}

