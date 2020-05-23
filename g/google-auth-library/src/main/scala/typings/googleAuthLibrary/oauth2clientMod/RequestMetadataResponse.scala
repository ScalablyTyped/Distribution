package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMetadataResponse extends js.Object {
  var headers: Headers
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.undefined
}

object RequestMetadataResponse {
  @scala.inline
  def apply(headers: Headers, res: js.UndefOr[Null | GaxiosResponse[Unit]] = js.undefined): RequestMetadataResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (!js.isUndefined(res)) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMetadataResponse]
  }
}

