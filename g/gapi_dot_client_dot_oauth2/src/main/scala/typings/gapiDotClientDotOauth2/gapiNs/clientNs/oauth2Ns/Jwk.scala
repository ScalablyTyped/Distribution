package typings.gapiDotClientDotOauth2.gapiNs.clientNs.oauth2Ns

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
    if (keys != null) __obj.updateDynamic("keys")(keys)
    __obj.asInstanceOf[Jwk]
  }
}

