package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestMetadataResponse extends js.Object {
  var headers: Headers = js.native
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.native
}

object RequestMetadataResponse {
  @scala.inline
  def apply(headers: Headers): RequestMetadataResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMetadataResponse]
  }
  @scala.inline
  implicit class RequestMetadataResponseOps[Self <: RequestMetadataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: GaxiosResponse[Unit]): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRes: Self = this.set("res", js.undefined)
    @scala.inline
    def setResNull: Self = this.set("res", null)
  }
  
}

