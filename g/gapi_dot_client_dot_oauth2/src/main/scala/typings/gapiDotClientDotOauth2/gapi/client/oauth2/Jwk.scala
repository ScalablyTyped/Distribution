package typings.gapiDotClientDotOauth2.gapi.client.oauth2

import typings.gapiDotClientDotOauth2.Anon_Alg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jwk extends js.Object {
  var keys: js.UndefOr[js.Array[Anon_Alg]] = js.undefined
}

object Jwk {
  @scala.inline
  def apply(keys: js.Array[Anon_Alg] = null): Jwk = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jwk]
  }
}

