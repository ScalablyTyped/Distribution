package typings.googleapis.buildSrcApisOauth2V2Mod.oauth2_v2

import typings.googleapis.Anon_Alg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Jwk extends js.Object {
  var keys: js.UndefOr[js.Array[Anon_Alg]] = js.native
}

object Schema$Jwk {
  @scala.inline
  def apply(keys: js.Array[Anon_Alg] = null): Schema$Jwk = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Jwk]
  }
}

