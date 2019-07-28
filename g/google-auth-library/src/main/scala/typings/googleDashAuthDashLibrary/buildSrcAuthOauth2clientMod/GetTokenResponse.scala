package typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod

import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTokenResponse extends js.Object {
  var res: GaxiosResponse[_] | Null
  var tokens: Credentials
}

object GetTokenResponse {
  @scala.inline
  def apply(tokens: Credentials, res: GaxiosResponse[_] = null): GetTokenResponse = {
    val __obj = js.Dynamic.literal(tokens = tokens)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[GetTokenResponse]
  }
}

