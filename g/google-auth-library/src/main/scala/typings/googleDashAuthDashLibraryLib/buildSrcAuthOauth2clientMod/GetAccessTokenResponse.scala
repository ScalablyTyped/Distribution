package typings
package googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccessTokenResponse extends js.Object {
  var res: js.UndefOr[gaxiosLib.buildSrcCommonMod.GaxiosResponse[_] | scala.Null] = js.undefined
  var token: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object GetAccessTokenResponse {
  @scala.inline
  def apply(res: gaxiosLib.buildSrcCommonMod.GaxiosResponse[_] = null, token: java.lang.String = null): GetAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (res != null) __obj.updateDynamic("res")(res)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[GetAccessTokenResponse]
  }
}

