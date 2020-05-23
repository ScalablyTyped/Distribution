package typings.googleapisCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Oauth2 extends js.Object {
  var oauth2: Scopes
}

object Oauth2 {
  @scala.inline
  def apply(oauth2: Scopes): Oauth2 = {
    val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oauth2]
  }
}

