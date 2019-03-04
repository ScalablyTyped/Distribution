package typings
package googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTokenResponse extends js.Object {
  var res: gaxiosLib.buildSrcCommonMod.GaxiosResponse[_] | scala.Null
  var tokens: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.Credentials
}

object GetTokenResponse {
  @scala.inline
  def apply(
    tokens: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.Credentials,
    res: gaxiosLib.buildSrcCommonMod.GaxiosResponse[_] = null
  ): GetTokenResponse = {
    val __obj = js.Dynamic.literal(tokens = tokens)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[GetTokenResponse]
  }
}

