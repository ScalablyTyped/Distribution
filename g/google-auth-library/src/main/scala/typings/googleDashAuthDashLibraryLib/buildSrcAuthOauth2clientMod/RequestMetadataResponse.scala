package typings
package googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMetadataResponse extends js.Object {
  var headers: Headers
  var res: js.UndefOr[gaxiosLib.buildSrcCommonMod.GaxiosResponse[scala.Unit] | scala.Null] = js.undefined
}

object RequestMetadataResponse {
  @scala.inline
  def apply(headers: Headers, res: gaxiosLib.buildSrcCommonMod.GaxiosResponse[scala.Unit] = null): RequestMetadataResponse = {
    val __obj = js.Dynamic.literal(headers = headers)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[RequestMetadataResponse]
  }
}

