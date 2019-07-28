package typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod

import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMetadataResponse extends js.Object {
  var headers: Headers
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.undefined
}

object RequestMetadataResponse {
  @scala.inline
  def apply(headers: Headers, res: GaxiosResponse[Unit] = null): RequestMetadataResponse = {
    val __obj = js.Dynamic.literal(headers = headers)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[RequestMetadataResponse]
  }
}

