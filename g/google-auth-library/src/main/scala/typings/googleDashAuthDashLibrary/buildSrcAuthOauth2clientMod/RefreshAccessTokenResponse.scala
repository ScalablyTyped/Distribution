package typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod

import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshAccessTokenResponse extends js.Object {
  var credentials: Credentials
  var res: GaxiosResponse[_] | Null
}

object RefreshAccessTokenResponse {
  @scala.inline
  def apply(credentials: Credentials, res: GaxiosResponse[_] = null): RefreshAccessTokenResponse = {
    val __obj = js.Dynamic.literal(credentials = credentials)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[RefreshAccessTokenResponse]
  }
}

