package typings
package googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshAccessTokenResponse extends js.Object {
  var credentials: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.Credentials
  var res: gaxiosLib.buildSrcCommonMod.GaxiosResponse[_] | scala.Null
}

object RefreshAccessTokenResponse {
  @scala.inline
  def apply(
    credentials: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.Credentials,
    res: gaxiosLib.buildSrcCommonMod.GaxiosResponse[_] = null
  ): RefreshAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("credentials")(credentials)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[RefreshAccessTokenResponse]
  }
}

