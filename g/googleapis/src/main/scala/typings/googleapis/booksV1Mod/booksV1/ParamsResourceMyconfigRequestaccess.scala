package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMyconfigRequestaccess extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The device/version ID from which to request the restrictions.
    */
  var cpksver: js.UndefOr[String] = js.native
  /**
    * The type of access license to request. If not specified, the default is
    * BOTH.
    */
  var licenseTypes: js.UndefOr[String] = js.native
  /**
    * ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The client nonce value.
    */
  var nonce: js.UndefOr[String] = js.native
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The volume to request concurrent/download restrictions for.
    */
  var volumeId: js.UndefOr[String] = js.native
}

object ParamsResourceMyconfigRequestaccess {
  @scala.inline
  def apply(): ParamsResourceMyconfigRequestaccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMyconfigRequestaccess]
  }
  @scala.inline
  implicit class ParamsResourceMyconfigRequestaccessOps[Self <: ParamsResourceMyconfigRequestaccess] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setLicenseTypes(value: String): Self = this.set("licenseTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseTypes: Self = this.set("licenseTypes", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
  
}

