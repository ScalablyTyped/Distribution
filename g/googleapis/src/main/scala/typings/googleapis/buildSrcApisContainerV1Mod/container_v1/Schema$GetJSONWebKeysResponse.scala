package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GetJSONWebKeysResponse is a valid JSON Web Key Set as specififed in rfc
  * 7517
  */
@js.native
trait Schema$GetJSONWebKeysResponse extends js.Object {
  /**
    * The public component of the keys used by the cluster to sign token
    * requests.
    */
  var keys: js.UndefOr[js.Array[Schema$Jwk]] = js.native
}

object Schema$GetJSONWebKeysResponse {
  @scala.inline
  def apply(keys: js.Array[Schema$Jwk] = null): Schema$GetJSONWebKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetJSONWebKeysResponse]
  }
}

