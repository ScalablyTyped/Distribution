package typings.googleapis.buildSrcApisIamcredentialsV1Mod.iamcredentials_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SignJwtResponse extends js.Object {
  /**
    * The ID of the key used to sign the JWT.
    */
  var keyId: js.UndefOr[String] = js.native
  /**
    * The signed JWT.
    */
  var signedJwt: js.UndefOr[String] = js.native
}

object Schema$SignJwtResponse {
  @scala.inline
  def apply(keyId: String = null, signedJwt: String = null): Schema$SignJwtResponse = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (signedJwt != null) __obj.updateDynamic("signedJwt")(signedJwt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SignJwtResponse]
  }
}

