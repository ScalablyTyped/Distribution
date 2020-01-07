package typings.googleapis.buildSrcApisIamcredentialsV1Mod.iamcredentials_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GenerateIdTokenResponse extends js.Object {
  /**
    * The OpenId Connect ID token.
    */
  var token: js.UndefOr[String] = js.native
}

object Schema$GenerateIdTokenResponse {
  @scala.inline
  def apply(token: String = null): Schema$GenerateIdTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GenerateIdTokenResponse]
  }
}

