package typings.gapiClientOauth2.gapi.client.oauth2

import typings.gapiClientOauth2.AnonAlg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jwk extends js.Object {
  var keys: js.UndefOr[js.Array[AnonAlg]] = js.undefined
}

object Jwk {
  @scala.inline
  def apply(keys: js.Array[AnonAlg] = null): Jwk = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jwk]
  }
}

