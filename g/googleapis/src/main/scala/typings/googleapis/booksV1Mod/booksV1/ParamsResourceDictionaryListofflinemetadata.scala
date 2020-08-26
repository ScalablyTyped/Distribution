package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDictionaryListofflinemetadata extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The device/version ID from which to request the data.
    */
  var cpksver: js.UndefOr[String] = js.native
}

object ParamsResourceDictionaryListofflinemetadata {
  @scala.inline
  def apply(): ParamsResourceDictionaryListofflinemetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDictionaryListofflinemetadata]
  }
  @scala.inline
  implicit class ParamsResourceDictionaryListofflinemetadataOps[Self <: ParamsResourceDictionaryListofflinemetadata] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCpksver(value: String): Self = this.set("cpksver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpksver: Self = this.set("cpksver", js.undefined)
  }
  
}

